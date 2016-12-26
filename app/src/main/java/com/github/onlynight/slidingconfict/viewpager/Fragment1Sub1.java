package com.github.onlynight.slidingconfict.viewpager;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.github.onlynight.slidingconfict.R;

/**
 * Created by lion on 2016/12/21.
 */

public class Fragment1Sub1 extends BaseFragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_1_sub_1, container, false);
    }

    @Override
    public String getPageTitle() {
        return "page1sub1";
    }
}
