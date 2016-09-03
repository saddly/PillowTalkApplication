package com.example.administrator.pillowtalkapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.GridView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class PhotoActivity extends AppCompatActivity {

    private GridView gv_photoactivity_photoes;
    private LinearLayout ll_photoactivity_bottomitem;
    private int measuredHeight;
    private TextView tv_photoactivity_photonum;
    private LinearLayout ll_photoactivity_editbottomitem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo);
        getSupportActionBar().hide();
        gv_photoactivity_photoes = (GridView) findViewById(R.id.gv_photoactivity_photoes);
        ll_photoactivity_bottomitem = (LinearLayout) findViewById(R.id.ll_photoactivity_bottomitem);
        tv_photoactivity_photonum = (TextView) findViewById(R.id.tv_photoactivity_photonum);
        ll_photoactivity_editbottomitem = (LinearLayout) findViewById(R.id.ll_photoactivity_editbottomitem);
        //将第一个item隐藏
        ll_photoactivity_bottomitem.measure(0,0);
        measuredHeight = ll_photoactivity_bottomitem.getMeasuredHeight();
        ll_photoactivity_bottomitem.setPadding(0,0,0,-measuredHeight);
        //将第二个item隐藏

    }
    public void showBottomItem(View v){
        ll_photoactivity_bottomitem.setPadding(0,0,0,0);
    }
    public void back(View v){
        finish();
    }
    public void cancle(View v){
        ll_photoactivity_bottomitem.setPadding(0,0,0,-measuredHeight);
    }
    public void edit(View v){

    }
    public void upload(View v){

    }
    public void cancleedit(View v){

    }
}
