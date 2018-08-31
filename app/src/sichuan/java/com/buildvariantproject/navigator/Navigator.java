package com.buildvariantproject.navigator;

import android.content.Context;
import android.content.Intent;

import com.buildvariantproject.view.activity.SiChuanActivity;

/**
 * @author wj
 * @Date: 2018/8/31
 * @Description:
 **/
public class Navigator {

    public void navigateToSpecialActivity(Context context){
        Intent intent = new Intent(context, SiChuanActivity.class);
        context.startActivity(intent);
    }

}
