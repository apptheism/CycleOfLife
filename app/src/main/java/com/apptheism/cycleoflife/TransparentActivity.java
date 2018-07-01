package com.apptheism.cycleoflife;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class TransparentActivity extends LoggingActivity {

    public TransparentActivity() {
        setActivityName("TransparentActivity");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_transparent);
    }
}
