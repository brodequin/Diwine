package cz.diwine.app;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class RulandskemodreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rulandskemodre);
        getWindow().setStatusBarColor(ContextCompat.getColor(RulandskemodreActivity.this,R.color.bckgColor));
    }
}