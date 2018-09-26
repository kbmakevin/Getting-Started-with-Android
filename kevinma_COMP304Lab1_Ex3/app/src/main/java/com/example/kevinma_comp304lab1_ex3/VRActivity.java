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

public class VRActivity extends AppCompatActivity {

    public static Activity vrActivity;

    private TextView vrTextView;
    private ProgressDialog progressDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vr);

        vrTextView = findViewById(R.id.vrTextView);
        vrTextView.append("VR Activity - onCreate\n");

        vrActivity = this;
    }

    public void onStart() {
        super.onStart();
        vrTextView.append("VR Activity - onStart\n");
        progressDialog = ProgressDialog.show(this, "Please Wait", "VR Activity is starting...");
        CountDownTimer countDownTimer = new CountDownTimer(1000, 1000) {
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
        vrTextView.append("VR Activity - onRestart\n");
    }

    public void onResume() {
        super.onResume();
        vrTextView.append("VR Activity - onResume\n");
    }

    public void onPause() {
        super.onPause();
        vrTextView.append("VR Activity - onPause\n");
    }

    public void onStop() {
        super.onStop();
        vrTextView.append("VR Activity - onStop\n");
    }

    public void onDestroy() {
        super.onDestroy();
        // don't need to append this text as we will never see the text view again
        // simply use toast to display short lived message on screen
        // vrTextView.append("VR Activity - onDestroy\n");
        Toast.makeText(this, "VR Activity - onDestroy", Toast.LENGTH_SHORT).show();
        vrActivity = null;
    }

    public void onRtnMainBtnClick(View view) {
        Toast.makeText(this, R.string.rtn_main_toast_msg, Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this, MainActivity.class));
    }
}
