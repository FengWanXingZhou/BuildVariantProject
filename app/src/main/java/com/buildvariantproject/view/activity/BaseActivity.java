package com.buildvariantproject.view.activity;

import android.app.Activity;

import com.buildvariantproject.navigator.Navigator;

//import buildvariantproject.Navigator;


/**
 * @author wj
 * @Date: 2018/8/31
 * @Description:
 **/
public class BaseActivity extends Activity{



    protected Navigator getNavigator(){
        return new Navigator();
    }



}
