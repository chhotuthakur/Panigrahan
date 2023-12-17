package com.nileshdahiya.panigrahan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class AuthActivity extends AppCompatActivity {

    ViewPager2 viewPager2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_auth);
        viewPager2 = findViewById(R.id.auth_holder);
        List<Fragment> fragments = new ArrayList<>();
        fragments.add(new ProfilebaseFragmnet());
        fragments.add(new ProfilefamFragment());
        fragments.add(new ProfileeduFragment());

        viewPager2.setAdapter(new AuthPagerAdapter(this, fragments));

        viewPager2.setPageTransformer(new ZoomOutPageTransformer());



    }

}