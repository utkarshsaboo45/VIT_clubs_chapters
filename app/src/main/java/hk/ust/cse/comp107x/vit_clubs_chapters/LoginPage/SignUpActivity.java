package hk.ust.cse.comp107x.vit_clubs_chapters.LoginPage;

import android.app.ProgressDialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import hk.ust.cse.comp107x.vit_clubs_chapters.AccountActivity.MainActivityFirebase;
import hk.ust.cse.comp107x.vit_clubs_chapters.AccountActivity.ResetPasswordActivityFirebase;
import hk.ust.cse.comp107x.vit_clubs_chapters.AccountActivity.SignUpActivityFirebase;
import hk.ust.cse.comp107x.vit_clubs_chapters.MainActivity;
import hk.ust.cse.comp107x.vit_clubs_chapters.R;

public class SignUpActivity extends AppCompatActivity {

//    private FirebaseAuth mAuth;
//    private DatabaseReference mDatabase;
//    private TextView mUserNameSignUp, mPasswordSignup;//, mRegSignup, mNameSignUp;
//    private Button signUpButton;
//    private ProgressDialog mProgressDialog;

    private EditText inputEmail, inputPassword;
    private Button btnSignUp;//, btnSignIn, btnResetPassword;
    private TextView login;
    //private ProgressBar progressBar;
    private FirebaseAuth auth;
    private ProgressDialog mProgressDialog;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        Toast.makeText(SignUpActivity.this, "Sign up to proceed!", Toast.LENGTH_SHORT).show();

/*
        mAuth = FirebaseAuth.getInstance();
        mDatabase = FirebaseDatabase.getInstance().getReference().child("users");


//        mNameSignUp = (TextView) findViewById(R.id.name_signup_field);
//        memailSignup = (TextView) findViewById(R.id.email_signup_field);
//        mPasswordSignup = (TextView) findViewById(R.id.password_signup_field);
//        mRegSignup = (TextView) findViewById(R.id.Reg_signup_filed);
//        btnSignup= (Button) findViewById(R.id.SignupBtn);


        mProgressDialog = new ProgressDialog(this);
        mProgressDialog.setCanceledOnTouchOutside(false);

        TextView login = (TextView) findViewById(R.id.login);


        mUserNameSignUp = (TextView) findViewById(R.id.signup_username_edittext);
        mPasswordSignup = (TextView) findViewById(R.id.signup_password_edittext);

        signUpButton = (Button) findViewById(R.id.signup_button);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginAction = new Intent(SignUpActivity.this, LoginActivity.class);
                startActivity(loginAction);
            }
        });

        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startRegister();
            }
        });
*/






        //Get Firebase auth instance
        auth = FirebaseAuth.getInstance();
        mProgressDialog = new ProgressDialog(this);
        mProgressDialog.setCanceledOnTouchOutside(false);

        //btnSignIn = (Button) findViewById(R.id.sign_in_button);
        login = (TextView) findViewById(R.id.login);
        btnSignUp = (Button) findViewById(R.id.signup_button);
        inputEmail = (EditText) findViewById(R.id.signup_email_edittext);
        inputPassword = (EditText) findViewById(R.id.signup_password_edittext);
        //progressBar = (ProgressBar) findViewById(R.id.progressBar);
        //btnResetPassword = (Button) findViewById(R.id.btn_reset_password);

//        btnResetPassword.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                startActivity(new Intent(SignUpActivity.this, ResetPasswordActivityFirebase.class));
//            }
//        });

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginAction = new Intent(SignUpActivity.this, LoginActivity.class);
                startActivity(loginAction);
            }
        });

//        btnSignIn.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                finish();
//            }
//        });

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String email = inputEmail.getText().toString().trim();
                String password = inputPassword.getText().toString().trim();

                if (TextUtils.isEmpty(email)) {
                    Toast.makeText(getApplicationContext(), "Enter email address!", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (TextUtils.isEmpty(password)) {
                    Toast.makeText(getApplicationContext(), "Enter password!", Toast.LENGTH_SHORT).show();
                    return;
                }

                if (password.length() < 6) {
                    Toast.makeText(getApplicationContext(), "Password too short, enter minimum 6 characters!", Toast.LENGTH_SHORT).show();
                    return;
                }

                //progressBar.setVisibility(View.VISIBLE);
                mProgressDialog.setMessage("Signing you up...");
                mProgressDialog.show();
                //create user
                auth.createUserWithEmailAndPassword(email, password)
                        .addOnCompleteListener(SignUpActivity.this, new OnCompleteListener<AuthResult>() {
                            @Override
                            public void onComplete(@NonNull Task<AuthResult> task) {
                                //progressBar.setVisibility(View.GONE);
                                mProgressDialog.dismiss();
                                // If sign in fails, display a message to the user. If sign in succeeds
                                // the auth state listener will be notified and logic to handle the
                                // signed in user can be handled in the listener.
                                if (!task.isSuccessful()) {
                                    Toast.makeText(SignUpActivity.this, "Something Went wrong. Reasons might include : Account already exists/No internet connectivity/or maybe, Something else!", Toast.LENGTH_LONG).show();
                                } else {
                                    Toast.makeText(SignUpActivity.this, "Sign Up successful!", Toast.LENGTH_SHORT).show();
                                    startActivity(new Intent(SignUpActivity.this, MainActivity.class));
                                    finish();
                                }
                            }
                        });

            }
        });
    }

    @Override
    public void onBackPressed(){
        Intent a = new Intent(Intent.ACTION_MAIN);
        a.addCategory(Intent.CATEGORY_HOME);
        a.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        startActivity(a);
    }

    @Override
    protected void onResume() {
        super.onResume();
        //progressBar.setVisibility(View.GONE);
        mProgressDialog.dismiss();
    }







































/*

        private void startRegister() {
        //final String mobile = mRegSignup.getText().toString().trim();
        final String username = mUserNameSignUp.getText().toString().trim();
        final String password = mPasswordSignup.getText().toString().trim();
        //final String name = mNameSignUp.getText().toString().trim();
        //final String image = "https://firebasestorage.googleapis.com/v0/b/vitwale-e0508.appspot.com/o/Profile_images%2Fcropped-626345379.jpg?alt=media&token=4cf1719a-2af8-4fd6-8bd6-0054ae1d9142";
        if(!TextUtils.isEmpty(username) && !TextUtils.isEmpty(password)){

            mProgressDialog.setMessage("Sigining up...");
            mProgressDialog.show();
            mAuth.createUserWithEmailAndPassword(username, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {

                    if(task.isSuccessful()){
                        String user_id = mAuth.getCurrentUser().getUid();
                        DatabaseReference current_user_db = mDatabase.child(user_id);
//                        current_user_db.child("username").setValue(username);
//                        //current_user_db.child("image").setValue(image);
//                        current_user_db.child("password").setValue(password);

                        current_user_db.child("username").push().setValue(username);
                        //current_user_db.child("image").setValue(image);
                        current_user_db.child("password").push().setValue(password);
                        mProgressDialog.dismiss();

                        Intent mainIntent = new Intent(SignUpActivity.this, MainActivity.class);
                        mainIntent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(mainIntent);
                    }

                    else
                    {
                        mProgressDialog.dismiss();
                        Toast.makeText(getApplicationContext(), "Something went wrong!", Toast.LENGTH_SHORT).show();
                    }
                }
            });

        }

    }
*/
}
