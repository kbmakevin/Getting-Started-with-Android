package com.example.kevinma_comp304lab1_ex2;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onClickDisplayButton(View view){
        Intent i = new Intent(this,DisplayActivity.class);
        startActivity(i);
    }
}
