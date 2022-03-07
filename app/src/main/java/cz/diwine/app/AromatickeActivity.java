package cz.diwine.app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

public class AromatickeActivity extends AppCompatActivity {

    ImageView aromatickybile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aromaticke);

        aromatickybile=findViewById(R.id.aromatickyBile);
        aromatickybile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RotateAnimation rotateAnimation=new RotateAnimation(0, 360, RotateAnimation.RELATIVE_TO_SELF,
                        .5f, RotateAnimation.RELATIVE_TO_SELF
                        ,.5f);

                rotateAnimation.setDuration(5000);
                aromatickybile.startAnimation(rotateAnimation);
            }
        });

        getWindow().setStatusBarColor(ContextCompat.getColor(AromatickeActivity.this,R.color.bckgColor));




    }
}