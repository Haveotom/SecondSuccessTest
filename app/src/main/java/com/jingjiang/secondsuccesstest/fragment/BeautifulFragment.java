package com.jingjiang.secondsuccesstest.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.jingjiang.secondsuccesstest.R;

/**
 * Created by dllo on 16/7/15.
 */
public class BeautifulFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = LayoutInflater.from(getContext()).inflate(R.layout.fragment_beautiful,container,false);
        return super.onCreateView(inflater, container, savedInstanceState);
    }
}
