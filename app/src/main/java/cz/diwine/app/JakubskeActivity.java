package cz.diwine.app;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class JakubskeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jakubske);
        getWindow().setStatusBarColor(ContextCompat.getColor(JakubskeActivity.this,R.color.bckgColorDetail));
    }
}