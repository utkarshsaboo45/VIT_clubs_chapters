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
public class ComingSoon extends Fragment {


    public ComingSoon() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View rootView = inflater.inflate(R.layout.event_list, container, false);

        final ArrayList<EventsList> eventsList = new ArrayList<EventsList>();

        eventsList.add(new EventsList("Gyanth", "Description", R.drawable.event_icon1));
        eventsList.add(new EventsList("Innovation and You", "Description", R.drawable.event_icon2));
        eventsList.add(new EventsList("INTECH 18", "Description", R.drawable.event_icon3));
        eventsList.add(new EventsList("Best Out of Waste", "Description", R.drawable.homeevent6));
        eventsList.add(new EventsList("FILM SOCIETY", "Description", R.drawable.homeevent7));
        eventsList.add(new EventsList("Creativity Labs", "Description", R.drawable.homeevent8));
        eventsList.add(new EventsList("HTML 5", "Description", R.drawable.homeevent9));
//        eventsList.add(new EventsList("Coming Soon Event 8 : H", "Event 8 Description", R.drawable.ic_menu_camera));
//        eventsList.add(new EventsList("Coming Soon Event 9 : I", "Event 9 Description", R.drawable.ic_menu_camera));
//        eventsList.add(new EventsList("Coming Soon Event 10 : J", "Event 10 Description", R.drawable.ic_menu_camera));

        EventsAdapter eventsAdapter = new EventsAdapter(getActivity(), eventsList);

        ListView listView = (ListView) rootView.findViewById(R.id.list);

        listView.setAdapter(eventsAdapter);

        return rootView;

        //return inflater.inflate(R.layout.fragment_coming_soon, container, false);
    }

}
