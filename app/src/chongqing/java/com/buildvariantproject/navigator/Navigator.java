package com.buildvariantproject.navigator;

import android.content.Context;
import android.content.Intent;

import com.buildvariantproject.view.activity.ChongQingActivity;

/**
 * @author wj
 * @Date: 2018/8/31
 * @Description:
 **/
public class Navigator {

    public void navigateToSpecialActivity(Context context){
        Intent intent = new Intent(context, ChongQingActivity.class);
        context.startActivity(intent);

    }

}
