package xyz.ibat.sloth.info;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import xyz.ibat.sloth.R;
import xyz.ibat.sloth.base.BaseFragment;

/**
 * Created by DongJr on 2016/4/15.
 */
public class InfoFragment extends BaseFragment {
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tab_info, container, false);
        return view;
    }
}
