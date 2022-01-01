package cz.diwine.app;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class HibernalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hibernal);
        getWindow().setStatusBarColor(ContextCompat.getColor(HibernalActivity.this,R.color.bckgColorDetail));
    }
}