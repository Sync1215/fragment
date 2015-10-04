package com.zxz.day11_fragment;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    public void a1(View v){
        FragmentManager manager = getFragmentManager();
        FragmentTransaction tr = manager.beginTransaction();
        SaveFragment fragment = new SaveFragment() ;
        tr.replace(R.id.container, fragment);
        tr.commit();

    }
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)

    public void a2(View v){

        FragmentManager manager = getFragmentManager();
        FragmentTransaction tr = manager.beginTransaction();
        NetFragment fragment = new NetFragment();
        tr.replace(R.id.container, fragment);
        tr.commit();

    }
    @TargetApi(Build.VERSION_CODES.HONEYCOMB)

    public void a3(View v){

        FragmentManager manager = getFragmentManager();
        FragmentTransaction tr = manager.beginTransaction();
        SoundFragment fragment = new SoundFragment();
        tr.replace(R.id.container, fragment);
        tr.commit();
    }
}
