package com.tuananh.restaurant.manager.ui.activity;

import android.os.Bundle;

import com.tuananh.restaurant.manager.R;

public class SettingActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_setting);
        getSupportActionBar().setTitle(R.string.title_settings);
    }
}