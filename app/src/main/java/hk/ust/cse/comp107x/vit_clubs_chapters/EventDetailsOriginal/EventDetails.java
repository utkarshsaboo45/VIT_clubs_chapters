package hk.ust.cse.comp107x.vit_clubs_chapters.EventDetailsOriginal;

import android.app.SearchManager;
import android.content.Intent;
import android.support.design.widget.TabLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;

import android.widget.TextView;

import hk.ust.cse.comp107x.vit_clubs_chapters.R;

public class EventDetails extends AppCompatActivity {

    /**
     * The {@link android.support.v4.view.PagerAdapter} that will provide
     * fragments for each of the sections. We use a
     * {@link FragmentPagerAdapter} derivative, which will keep every
     * loaded fragment in memory. If this becomes too memory intensive, it
     * may be best to switch to a
     * {@link android.support.v4.app.FragmentStatePagerAdapter}.
     */
    //private SectionsPagerAdapter mSectionsPagerAdapter;

    /**
     * The {@link ViewPager} that will host the section contents.
     */
    private ViewPager mViewPager;

    //ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        //getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        //ListView lv =(ListView) findViewById(R.id.listView);
        //ArrayList<String> arrayItems = new ArrayList<>();

        //arrayItems.addAll(Arrays.asList(getResources().getStringArray(R.array.temp_array)));

        //final FragmentManager fm = getSupportFragmentManager();

        SimpleFragmentPagerAdapter simpleFragmentPagerAdapter = new SimpleFragmentPagerAdapter(getSupportFragmentManager());

//        adapter = new ArrayAdapter<String>(
//                EventDetails.this,
//                android.R.layout.simple_list_item_1,
//                arrayItems);
//        // )
//        lv.setAdapter(adapter);


        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        // Create the adapter that will return a fragment for each of the three
        // primary sections of the activity.
        //mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());

        // Set up the ViewPager with the sections adapter.
        mViewPager = (ViewPager) findViewById(R.id.container);
        //mViewPager.setAdapter(mSectionsPagerAdapter);
        mViewPager.setAdapter(simpleFragmentPagerAdapter);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(mViewPager);

        /*FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "VIT-Events is under construction!", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });*/
        /*Intent intent = getIntent();
        if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
            String query = intent.getStringExtra(SearchManager.QUERY);
            Toast toast = Toast.makeText(this, query, Toast.LENGTH_LONG);
            toast.show();
            //doMySearch(query);
        }
        */
        handleIntent(getIntent());
    }

    @Override
    public boolean onSupportNavigateUp(){
        finish();
        return true;
    }
///////////////////////////////////////////////////////////////////
    /*
    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.search_menu, menu);
        MenuItem item = menu.findItem(R.id.search);
        SearchView searchView = (SearchView) item.getActionView();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
              @Override
              public boolean onQueryTextSubmit(String query) {
                  return false;
              }

              @Override
              public boolean onQueryTextChange(String newText) {

                  adapter.getFilter().filter(newText);

                  return false;
              }
        });


        return super.onCreateOptionsMenu(menu);
    }
    */

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.search_menu, menu);
        MenuItem item = menu.findItem(R.id.search);
//        SearchView searchView = (SearchView) item.getActionView();
//
//        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
//              @Override
//              public boolean onQueryTextSubmit(String query) {
//                  return false;
//              }
//
//              @Override
//              public boolean onQueryTextChange(String newText) {
//
//                  adapter.getFilter().filter(newText);
//
//                  return false;
//              }
//        });


        return super.onCreateOptionsMenu(menu);
    }


    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        handleIntent(intent);
    }

    private void handleIntent(Intent intent) {

        if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
            String query = intent.getStringExtra(SearchManager.QUERY);

            showResults(query);
        }
    }

    private void showResults(String query) {
        // Query your data set and show results
        // ...
    }
/////////////////////////////////////////////////////////////////
    /*@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.search_menu, menu);
        return true;
    }*/

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.search) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    /**
     * A placeholder fragment containing a simple view.
     */
    public static class PlaceholderFragment extends Fragment {
        /**
         * The fragment argument representing the section number for this
         * fragment.
         */
        private static final String ARG_SECTION_NUMBER = "section_number";

        public PlaceholderFragment() {
        }

        /**
         * Returns a new instance of this fragment for the given section
         * number.
         */
        public static PlaceholderFragment newInstance(int sectionNumber) {
            PlaceholderFragment fragment = new PlaceholderFragment();
            Bundle args = new Bundle();
            args.putInt(ARG_SECTION_NUMBER, sectionNumber);
            fragment.setArguments(args);
            return fragment;
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main2, container, false);
            TextView textView = (TextView) rootView.findViewById(R.id.section_label);
            //textView.setText(getString(R.string.section_format, getArguments().getInt(ARG_SECTION_NUMBER)));
            return rootView;
        }
    }

    /**
     * A {@link FragmentPagerAdapter} that returns a fragment corresponding to
     * one of the sections/tabs/pages.
     */
//    public class SectionsPagerAdapter extends FragmentPagerAdapter {
//
//        public SectionsPagerAdapter(FragmentManager fm) {
//            super(fm);
//        }
//
////        @Override
////        public Fragment getItem(int position) {
////            // getItem is called to instantiate the fragment for the given page.
////            // Return a PlaceholderFragment (defined as a static inner class below).
////            return PlaceholderFragment.newInstance(position + 1);
////        }
//
//        @Override
//        public int getCount() {
//            // Show 3 total pages.
//            return 3;
//        }
//
//        /*@Override
//        public boolean onCreateOptionsMenu(Menu menu)
//        {
//            getMenuInflater().inflate(R.menu.search_menu, menu);
//            MenuItem searchItem = menu.findItem(R.id.search);
//            SearchView searchView = (SearchView) MenuItemCompat.getActionView(searchItem);
//
//            searchView.setOnQueryTextListener(
//            {
//                new SearchView.OnQueryTextListener()
//                {
//                    @Override
//                    public boolean onQueryTextChange(String newText)
//                    {
//                        return false;
//                    }
//                }
//            });
//        }*/
//
//        @Override
//        public Fragment getItem(int position)
//        {
//            switch(position)
//            {
//                case 0 :
//                    return new ExpiredEvents();
//                case 1 :
//                    return new UpcomingEvents();
//                case 2:
//                    return new ComingSoon();
//                default:
//                    return null;
//            }
//        }
//
//        @Override
//        public CharSequence getPageTitle(int position) {
//            switch (position) {
//                case 0:
//                    return "Expired Events";
//                case 1:
//                    return "Upcoming Events";
//                case 2:
//                    return "Coming Soon";
//                default:
//                    return null;
//            }
//        }
//    }

}
