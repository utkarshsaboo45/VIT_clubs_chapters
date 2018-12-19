package hk.ust.cse.comp107x.vit_clubs_chapters.HelpAndSupport;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import hk.ust.cse.comp107x.vit_clubs_chapters.ChatApp.ChatActivityMine;
import hk.ust.cse.comp107x.vit_clubs_chapters.MainActivity;
import hk.ust.cse.comp107x.vit_clubs_chapters.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class HelpAndSupportFragment extends Fragment {

    public HelpAndSupportFragment() {
        // Required empty public constructor
    }

    TextView contactDevelopers, documentation;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_help_and_support, container, false);

        contactDevelopers = (TextView) view.findViewById(R.id.contact_developers);
        documentation = (TextView) view.findViewById(R.id.documentation);

        contactDevelopers.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), DevelopersActivity.class);
                startActivity(intent);
            }
        });

        documentation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), DocumentationActivity.class);
                startActivity(intent);
            }
        });

        return view;

    }


}
