package hk.ust.cse.comp107x.vit_clubs_chapters.EventDetailsOriginal;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

import hk.ust.cse.comp107x.vit_clubs_chapters.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class ExpiredEvents extends Fragment {


    public ExpiredEvents() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.event_list, container, false);

        final ArrayList<EventsList> eventsList = new ArrayList<EventsList>();

        eventsList.add(new EventsList("Tomorrow's here!", "Description", R.drawable.event_icon4));
        eventsList.add(new EventsList("AMC", "Description", R.drawable.event_icon5));
        eventsList.add(new EventsList("Indian Premier League", "Description", R.drawable.event_icon6));
        eventsList.add(new EventsList("Graphs", "Description", R.drawable.event_icon7));
        eventsList.add(new EventsList("TechTalk", "Description", R.drawable.event_icon8));
        eventsList.add(new EventsList("Microcontrollers", "Description", R.drawable.event_icon9));
//        eventsList.add(new EventsList("Expired Event 7 : G", "Event 7 Description", R.drawable.ic_menu_camera));
//        eventsList.add(new EventsList("Expired Event 8 : H", "Event 8 Description", R.drawable.ic_menu_camera));
//        eventsList.add(new EventsList("Expired Event 9 : I", "Event 9 Description", R.drawable.ic_menu_camera));
//        eventsList.add(new EventsList("Expired Event 10 : J", "Event 10 Description", R.drawable.ic_menu_camera));

        EventsAdapter eventsAdapter = new EventsAdapter(getActivity(), eventsList);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(eventsAdapter);

        return rootView;
        //return inflater.inflate(R.layout.fragment_expired_events, container, false);
    }

}
