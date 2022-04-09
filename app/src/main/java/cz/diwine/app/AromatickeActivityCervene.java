package cz.diwine.app;

import android.os.Bundle;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class AromatickeActivityCervene extends AppCompatActivity {

    ImageView aromatickycervene;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aromaticke_cervene);

        aromatickycervene=findViewById(R.id.aromatickyCervene);
        aromatickycervene.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                RotateAnimation rotateAnimation=new RotateAnimation(0, 360, RotateAnimation.RELATIVE_TO_SELF,
                        .5f, RotateAnimation.RELATIVE_TO_SELF
                        ,.5f);

                rotateAnimation.setDuration(5000);
                aromatickycervene.startAnimation(rotateAnimation);
            }
        });

        getWindow().setStatusBarColor(ContextCompat.getColor(AromatickeActivityCervene.this,R.color.bckgColor));




    }
}