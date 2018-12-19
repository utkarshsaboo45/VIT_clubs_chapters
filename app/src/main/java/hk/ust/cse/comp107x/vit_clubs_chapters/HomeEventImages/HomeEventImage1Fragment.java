package hk.ust.cse.comp107x.vit_clubs_chapters.HomeEventImages;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import hk.ust.cse.comp107x.vit_clubs_chapters.R;

/**
 * Created by utkarsh saboo on 24-02-2018.
 */

public class HomeEventImage1Fragment extends Fragment{

    public HomeEventImage1Fragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home_image1, container, false);

        return view;
    }
}
