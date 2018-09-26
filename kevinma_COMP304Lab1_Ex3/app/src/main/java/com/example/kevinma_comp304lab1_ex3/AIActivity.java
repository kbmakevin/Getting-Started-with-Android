package com.example.kevinma_comp304lab1_ex3;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class AIActivity extends AppCompatActivity {

    public static Activity aiActivity;

    private TextView aiTextView;
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ai);

        aiTextView = findViewById(R.id.aiTextView);
        aiTextView.append("AI Activity - onCreate\n");

        aiActivity = this;
    }

    public void onStart() {
        super.onStart();
        aiTextView.append("AI Activity - onStart\n");
        progressDialog = ProgressDialog.show(this, "Please Wait", "AI Activity is starting...");
        CountDownTimer countDownTimer = new CountDownTimer(2000, 1000) {
            @Override
            public void onTick(long l) {
            }

            @Override
            public void onFinish() {
                progressDialog.dismiss();
            }
        }.start();
    }

    public void onRestart() {
        super.onRestart();
        aiTextView.append("AI Activity - onRestart\n");
    }

    public void onResume() {
        super.onResume();
        aiTextView.append("AI Activity - onResume\n");
    }

    public void onPause() {
        super.onPause();
        aiTextView.append("AI Activity - onPause\n");
    }

    public void onStop() {
        super.onStop();
        aiTextView.append("AI Activity - onStop\n");
    }

    public void onDestroy() {
        super.onDestroy();
        // don't need to append this text as we will never see the text view again
        // simply use toast to display short lived message on screen
        // aiTextView.append("VR Activity - onDestroy\n");
        Toast.makeText(this, "AI Activity - onDestroy", Toast.LENGTH_SHORT).show();
        aiActivity = null;
    }

    public void onRtnMainBtnClick(View view) {
        Toast.makeText(this, R.string.rtn_main_toast_msg, Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this, MainActivity.class));
    }
}
