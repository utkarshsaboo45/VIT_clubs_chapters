/*package hk.ust.cse.comp107x.vit_clubs_chapters;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.app.Activity;
import android.widget.Toast;


/**
 * A simple {@link Fragment} subclass.
 */
/*public class ClubChapterDetailsFragment extends FragmentActivity {

    private static EditText search_cc_text;
    private static Button search_cc_button;
    //Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_club_chapter_details);

    }

    public ClubChapterDetailsFragment() {
        // Required empty public constructor
    }
/*

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_club_chapter_details, container, false);
        //return inflater.inflate(R.layout.fragment_club_chapter_details, container, false);
        search_cc_text = (EditText) view.findViewById(R.id.search_cc_text);
        search_cc_button = (Button) view.findViewById(R.id.search_cc_button);

        search_cc_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                search_cc_text.setText("Hello");

            }
        });

        return view;
    }
*/
    //public void buttonClicked(View v){}

//}

package hk.ust.cse.comp107x.vit_clubs_chapters.ClubChapterDetails;


        import android.app.AlertDialog;
        import android.content.Intent;
        import android.os.Bundle;
        import android.support.v4.app.Fragment;
        import android.view.LayoutInflater;
        import android.view.View;
        import android.view.ViewGroup;
        import android.widget.Button;
        import android.widget.EditText;
        import android.widget.Toast;

        import hk.ust.cse.comp107x.vit_clubs_chapters.MainActivity;
        import hk.ust.cse.comp107x.vit_clubs_chapters.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ClubChapterDetailsFragment extends Fragment {

    public ClubChapterDetailsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        final View view =  inflater.inflate(R.layout.fragment_club_chapter_details, container, false);

        final EditText searchCcText = (EditText) view.findViewById(R.id.search_cc_text);
        Button searchCcButton = (Button) view.findViewById(R.id.search_cc_button);

        searchCcButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String searchText = ((EditText) view.findViewById(R.id.search_cc_text)).getText().toString();

                if(searchText.length()==0)

                {
                    searchCcText.requestFocus();
                    searchCcText.setError("FIELD CANNOT BE EMPTY");
                }

                else if(!searchText.matches("[a-zA-Z ]+"))
                {
                    searchCcText.requestFocus();
                    searchCcText.setError("ENTER ONLY ALPHABETICAL CHARACTER");
                }

                else
                {
                    Toast.makeText(getContext(),"Validation Successful",Toast.LENGTH_LONG).show();
                }

            }
        });

        return view;

    }
}
