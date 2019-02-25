package com.ghp.demo.myaspectjlogin;

import android.content.Intent;
import android.os.Bundle;

import com.ghp.demo.myaspectjlogin.app.base.BaseActivity;
import com.ghp.demo.myaspectjlogin.test.TestActivity;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        startActivity(new Intent(this, TestActivity.class));
    }
}
