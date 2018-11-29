package com.kiu.heyindia;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;

public class LogInActivity extends AppCompatActivity {

    private static final String TAG = "kant";
    private Button logInBtn;
    private Window mWindow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(Window.FEATURE_NO_TITLE);

        try {
            setContentView(R.layout.activity_login);
        } catch (Exception e) {
            Log.d(TAG, "onCreate: LogIn crash");
        }

        // To make transparent the status bar of splash screen
        mWindow = getWindow();
        mWindow.getDecorView().setSystemUiVisibility(
                View.SYSTEM_UI_FLAG_LAYOUT_STABLE
                        | View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN);

        //@link all views of layout
        findViews();


        //Handle LogIn click listener
        logInBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), HomeActivity.class));
            }
        });

    }

    private void findViews() {
        logInBtn = findViewById(R.id.loginBtnSubmit);
    }
}
