package hk.ust.cse.comp107x.vit_clubs_chapters.HelpAndSupport;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import hk.ust.cse.comp107x.vit_clubs_chapters.R;

public class DevelopersActivity extends AppCompatActivity {

    TextView mona;//, utkarsh, pranav;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_developers);

        mona = (TextView) findViewById(R.id.monaTeja);
//        utkarsh = (TextView) findViewById(R.id.utkarsh);
//        pranav = (TextView) findViewById(R.id.pranav);

        mona.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(DevelopersActivity.this, "Email App Launched!", Toast.LENGTH_SHORT).show();
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
                emailIntent.setData(Uri.parse("mailto:kurakulamona.teja2016@vitstudent.ac.in"));
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Doubts regarding VITEvents");
                startActivity(emailIntent);
            }
        });

//        utkarsh.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(DevelopersActivity.this, "Email App Launched!", Toast.LENGTH_SHORT).show();
//                Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
//                emailIntent.setData(Uri.parse("mailto:utkarsh.saboo2016@vitstudent.ac.in"));
//                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Doubts regarding VITEvents");
//                startActivity(emailIntent);
//            }
//        });
//
//        pranav.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(DevelopersActivity.this, "Email App Launched!", Toast.LENGTH_SHORT).show();
//                Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
//                emailIntent.setData(Uri.parse("mailto:pranav.lodha2016@vitstudent.ac.in"));
//                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "Doubts regarding VITEvents");
//                startActivity(emailIntent);
//            }
//        });
    }
}
