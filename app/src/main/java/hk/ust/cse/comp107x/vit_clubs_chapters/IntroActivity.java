package hk.ust.cse.comp107x.vit_clubs_chapters;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

import agency.tango.materialintroscreen.MaterialIntroActivity;
import agency.tango.materialintroscreen.MessageButtonBehaviour;
import agency.tango.materialintroscreen.SlideFragmentBuilder;
import hk.ust.cse.comp107x.vit_clubs_chapters.AccountActivity.LoginActivityFirebase;
import hk.ust.cse.comp107x.vit_clubs_chapters.ContactClubChapter.ContactFragment;
import hk.ust.cse.comp107x.vit_clubs_chapters.LoginPage.LoginActivity;
import hk.ust.cse.comp107x.vit_clubs_chapters.LoginPage.LoginFragment;

/**
 * Created by utkarsh saboo on 14-03-2018.
 */

public class IntroActivity extends MaterialIntroActivity {

    private FirebaseAuth auth;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        auth = FirebaseAuth.getInstance();
        if (auth.getCurrentUser() != null) {
            startActivity(new Intent(IntroActivity.this, MainActivity.class));
            finish();
        }

        //set if the last slide should disapear with alpha hiding effect
        //enableLastSlideAlphaExitTransition(true);

        addSlide(new SlideFragmentBuilder()
                        .backgroundColor(R.color.blue)
                        .buttonsColor(R.color.blueButton)
                        .image(R.drawable.events9)
                        .title("Organize your Time with us")
                        .description("Wanna try?")
                        .build()
        );

        addSlide(new SlideFragmentBuilder()
                        .backgroundColor(R.color.red)
                        .buttonsColor(R.color.redButton)
                        .image(R.drawable.events5)
                        .title("Join us!")
                        .description("You would not be disappointed?")
                        .build()
        );

        addSlide(new SlideFragmentBuilder()
                        .backgroundColor(R.color.green)
                        .buttonsColor(R.color.greenButton)
                        .image(R.drawable.events1)//agency.tango.materialintroscreen.R.drawable.loginEvent)
                        .title("Go on!")
                        .description("Login now!")
                        .build(),
                new MessageButtonBehaviour(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent loginAction = new Intent(IntroActivity.this, LoginActivity.class);
                        startActivity(loginAction);
                        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
//                        LoginFragment fragment = new LoginFragment();
//                        android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
//                        fragmentTransaction.replace(R.id.main_framelayout, fragment);
//                        fragmentTransaction.commit();
                        //////////////////////////////////////////////////////////////////////////////////////////////////////////////
                        //showMessage("We provide solutions to make you love your work");
                    }
                }, "Join us!"));
    }
}