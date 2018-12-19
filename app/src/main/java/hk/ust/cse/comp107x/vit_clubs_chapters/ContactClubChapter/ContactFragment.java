package hk.ust.cse.comp107x.vit_clubs_chapters.ContactClubChapter;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

import hk.ust.cse.comp107x.vit_clubs_chapters.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ContactFragment extends Fragment {

    public ContactFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.listview_contact_details, container, false);

        final ArrayList<ContactDetails> details = new ArrayList<ContactDetails>();

        details.add(new ContactDetails(R.drawable.cc_adg, "Apple Developers Group", "Detail 1.1", "Detail 1.2", "+91 9876543210", "adg@vit.ac.in", "Content 1"));
        details.add(new ContactDetails(R.drawable.cc_american_socities, "American Socities", "Detail 10.1", "Detail 10.2", "+91 9786543210", "asce@vit.ac.in", "Content 2"));
        details.add(new ContactDetails(R.drawable.cc_animation_club, "Animation Club", "Detail 2.1", "Detail 2.2", "+91 9687543210", "animationclub@vit.ac.in", "Content 3"));
        details.add(new ContactDetails(R.drawable.cc_creation_labs, "Creation Labs", "Detail 3.1", "Detail 3.2", "+91 9587643210", "creationlabs@vit.ac.in", "Content 4"));
        details.add(new ContactDetails(R.drawable.cc_debsoc, "DEBSOC", "Detail 4.1", "Detail 4.2", "+91 9487653210", "debsoc@vit.ac.in", "Content 5"));
        details.add(new ContactDetails(R.drawable.cc_dramatics, "Dramatics Club", "Detail 5.1", "Detail 5.2", "+91 9387654210", "dramaticsclub@vit.ac.in", "Content 6"));
        details.add(new ContactDetails(R.drawable.cc_film_society, "Film Society", "Detail 6.1", "Detail 6.2", "+91 9287654310", "filmsociety@vit.ac.in", "Content 7"));
        details.add(new ContactDetails(R.drawable.cc_gdg, "Google Developers Group", "Detail 7.1", "Detail 7.2", "+91 9187654320", "gdgvit@vit.ac.in", "Content 8"));
        details.add(new ContactDetails(R.drawable.cc_ieee, "IEEE", "Detail 8.1", "Detail 8.2", "+91 9087654321", "ieeevit@vit.ac.in", "Content 9"));
        details.add(new ContactDetails(R.drawable.cc_indian_socities, "Indian Socities", "Detail 9.1", "Detail 9.2", "+91 8976543210", "indiansocities@vit.ac.in", "Content 10"));
        details.add(new ContactDetails(R.drawable.cc_robovitics, "RoboVITics", "Detail 10.1", "Detail 10.2", "+91 8796543210", "robovitics@vit.ac.in", "Content 11"));
        details.add(new ContactDetails(R.drawable.cc_tag, "TAG", "Detail 10.1", "Detail 10.2", "+91 8697543210", "tag@vit.ac.in", "Content 12"));
        details.add(new ContactDetails(R.drawable.cc_tec, "TEC", "Detail 10.1", "Detail 10.2", "+91 8597643210", "tec@vit.ac.in", "Content 13"));
        details.add(new ContactDetails(R.drawable.cc_toastmasters, "Toastmasters", "Detail 10.1", "Detail 10.2", "+91 8497653210", "toastmasters@vit.ac.in", "Content 14"));
        details.add(new ContactDetails(R.drawable.cc_trekking_club, "Trekking Club", "Detail 10.1", "Detail 10.2", "+91 8397654210", "trekkingclub@vit.ac.in", "Content 15"));
        details.add(new ContactDetails(R.drawable.cc_university_chapters, "University Chapters", "Detail 10.1", "Detail 10.2", "+91 8297654310", "universitychapters@vit.ac.in", "Content 16"));
        details.add(new ContactDetails(R.drawable.cc_youth_red_cross, "Youth Red Cross", "Detail 10.1", "Detail 10.2", "+91 8197654320", "yrcvit@vit.ac.in", "Content 17"));

        ContactDetailsAdapter detailsAdapter = new ContactDetailsAdapter(getActivity(), details, new ImageClickListener() {
            @Override
            public void onCallImageClick(int position) {

                Toast.makeText(getContext(), "Phone App Launched!", Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(Intent.ACTION_DIAL, Uri.parse("tel:" + details.get(position).getContactNumber()));
                startActivity(intent);
            }

            @Override
            public void onMailImageClick(int position) {
                Toast.makeText(getContext(), "Email App Launched!", Toast.LENGTH_SHORT).show();
                Intent emailIntent = new Intent(Intent.ACTION_SENDTO);
                emailIntent.setData(Uri.parse("mailto:" + details.get(position).getEmailID()));
//                emailIntent.putExtra(Intent.EXTRA_SUBJECT, "");
//                emailIntent.putExtra(Intent.EXTRA_TEXT, "");

                if( emailIntent.resolveActivity(getActivity().getPackageManager()) != null ) {
                    startActivity(emailIntent);
                    //showToastLong("Thank You, " + userName + "! That will be " + calculatePrice(quantity, rate) + "$");
                }
                else
                {
                    showToastLong("Please install an Email app to continue!");
                }
            }
        });

        ListView listView = (ListView) rootView.findViewById(R.id.contact_details_list);

        if(listView!=null)
            listView.setAdapter(detailsAdapter);

        return rootView;
    }

    private void showToastShort(String msg) {
        final Toast toast = Toast.makeText(getActivity().getApplicationContext(), msg, Toast.LENGTH_SHORT);
        toast.show();
        //To cancel the toast
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                toast.cancel();
            }
        }, 500);
    }

    private void showToastLong(String msg) {
        final Toast toast = Toast.makeText(getActivity().getApplicationContext(), msg, Toast.LENGTH_SHORT);
        toast.show();
        //To cancel the toast
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                toast.cancel();
            }
        }, 1500);
    }
}
