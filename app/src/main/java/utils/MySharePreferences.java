package utils;

import android.app.Activity;
import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Administrator on 2016/9/2.
 */
public class MySharePreferences {
    public static void saveBooleanToFile(Activity activity,String key,boolean value){
        SharedPreferences preferences = activity.getSharedPreferences("config", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putBoolean(key,value);
        editor.commit();
    }
    public static boolean getBooleanFromFile(Activity activity,String key){
        SharedPreferences preferences = activity.getSharedPreferences("config", Context.MODE_PRIVATE);
        boolean value = preferences.getBoolean(key, false);
        return value;
    }
    public static void saveIntToFile(Activity activity,String key,int  value){
        SharedPreferences preferences = activity.getSharedPreferences("config", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = preferences.edit();
        editor.putInt(key,value);
        editor.commit();
    }
    public static int getIntFromFile(Activity activity,String key){
        SharedPreferences preferences = activity.getSharedPreferences("config", Context.MODE_PRIVATE);
        int value = preferences.getInt(key, 1);
        return value;
    }
}
