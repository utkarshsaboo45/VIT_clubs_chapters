package hk.ust.cse.comp107x.vit_clubs_chapters.LoginPage;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

//import com.matthewtamlin.sliding_intro_screen_library.indicators.DotIndicator;

import hk.ust.cse.comp107x.vit_clubs_chapters.LoginPage.LoginFragment;
import hk.ust.cse.comp107x.vit_clubs_chapters.LoginPage.LoginImage1Fragment;
import hk.ust.cse.comp107x.vit_clubs_chapters.LoginPage.LoginImage2Fragment;

/**
 * Created by utkarsh saboo on 24-02-2018.
 */

public class SimpleFragmentPagerAdapterLogin extends FragmentPagerAdapter {

    public SimpleFragmentPagerAdapterLogin(FragmentManager fm)
    {
        super(fm);
    }

    @Override
    public Fragment getItem(int position)
    {
        switch(position)
        {
//            case 0 :
//                return new LoginImage1Fragment();
//            case 1 :
//                return new LoginImage2Fragment();
//            case 2:
//                return new LoginFragment();
//            default:
//                return null;
            case 0:
                return new LoginFragment();
            default:
                return null;
        }
    }


    @Override
    public int getCount()
    {
        return 1;
    }
}
