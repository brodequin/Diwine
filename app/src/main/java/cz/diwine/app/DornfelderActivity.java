package cz.diwine.app;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class DornfelderActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dornfelder);
        getWindow().setStatusBarColor(ContextCompat.getColor(DornfelderActivity.this,R.color.bckgColorDetail));
    }
}