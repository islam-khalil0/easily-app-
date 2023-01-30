package com.example.appeasily;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.viewpager.widget.PagerAdapter;

public class sliderAdapterInApp extends PagerAdapter {


    Context context ;
    LayoutInflater inflater ;


    public int [] list_images = {
            R.drawable.images_in_app2,
            R.drawable.images_in_app2,
            R.drawable.images_in_app2,
            R.drawable.images_in_app2
    };





    public sliderAdapterInApp (Context context){
        this.context = context ;
    }


    @Override
    public int getCount() {
        return list_images.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view == (LinearLayout) object);
    }


    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        inflater  =(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);
        View view = inflater.inflate(R.layout.slider_custom_in_app,container,false);

        ImageView imageView1 = view.findViewById(R.id.img_item);
        imageView1.setImageResource(list_images[position]);

        container.addView(view);
        return view;
    }


    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
        container.removeView((LinearLayout)object);
    }

}
