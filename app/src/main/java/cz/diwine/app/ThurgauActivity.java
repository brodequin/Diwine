package cz.diwine.app;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class ThurgauActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thurgau);
        getWindow().setStatusBarColor(ContextCompat.getColor(ThurgauActivity.this,R.color.bckgColor));
    }
}