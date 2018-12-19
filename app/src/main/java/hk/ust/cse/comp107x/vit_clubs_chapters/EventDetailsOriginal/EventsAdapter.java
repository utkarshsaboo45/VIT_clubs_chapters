package hk.ust.cse.comp107x.vit_clubs_chapters.EventDetailsOriginal;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.content.ContextCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

import hk.ust.cse.comp107x.vit_clubs_chapters.EventDetailsOriginal.EventsList;
import hk.ust.cse.comp107x.vit_clubs_chapters.R;

/**
 * Created by utkarsh saboo on 13-03-2018.
 */

public class EventsAdapter extends ArrayAdapter<EventsList> {



    public EventsAdapter(Context context, ArrayList<EventsList> word)
    {
        super(context, 0, word);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View wordView = convertView;
        if (wordView == null) {
            wordView = LayoutInflater.from(getContext()).inflate(
                    R.layout.events_list_view, parent, false);
        }

        EventsList eventsList = getItem(position);

        TextView title = (TextView) wordView.findViewById(R.id.title);
        title.setText(eventsList.getTitle());

        TextView description = (TextView) wordView.findViewById(R.id.description);
        description.setText(eventsList.getDescription());

        ImageView image = (ImageView) wordView.findViewById(R.id.image);
        if (eventsList.getImageId() == 0)
            image.setVisibility(View.GONE);
        else
            image.setImageResource(eventsList.getImageId());

/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//        ListView listView = (ListView) wordView.findViewById(R.id.list);
//        if(listView!=null)
//            listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
//                @Override
//                public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
//                    MediaPlayer song = MediaPlayer.create(getContext(), R.raw.number_one);
//                    song.start();
//                }
//            });
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

//        View textContainer = wordView.findViewById(R.id.list_layout);
//        int color = ContextCompat.getColor(getContext(), resourceColorId);
//        textContainer.setBackgroundColor(color);

        return wordView;
    }

}
