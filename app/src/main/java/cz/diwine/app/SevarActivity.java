package cz.diwine.app;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class SevarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sevar);
        getWindow().setStatusBarColor(ContextCompat.getColor(SevarActivity.this,R.color.bckgColor));
    }
}