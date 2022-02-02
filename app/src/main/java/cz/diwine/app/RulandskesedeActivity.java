package cz.diwine.app;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class RulandskesedeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rulandskesede);
        getWindow().setStatusBarColor(ContextCompat.getColor(RulandskesedeActivity.this,R.color.bckgColor));
    }
}