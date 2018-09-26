package com.example.kevinma_comp304lab1_ex3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (VRActivity.vrActivity != null)
            findViewById(R.id.closeVrBtn).setEnabled(true);
        else
            findViewById(R.id.closeVrBtn).setEnabled(false);

        if (AIActivity.aiActivity != null)
            findViewById(R.id.closeAiBtn).setEnabled(true);
        else
            findViewById(R.id.closeAiBtn).setEnabled(false);
    }

    public void onLaunchVrBtnClick(View view) {
        Toast.makeText(this, R.string.vr_launch_toast_msg, Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this, VRActivity.class));
    }

    public void onCloseVrBtnClick(View view) {
        VRActivity.vrActivity.finish();
        findViewById(R.id.closeVrBtn).setEnabled(false);
    }

    public void onLaunchAiBtnClick(View view) {
        Toast.makeText(this, R.string.ai_launch_toast_msg, Toast.LENGTH_SHORT).show();
        startActivity(new Intent(this, AIActivity.class));
    }

    public void onCloseAiBtnClick(View view) {
        AIActivity.aiActivity.finish();
        findViewById(R.id.closeAiBtn).setEnabled(false);
    }
}
