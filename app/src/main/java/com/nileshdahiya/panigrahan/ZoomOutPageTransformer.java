package com.nileshdahiya.panigrahan;

import android.view.View;

import androidx.annotation.NonNull;
import androidx.viewpager2.widget.ViewPager2;

public class ZoomOutPageTransformer implements ViewPager2.PageTransformer {

    private static final float MIN_SCALE = 0.85f;
    private static final float MIN_ALPHA = 0.5f;

    @Override
    public void transformPage(@NonNull View page, float position) {
        int pageWidth = page.getWidth();
        int pageHeight = page.getHeight();

        // Scale the page down between MIN_SCALE and 1
        float scaleFactor = Math.max(MIN_SCALE, 1 - Math.abs(position));
        page.setScaleX(scaleFactor);
        page.setScaleY(scaleFactor);

        // Fade the page relative to its size
        float alpha = MIN_ALPHA + (scaleFactor - MIN_SCALE) / (1 - MIN_SCALE) * (1 - MIN_ALPHA);
        page.setAlpha(alpha);

        // Counteract the default slide transition
        if (position < 0) {
            page.setTranslationX(pageWidth * -position);
        } else {
            page.setTranslationX(0);
        }
    }
}
