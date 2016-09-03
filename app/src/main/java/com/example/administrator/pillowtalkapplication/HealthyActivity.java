package com.example.administrator.pillowtalkapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import java.util.Date;

import utils.MySharePreferences;

public class HealthyActivity extends AppCompatActivity {
    public String TAG = "HealthyActivity";
    public static final int COME = 0;
    public static final int GONE = 1;
    public static final int CLOSE = 2;
    public static final int CURRENT_STATE = -1;
    private LinearLayout ll_healthyactivity_view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_healthy);
        getSupportActionBar().hide();
        //根据三种不同状态设置三种界面，button在不同状态有三种不同的点击功能
        ll_healthyactivity_view = (LinearLayout) findViewById(R.id.ll_healthyactivity_view);
        initView();


    }

    public void upToSetting(View v) {
        startActivity(new Intent(this, HealthySettingActivity.class));
    }

    public void back(View v) {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }

    public void initView() {
        int currentstate = MySharePreferences.getIntFromFile(HealthyActivity.this, "currentstate");
        switch (currentstate) {
            case COME:
                //特殊状态
                View viewcome = View.inflate(HealthyActivity.this, R.layout.healthy_state_come, null);
                ll_healthyactivity_view.removeAllViews();
                ll_healthyactivity_view.addView(viewcome);
                TextView tv_healthyactivity_date = (TextView) viewcome.findViewById(R.id.tv_healthycome_date);
                Button bt_healthystatecome_send = (Button) viewcome.findViewById(R.id.bt_healthystatecome_send);
                MySharePreferences.saveIntToFile(HealthyActivity.this,"currentstate",COME);
                break;

            case GONE:
                //正常状态
                View viewgone = View.inflate(HealthyActivity.this, R.layout.healthy_state_gone, null);
                ll_healthyactivity_view.removeAllViews();
                ll_healthyactivity_view.addView(viewgone);
                Button bt_healthystategone_send = (Button) viewgone.findViewById(R.id.bt_healthystategone_send);
                TextView tv_healthygone_date = (TextView) viewgone.findViewById(R.id.tv_healthygone_date);
                TextView tv_healthygone_lastdate = (TextView) viewgone.findViewById(R.id.tv_healthygone_lastdate);
                MySharePreferences.saveIntToFile(HealthyActivity.this,"currentstate",GONE);
                break;
            case CLOSE:
                //关闭状态
                View viewclose = View.inflate(HealthyActivity.this, R.layout.healthy_state_close, null);
                ll_healthyactivity_view.removeAllViews();
                ll_healthyactivity_view.addView(viewclose);
                Button bt_healthystateclose_send = (Button) viewclose.findViewById(R.id.bt_healthystateclose_send);
                MySharePreferences.saveIntToFile(HealthyActivity.this,"currentstate",CLOSE);
                break;

        }
    }
}
