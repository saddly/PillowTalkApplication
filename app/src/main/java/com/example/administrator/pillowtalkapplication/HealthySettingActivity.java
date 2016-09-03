package com.example.administrator.pillowtalkapplication;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import utils.MySharePreferences;

public class HealthySettingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_healthy_setting);
        getSupportActionBar().hide();
    }
    public void close(View v){
        new AlertDialog.Builder(this)
                .setMessage("关闭后，双方将无法使用小姨妈的任何功能，是否确认关闭？")
                .setNegativeButton("取消",null)
                .setPositiveButton("确认", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        MySharePreferences.saveIntToFile(HealthySettingActivity.this,"currentstate",2);
                        startActivity(new Intent(HealthySettingActivity.this,HealthyActivity.class));
                        finish();
                    }
                })
                .show();
    }
}
