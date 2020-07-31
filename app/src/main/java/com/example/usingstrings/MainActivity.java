package com.example.usingstrings;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView txtVMasg2 =findViewById(R.id.TvMsg2);

        txtVMasg2.setText(R.string.Masg2);

        Log.i("LifeCycle","OnCreate invoked");



    }


    public void onStart(){

        super.onStart();
        Log.i("LifeCycle","onStart() invoked");

    }


    public void onRestart(){

        super.onRestart();
        Log.i("LifeCycle","onRestart() invoked");

    }

    public void onResume(){

        super.onResume();
        Log.i("LifeCycle","onResume() invoked");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("LifeCycle","onPause() invoked");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("LifeCycle","onStop() invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("LifeCycle","onDestroy() invoked");
    }
}
