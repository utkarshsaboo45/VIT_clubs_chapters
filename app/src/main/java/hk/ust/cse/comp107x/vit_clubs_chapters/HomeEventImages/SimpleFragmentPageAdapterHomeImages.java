package hk.ust.cse.comp107x.vit_clubs_chapters.HomeEventImages;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import hk.ust.cse.comp107x.vit_clubs_chapters.LoginPage.LoginFragment;
import hk.ust.cse.comp107x.vit_clubs_chapters.LoginPage.LoginImage1Fragment;
import hk.ust.cse.comp107x.vit_clubs_chapters.LoginPage.LoginImage2Fragment;

/**
 * Created by utkarsh saboo on 24-02-2018.
 */

public class SimpleFragmentPageAdapterHomeImages extends FragmentPagerAdapter {

    public SimpleFragmentPageAdapterHomeImages(FragmentManager fm)
    {
        super(fm);
    }

    @Override
    public Fragment getItem(int position)
    {
        switch(position)
        {
            case 0 :
                return new HomeEventImage1Fragment();
            case 1 :
                return new HomeEventImage2Fragment();
            case 2:
                return new HomeEventImage3Fragment();
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
