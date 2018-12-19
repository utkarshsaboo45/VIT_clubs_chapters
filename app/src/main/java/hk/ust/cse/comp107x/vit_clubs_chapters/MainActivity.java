package hk.ust.cse.comp107x.vit_clubs_chapters;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.design.widget.NavigationView;
import android.support.v4.app.FragmentTransaction;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.firebase.ui.auth.AuthUI;
import com.google.firebase.auth.FirebaseAuth;

import hk.ust.cse.comp107x.vit_clubs_chapters.ChatApp.ChatActivityMine;
import hk.ust.cse.comp107x.vit_clubs_chapters.ChatBox.ChatActivity;
import hk.ust.cse.comp107x.vit_clubs_chapters.ClubChapterDetails.ClubChapterDetailsFragment;
import hk.ust.cse.comp107x.vit_clubs_chapters.ContactClubChapter.ContactFragment;
import hk.ust.cse.comp107x.vit_clubs_chapters.EventDetailsOriginal.EventDetails;
import hk.ust.cse.comp107x.vit_clubs_chapters.Fragments.FragmentHome;
import hk.ust.cse.comp107x.vit_clubs_chapters.HelpAndSupport.HelpAndSupportFragment;
import hk.ust.cse.comp107x.vit_clubs_chapters.LoginPage.LoginActivity;
import hk.ust.cse.comp107x.vit_clubs_chapters.Recruitments.RecruitmentsFragment;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    private FirebaseAuth auth;

    FragmentTransaction ft;

    int onBackPressed = 0;
    boolean doubleBackToExitPressedOnce = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        auth = FirebaseAuth.getInstance();
        if (auth.getCurrentUser() == null) {
            startActivity(new Intent(MainActivity.this, LoginActivity.class));
            Toast.makeText(this, "Invalid user instance, please login to proceed further!", Toast.LENGTH_SHORT).show();
            finish();
        }


/////////////////////////////////////////////////////////////////////////////////////////////
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "VIT-Events is under construction!", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        // for showing fragments

        ft = getSupportFragmentManager().beginTransaction(); //declare only once

        ft.replace(R.id.main_framelayout, new FragmentHome());

        ft.commit();
    }

//    @Override
//    public void onBackPressed() {
//        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
//        if (drawer.isDrawerOpen(GravityCompat.START))
//        {
//            drawer.closeDrawer(GravityCompat.START);
//        }
//        else
//        {
//            if(onBackPressed == 0 )
//            {
//                onBackPressed++;
//                Toast.makeText(this, "Press Back again to exit", Toast.LENGTH_SHORT).show();
////                try {
////                    synchronized(this){
////                        wait(1000);
////                    }
////                }
////                catch(InterruptedException ex){
////                    onBackPressed--;
////                }
//            }
//            else
//                super.onBackPressed();
//        }
//    }


    @Override
    public void onBackPressed() {

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START))
        {
            drawer.closeDrawer(GravityCompat.START);
        }

        else
        {
            if (doubleBackToExitPressedOnce)
            {
                moveTaskToBack(true);
            }
            this.doubleBackToExitPressedOnce = true;
            Toast.makeText(this, "Please click BACK again to exit", Toast.LENGTH_SHORT).show();

            new Handler().postDelayed(new Runnable() {

                @Override
                public void run() {
                    doubleBackToExitPressedOnce = false;
                }
            }, 2000);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
            switch(item.getItemId()){
                case R.id.signout:
                    //sign out
                    AuthUI.getInstance().signOut(this);
                    Toast.makeText(MainActivity.this, "Signed out Successfully!", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(MainActivity.this, LoginActivity.class));
                    return true;
                default:
                    return super.onOptionsItemSelected(item);
            }
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if(id == R.id.home){
            Intent intent = new Intent(MainActivity.this, MainActivity.class);
            startActivity(intent);
        } else if (id == R.id.event_Details) {
            Intent intent = new Intent(MainActivity.this, EventDetails.class);
            startActivity(intent);
            // Handle the camera action
        }/* else if (id == R.id.club_Chapter_Det) {
            ClubChapterDetailsFragment fragment = new ClubChapterDetailsFragment();
            android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.main_framelayout, fragment);
            fragmentTransaction.commit();
            //getSupportActionBar().setTitle("Club/Chapter Details");
        }*/ else if (id == R.id.recruitments) {
//            Intent intent = new Intent(MainActivity.this, RecruitmentsActivity.class);
//            startActivity(intent);
            RecruitmentsFragment fragment = new RecruitmentsFragment();
            android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.main_framelayout, fragment);
            fragmentTransaction.commit();
            //getSupportActionBar().setTitle("Recruitments");
        } else if (id == R.id.contact) {
//            Intent intent = new Intent(MainActivity.this, ContactActivity.class);
//            startActivity(intent);

//            ft.replace(R.id.main_framelayout, new ContactFragment());
//            ft.commit();
            ContactFragment fragment = new ContactFragment();
            android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.main_framelayout, fragment);
            fragmentTransaction.commit();
            //getSupportActionBar().setTitle("Contact Club/Chapter");
        } else if (id == R.id.chat_box) {
            Intent intent = new Intent(MainActivity.this, ChatActivityMine.class);//ChatActivityMine.class);
            startActivity(intent);
        } else if (id == R.id.help) {
//            Intent intent = new Intent(MainActivity.this, HelpAndSupportActivity.class);
//            startActivity(intent);
            HelpAndSupportFragment fragment = new HelpAndSupportFragment();
            android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
            fragmentTransaction.replace(R.id.main_framelayout, fragment);
            fragmentTransaction.commit();
            getSupportActionBar().setTitle("Help & Support");
        } else if (id == R.id.nav_share) {
            Toast.makeText(this, "Email App Launched!", Toast.LENGTH_SHORT).show();
            Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
            emailIntent.setData(Uri.parse("mailto:"));
            emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Sharing the link to VIT Events App!");
            emailIntent.putExtra(Intent.EXTRA_TEXT, "http://www.vitevents.ac.in");
            startActivity(emailIntent);
        } else if (id == R.id.nav_send) {
            Toast.makeText(this, "Yes, you can share this app, but not now! :(", Toast.LENGTH_SHORT).show();
        }
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

}
