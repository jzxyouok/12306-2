package com.fangyi.a12306.fragmengt.me.imp;

import android.graphics.Color;
import android.view.View;
import android.widget.TextView;

import com.fangyi.a12306.fragmengt.base.BaseFragment;
import com.fangyi.a12306.utils.CommonUtils;

/**
 * Created by FANGYI on 2016/8/18.
 */

public class LoginFragment extends BaseFragment {
    @Override
    protected View getSuccessView() {
        CommonUtils.setTitle(getActivity(), "登陆");

        TextView view = new TextView(getActivity());
        view.setText("登陆");
        view.setTextColor(Color.RED);
        view.setTextSize(50);
        return view;
    }

    @Override
    protected Object requestData() {
        return null;
    }

    @Override
    public void onClick(View v) {

    }
}