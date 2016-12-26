package com.github.onlynight.slidingconfict.viewpager;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.onlynight.slidingconfict.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lion on 2016/12/21.
 */

public class Fragment1 extends BaseFragment {

    private ViewPager viewPager;
    private TabLayout tabLayout;

    private FragmentPagerAdapter adapter;
    private List<Fragment> fragments;

    @Nullable
    @Override

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View contentView = inflater.inflate(R.layout.fragment_1, container, false);
        viewPager = (ViewPager) contentView.findViewById(R.id.viewPager);
        tabLayout = (TabLayout) contentView.findViewById(R.id.tabLayout);
        initAdapter();
        viewPager.setAdapter(adapter);
        tabLayout.setupWithViewPager(viewPager);
        return contentView;
    }

    @Override
    public String getPageTitle() {
        return "page1";
    }

    private void initAdapter() {
        fragments = new ArrayList<>();
        fragments.add(new Fragment1Sub1());
        fragments.add(new Fragment1Sub2());

        adapter = new FragmentPagerAdapter(getChildFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return fragments.get(position);
            }

            @Override
            public int getCount() {
                return fragments.size();
            }

            @Override
            public CharSequence getPageTitle(int position) {
                return ((BaseFragment) fragments.get(position)).getPageTitle();
            }
        };
    }
}
