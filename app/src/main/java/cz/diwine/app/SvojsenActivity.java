package cz.diwine.app;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class SvojsenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_svojsen);
        getWindow().setStatusBarColor(ContextCompat.getColor(SvojsenActivity.this,R.color.bckgColor));
    }
}