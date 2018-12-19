package hk.ust.cse.comp107x.vit_clubs_chapters;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BlankActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blank);



//        private FirebaseAuth mAuth;
//        private DatabaseReference mDatabase;
//        private TextView memailSignup, mPasswordSignup, mRegSignup, mNameSignUp;
//        private TextView memailSignin, mPasswordSignin;
//        private Button btnSignup;
//        private Button btnSignin;
//        private ProgressDialog mProgressDialog;
//
//
//
//        mAuth = FirebaseAuth.getInstance();
//        mDatabase = FirebaseDatabase.getInstance().getReference().child("users");
//
//
//        mNameSignUp = (TextView) findViewById(R.id.name_signup_field);
//        memailSignup = (TextView) findViewById(R.id.email_signup_field);
//        mPasswordSignup = (TextView) findViewById(R.id.password_signup_field);
//        mRegSignup = (TextView) findViewById(R.id.Reg_signup_filed);
//        btnSignup= (Button) findViewById(R.id.SignupBtn);
//
//        mProgressDialog = new ProgressDialog(this);
//        mProgressDialog.setCanceledOnTouchOutside(false);
//
//        memailSignin = (TextView) findViewById(R.id.email_sigin_field);
//        mPasswordSignin = (TextView) findViewById(R.id.password_signin_field);
//        btnSignin= (Button) findViewById(R.id.btnSignin);
//

    }

//    private void checkLogin() {
//
//        String email = memailSignin.getText().toString().trim();
//        String password = mPasswordSignin.getText().toString().trim();
//
//        if (!TextUtils.isEmpty(email) && !TextUtils.isEmpty(password)) {
//
//            mProgressDialog.setMessage("Checking Login...");
//            mProgressDialog.show();
//
//            mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
//                public void onComplete(@NonNull Task<AuthResult> task) {
//                    if (task.isSuccessful()) {
//                        checkUserExist();
//                    } else {
//                        mProgressDialog.dismiss();
//                        Toast.makeText(SignUpSignIn.this, "You don't have account", Toast.LENGTH_LONG).show();
//                    }
//
//                }
//            });
//
//        }
//    }
//
//
//
//
//
//    private void checkUserExist() {
//
//        if(mAuth.getCurrentUser() !=null) {
//            final String user_id = mAuth.getCurrentUser().getUid();
//            mDatabase.addValueEventListener(new ValueEventListener() {
//                @Override
//                public void onDataChange(DataSnapshot dataSnapshot) {
//                    if (dataSnapshot.hasChild(user_id)) {
//                        Intent mainintent = new Intent(SignUpSignIn.this, MainActivity.class);
//                        mainintent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//                        startActivity(mainintent);
//                    }
//                    else {
//                        /*Intent setupintent = new Intent(LoginActivity.this, SetupActivity.class);
//                        setupintent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
//                        startActivity(setupintent);*/
//                        Toast.makeText(SignUpSignIn.this, "setup account", Toast.LENGTH_LONG).show();
//                    }
//
//                }
//
//                @Override
//                public void onCancelled(DatabaseError databaseError) {
//
//                }
//            });
//            mProgressDialog.dismiss();
//        }
//    }
//
//
//
//
}
