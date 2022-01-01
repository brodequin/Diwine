package cz.diwine.app;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class ErilonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_erilon);
        getWindow().setStatusBarColor(ContextCompat.getColor(ErilonActivity.this,R.color.bckgColorDetail));
    }
}