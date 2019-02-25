package com.ghp.demo.myaspectjlogin.test;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.ghp.demo.myaspectjlogin.R;
import com.ghp.demo.myaspectjlogin.app.aop.LoginTrace;
import com.ghp.demo.myaspectjlogin.app.base.BaseActivity;

public class TestActivity extends BaseActivity implements View.OnClickListener {

    private Button btnNormal,btnNeed,btnOther;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);
        findViewById(R.id.btn_normal).setOnClickListener(this);
        findViewById(R.id.btn_need).setOnClickListener(this);
        findViewById(R.id.btn_other).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_normal:
                methodNormal();
                break;
            case R.id.btn_need:
                methodNeed();
                break;
            case R.id.btn_other:
                methodOther();
                break;
             default:
        }
    }


    private void methodNormal() {

    }

    @LoginTrace(type = 0)
    private void methodNeed() {
        Toast.makeText(this,"登录成功",Toast.LENGTH_LONG).show();
    }

    @LoginTrace(type = 1)
    private void methodOther() {

    }
}
