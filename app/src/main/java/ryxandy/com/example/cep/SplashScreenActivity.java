package ryxandy.com.example.cep;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;

import gr.net.maroulis.library.EasySplashScreen;

public class SplashScreenActivity extends AppCompatActivity {

    ImageView correio;
    private static int SPLASH_TIME_OUT = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_screen_layout);
        correio = findViewById(R.id.imgCorreioSplash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent Homeintent = new Intent(SplashScreenActivity.this,MainActivity.class);
                startActivity(Homeintent);
                finish();
            }
        },SPLASH_TIME_OUT);


        // EasySplashScreen config = new EasySplashScreen(SplashScreenActivity.this)
        //   .withFullScreen()
        //   .withTargetActivity(MainActivity.class)
        //   .withSplashTimeOut(5000)
        //   .withBackgroundColor(Color.parseColor("#fce803"))
        //  .withAfterLogoText("Estamos trabalhando, aguarde...")
        //  .withLogo(R.drawable.logo);




        //    config.getAfterLogoTextView().setTextColor(Color.parseColor("#0073a8"));
        //     config.getAfterLogoTextView().setTextSize(20);


        //  View EasyScreen = config.create();
        //  setContentView(EasyScreen);

    }

}
