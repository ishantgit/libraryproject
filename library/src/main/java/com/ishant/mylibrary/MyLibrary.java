package com.ishant.mylibrary;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Ishant Rana on 03/07/16.
 */
public class MyLibrary {
    private static MyLibrary ourinstance = new MyLibrary();

    public static MyLibrary getOurinstance() {
        return ourinstance;
    }

    private MyLibrary(){
    }

    public void showToast(Context context, String data){
        Toast.makeText(context,data, Toast.LENGTH_SHORT).show();
    }
}
