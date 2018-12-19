package hk.ust.cse.comp107x.vit_clubs_chapters.EventDetailsOriginal;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import hk.ust.cse.comp107x.vit_clubs_chapters.EventDetailsOriginal.ComingSoon;
import hk.ust.cse.comp107x.vit_clubs_chapters.EventDetailsOriginal.ExpiredEvents;
import hk.ust.cse.comp107x.vit_clubs_chapters.EventDetailsOriginal.UpcomingEvents;

/**
 * Created by utkarsh saboo on 13-03-2018.
 */

public class SimpleFragmentPagerAdapter extends FragmentPagerAdapter {

    public SimpleFragmentPagerAdapter(FragmentManager fm)
    {
        super(fm);
    }

    @Override
    public Fragment getItem(int position)
    {
        switch(position)
        {
            case 0 :
                return new ExpiredEvents();
            case 1 :
                return new UpcomingEvents();
            case 2:
                return new ComingSoon();
            default:
                return null;
        }
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Expired Events";
            case 1:
                return "Upcoming Events";
            case 2:
                return "Coming Soon";
            default:
                return null;
        }
    }

    @Override
    public int getCount()
    {
        return 3;
    }
}
