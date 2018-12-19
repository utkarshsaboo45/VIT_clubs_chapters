package hk.ust.cse.comp107x.vit_clubs_chapters.LoginPage;


import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.app.AlertDialog;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.ValueEventListener;


import org.w3c.dom.Text;

import hk.ust.cse.comp107x.vit_clubs_chapters.MainActivity;
import hk.ust.cse.comp107x.vit_clubs_chapters.R;

import static android.content.ContentValues.TAG;


/**
 * A simple {@link Fragment} subclass.
 */
public class LoginFragment extends Fragment {


    private FirebaseAuth mAuth;
    private DatabaseReference mDatabase;
    private TextView memailSignin, mPasswordSignin;
    private ProgressDialog mProgressDialog;


    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view =  inflater.inflate(R.layout.fragment_login, container, false);

        //final EditText usernameEditText = (EditText) view.findViewById(R.id.search_cc_text);
        //final EditText passwordEditText = (EditText) view.findViewById(R.id.password_edittext);

        TextView signUp = (TextView) view.findViewById(R.id.sign_up);

//////////////////////////////////////////////////////////////////////////////////////////////////////

        memailSignin = (TextView) view.findViewById(R.id.username_edittext);
        mPasswordSignin = (TextView) view.findViewById(R.id.password_edittext);
//        btnSignin= (Button) view.findViewById(R.id.btnSignin);

        mAuth = FirebaseAuth.getInstance();
        mDatabase = FirebaseDatabase.getInstance().getReference().child("users");

        mProgressDialog = new ProgressDialog(getContext());
        mProgressDialog.setCanceledOnTouchOutside(false);

//////////////////////////////////////////////////////////////////////////////////////////////////////

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent loginAction = new Intent(getActivity(), SignUpActivity.class);
                startActivity(loginAction);
            }
        });

        Button loginButton = (Button) view.findViewById(R.id.login_button);

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                checkOfflineLogin(view);
                //checkValidLogin();
            }
        });

        return view;
    }

    private void checkOfflineLogin(View view) {
        final String userName = ((EditText) view.findViewById(R.id.username_edittext)).getText().toString();
        final String password = ((EditText) view.findViewById(R.id.password_edittext)).getEditableText().toString();


        if(userName.length()==0)

        {
            ((EditText) view.findViewById(R.id.username_edittext)).requestFocus();
            ((EditText) view.findViewById(R.id.username_edittext)).setError("FIELD CANNOT BE EMPTY");
        }

        else if(password.length()==0)

        {
            ((EditText) view.findViewById(R.id.password_edittext)).requestFocus();
            ((EditText) view.findViewById(R.id.password_edittext)).setError("FIELD CANNOT BE EMPTY");
        }

        else if(!userName.matches("[a-zA-Z0-9 ]+"))
        {
            ((EditText) view.findViewById(R.id.username_edittext)).requestFocus();
            ((EditText) view.findViewById(R.id.username_edittext)).setError("ENTER ONLY ALPHABETICAL CHARACTER");
        }

        else if(!(userName.length()==0) && !(password.length()==0)) {
            if (userName.equalsIgnoreCase("1") && password.equals("1")) {
                Intent loginAction = new Intent(getActivity(), MainActivity.class);
                startActivity(loginAction);
                Toast.makeText(getContext(),"Successfuly logged in!",Toast.LENGTH_LONG).show();

            }
            else {
                AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
                builder.setTitle("Invalid Credentials!");
                builder.setMessage("Please try again");
                builder.setPositiveButton("OK!", null);
                AlertDialog dialog = builder.show();
                //Toast.makeText(getContext(), "Wrong username or password!", Toast.LENGTH_SHORT).show();
            }
        }


    }

    private void checkValidLogin() {
        //mAuth = FirebaseAuth.getInstance();
    }


    @Override
    public void onStart() {
        super.onStart();
        // Check if user is signed in (non-null) and update UI accordingly.
        FirebaseUser currentUser = mAuth.getCurrentUser();
        updateUI(currentUser);
        String uid = mAuth.getUid();

        // Send token back to client
//        String mCustomToken = FirebaseAuth.getInstance().createCustomTokenAsync(uid).get();
//
//        mAuth.signInWithCustomToken(mCustomToken)
//                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
//                    @Override
//                    public void onComplete(@NonNull Task<AuthResult> task) {
//                        if (task.isSuccessful()) {
//                            // Sign in success, update UI with the signed-in user's information
//                            Log.d(TAG, "signInWithCustomToken:success");
//                            FirebaseUser user = mAuth.getCurrentUser();
//                            updateUI(user);
//                        } else {
//                            // If sign in fails, display a message to the user.
//                            Log.w(TAG, "signInWithCustomToken:failure", task.getException());
//                            Toast.makeText(SignUpActivity.this, "Authentication failed.", Toast.LENGTH_SHORT).show();
//                            updateUI(null);
//                        }
//                    }
//                });

    }

    private void updateUI(FirebaseUser user) {
        if (user != null) {
            Toast.makeText(getActivity(), "Logged in", Toast.LENGTH_SHORT);
//            ((TextView) getActivity().findViewById(R.id.text_sign_in_status)).setText(
//                    "User ID: " + user.getUid());
        } else {
            Toast.makeText(getActivity(), "Not Logged in", Toast.LENGTH_SHORT);
//            ((TextView) getActivity().findViewById(R.id.text_sign_in_status)).setText(
//                    "Error: sign in failed.");
        }
    }

//    private void updateUI(FirebaseUser user) {
//        //hideProgressDialog();
//        mProgressDialog.dismiss();
//        if (user != null) {
//            mStatusTextView.setText(getString(R.string.google_status_fmt, user.getEmail()));
//            mDetailTextView.setText(getString(R.string.firebase_status_fmt, user.getUid()));
//
//            findViewById(R.id.sign_in_button).setVisibility(View.GONE);
//            findViewById(R.id.sign_out_and_disconnect).setVisibility(View.VISIBLE);
//        } else {
//            mStatusTextView.setText(R.string.signed_out);
//            mDetailTextView.setText(null);
//
//            findViewById(R.id.sign_in_button).setVisibility(View.VISIBLE);
//            findViewById(R.id.sign_out_and_disconnect).setVisibility(View.GONE);
//        }
//    }

    private void checkLogin() {

        String email = memailSignin.getText().toString().trim();
        String password = mPasswordSignin.getText().toString().trim();

        if (!TextUtils.isEmpty(email) && !TextUtils.isEmpty(password)) {

            mProgressDialog.setMessage("Checking Login...");
            mProgressDialog.show();

            mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()) {
                        checkUserExist();
                    } else {
                        mProgressDialog.dismiss();
                        Toast.makeText(getContext(), "You don't have account", Toast.LENGTH_LONG).show();
                    }

                }
            });

        }
    }



    private void checkUserExist() {

        if(mAuth.getCurrentUser() !=null) {
            final String user_id = mAuth.getCurrentUser().getUid();
            mDatabase.addValueEventListener(new ValueEventListener() {
                @Override
                public void onDataChange(DataSnapshot dataSnapshot) {
                    if (dataSnapshot.hasChild(user_id)) {
                        Intent mainintent = new Intent(getContext(), MainActivity.class);
                        mainintent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(mainintent);
                    }
                    else {
                        /*Intent setupintent = new Intent(LoginActivity.this, SetupActivity.class);
                        setupintent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                        startActivity(setupintent);*/
                        Toast.makeText(getContext(), "setup account", Toast.LENGTH_LONG).show();
                    }

                }

                @Override
                public void onCancelled(DatabaseError databaseError) {

                }
            });
            mProgressDialog.dismiss();
        }
    }



}
