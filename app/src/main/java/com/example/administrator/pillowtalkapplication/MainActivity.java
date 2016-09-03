package com.example.administrator.pillowtalkapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    //跳转到纪念日页面
    public void anniversity(View v){
        startActivity(new Intent(this,AnniversaryActivity.class));
    }
    //跳转到小姨妈页面
    public void healthy(View v){
       startActivity(new Intent(this,HealthyActivity.class));
    }
    //跳转到日记本页面
    public void TextBook(View v){
        startActivity(new Intent(this,TextBookActivity.class));
    }
    //跳转到私密相册页面
    public void photo(View view){
        startActivity(new Intent(this,PhotoActivity.class));
    }

}
