package com.ghp.demo.myaspectjlogin.test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.ghp.demo.myaspectjlogin.R;
import com.ghp.demo.myaspectjlogin.app.aop.UserCache;
import com.ghp.demo.myaspectjlogin.app.base.BaseActivity;

public class LoginActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        UserCache.getInstance().setLogin(true);
    }
}
