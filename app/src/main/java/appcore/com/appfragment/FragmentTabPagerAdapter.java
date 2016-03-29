package appcore.com.appfragment;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;


public class FragmentTabPagerAdapter extends FragmentPagerAdapter {

    public FragmentTabPagerAdapter(FragmentManager fm)
    {
        super(fm);

    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0)
        {
            return new VeryPlainFragment();
        }
        else if (position == 1)
        {
            return new VeryPlainFragment();
        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
