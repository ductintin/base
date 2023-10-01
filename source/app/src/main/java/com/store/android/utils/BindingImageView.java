package com.store.android.utils;

import android.widget.ImageView;

import androidx.databinding.BindingAdapter;

import com.bumptech.glide.Glide;
import com.store.android.R;

public class BindingImageView {
    @BindingAdapter("android:src")
    public static void setImageUrl(ImageView view, String url) {
        Glide.with(view.getContext())
                .load(url)
                .error(R.drawable.ic_error_outline_white_24dp)
                .into(view);
    }
}
