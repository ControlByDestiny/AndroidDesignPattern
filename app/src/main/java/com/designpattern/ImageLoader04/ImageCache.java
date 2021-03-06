package com.designpattern.ImageLoader04;

import android.graphics.Bitmap;

public interface ImageCache {
    Bitmap getBitmap(String key);
    void putBitmap(String key,Bitmap bitmap);
}
