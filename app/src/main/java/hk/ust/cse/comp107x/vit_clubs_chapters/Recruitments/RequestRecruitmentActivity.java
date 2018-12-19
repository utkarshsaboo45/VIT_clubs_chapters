package hk.ust.cse.comp107x.vit_clubs_chapters.Recruitments;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import hk.ust.cse.comp107x.vit_clubs_chapters.R;

public class RequestRecruitmentActivity extends AppCompatActivity {

    Button applyButton;
    EditText regNoEditText, achievementsEditText, linksEditText, reasonsEditText;
    String message;

    String regNo, achievements, links, reasons;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_recruitment);

        applyButton = (Button) findViewById(R.id.apply_button);

        regNoEditText = (EditText) findViewById(R.id.reg_no_text_field);
        achievementsEditText = (EditText) findViewById(R.id.achievements_text_field);
        linksEditText = (EditText) findViewById(R.id.links_text_field);
        reasonsEditText = (EditText) findViewById(R.id.reasons_text_field);


        applyButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                regNo = regNoEditText.getText().toString();
                achievements = achievementsEditText.getText().toString();
                links = linksEditText.getText().toString();
                reasons = reasonsEditText.getText().toString();

                message = "Reg. No. : " + regNo + "\n\n" + "Achievements : \n" + achievements + "\n\n" + "Relevant links : \n" + links + "\n\n" + "Reasons to join : \n" + reasons;

                regNoEditText.setText("");
                achievementsEditText.setText("");
                linksEditText.setText("");
                reasonsEditText.setText("");

                Toast.makeText(RequestRecruitmentActivity.this, "Email App Launched!", Toast.LENGTH_SHORT).show();
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
                emailIntent.setData(Uri.parse("mailto:vitevents@vitstudent.ac.in"));
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Recruitments Request");
                emailIntent.putExtra(Intent.EXTRA_TEXT, message);
                startActivity(emailIntent);
            }
        });


    }
}