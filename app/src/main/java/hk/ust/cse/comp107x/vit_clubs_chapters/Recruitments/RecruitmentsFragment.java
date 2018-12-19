/*package hk.ust.cse.comp107x.vit_clubs_chapters;


import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
/*public class RecruitmentsFragment extends FragmentActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_recruitments);
    }

    /*@Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_recruitments, container, false);
    }*/

 /*   public RecruitmentsFragment() {
        // Required empty public constructor
    }

/*
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_recruitments, container, false);
    }
*/
//}


package hk.ust.cse.comp107x.vit_clubs_chapters.Recruitments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.support.v4.app.Fragment;
import android.widget.TextView;

import hk.ust.cse.comp107x.vit_clubs_chapters.HelpAndSupport.DevelopersActivity;
import hk.ust.cse.comp107x.vit_clubs_chapters.HelpAndSupport.DocumentationActivity;
import hk.ust.cse.comp107x.vit_clubs_chapters.R;


/**
 * A simple {@link Fragment} subclass.
 */
public class RecruitmentsFragment extends Fragment {

    public RecruitmentsFragment() {
        // Required empty public constructor
    }

    TextView ongoing, request;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_recruitments, container, false);

        ongoing = (TextView) view.findViewById(R.id.ongoing_recruitments);
        request = (TextView) view.findViewById(R.id.request_recruitment);

        ongoing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), OnGoingRecruitmentsActivity.class);
                startActivity(intent);
            }
        });

        request.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), RequestRecruitmentActivity.class);
                startActivity(intent);
            }
        });

        return view;
    }
}
