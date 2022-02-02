package cz.diwine.app;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class RyzlinkrynskyActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ryzlinkrynsky);
        getWindow().setStatusBarColor(ContextCompat.getColor(RyzlinkrynskyActivity.this,R.color.bckgColor));
    }
}