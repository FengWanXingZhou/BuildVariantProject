package com.buildvariantproject.view.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.buildvariantproject.R;

public class MainActivity extends BaseActivity {

    Button btnSelectZone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnSelectZone = (Button)findViewById(R.id.btnSelectZone);
        btnSelectZone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getNavigator().navigateToSpecialActivity(MainActivity.this);
            }
        });
    }
}
