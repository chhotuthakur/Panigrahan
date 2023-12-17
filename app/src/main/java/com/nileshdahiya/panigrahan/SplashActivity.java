package com.nileshdahiya.panigrahan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.FrameLayout;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {

    private ImageView logoImageView;
    private FrameLayout fragmentContainer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        logoImageView = findViewById(R.id.logoImageView);
        fragmentContainer = findViewById(R.id.fragmentContainer);

        final Animation slideUpAnimation = AnimationUtils.loadAnimation(this, R.anim.slide_up);

        // Set up a listener to start the animation when the logo is clicked
//        logoImageView.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                fragmentContainer.setVisibility(View.VISIBLE);
//                fragmentContainer.startAnimation(slideUpAnimation);
//            }
//        });
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                fragmentContainer.setVisibility(View.VISIBLE);
                fragmentContainer.startAnimation(slideUpAnimation);
            }
        },4000);

        // Load the login fragment
        LoginFragment loginFragment = new LoginFragment();
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fragmentContainer, loginFragment);
        fragmentTransaction.commit();

    }
}