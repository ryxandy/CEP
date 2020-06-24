package ryxandy.com.example.cep;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import gr.net.maroulis.library.EasySplashScreen;

public class SplashScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EasySplashScreen config = new EasySplashScreen(SplashScreenActivity.this)
                .withFullScreen()
                .withTargetActivity(MainActivity.class)
                .withSplashTimeOut(5000)
                .withBackgroundColor(Color.parseColor("#fce803"))
                .withAfterLogoText("Estamos trabalhando, aguarde...")
                .withLogo(R.drawable.logo);




                config.getAfterLogoTextView().setTextColor(Color.parseColor("#0073a8"));
                config.getAfterLogoTextView().setTextSize(20);


        View EasyScreen = config.create();
        setContentView(EasyScreen);

    }

}
