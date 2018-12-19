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
public class UpcomingEvents extends Fragment {


    public UpcomingEvents() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.event_list, container, false);

        final ArrayList<EventsList> eventsList = new ArrayList<EventsList>();

        eventsList.add(new EventsList("Rhapsody 2K18", "Description", R.drawable.event_icon10));
        eventsList.add(new EventsList("Music : Talking to you!", "Description", R.drawable.event_icon11));
        eventsList.add(new EventsList("Bits-n-Bytes", "Description", R.drawable.event_icon12));
        eventsList.add(new EventsList("C & C++", "Description", R.drawable.event_icon13));
        eventsList.add(new EventsList("Cultural District Trust", "Description", R.drawable.event_icon14));
        eventsList.add(new EventsList("Cultural Events Board", "Description", R.drawable.event_icon15));
        eventsList.add(new EventsList("Indian International Science Festival", "Description", R.drawable.event_icon16));
//        eventsList.add(new EventsList("Upcoming Event 8 : H", "Event 8 Description", R.drawable.ic_menu_camera));
//        eventsList.add(new EventsList("Upcoming Event 9 : I", "Event 9 Description", R.drawable.ic_menu_camera));
//        eventsList.add(new EventsList("Upcoming Event 10 : J", "Event 10 Description", R.drawable.ic_menu_camera));


        EventsAdapter eventsAdapter = new EventsAdapter(getActivity(), eventsList);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(eventsAdapter);

        return rootView;
        //return inflater.inflate(R.layout.fragment_upcoming_events, container, false);
    }

}
