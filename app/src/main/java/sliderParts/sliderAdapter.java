package sliderParts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;

import androidx.viewpager.widget.PagerAdapter;

import com.example.appeasily.R;
import com.google.android.material.snackbar.ContentViewCallback;

import org.w3c.dom.Text;

public class sliderAdapter extends PagerAdapter {

    Context context ;
    LayoutInflater inflater ;



   public String [] list_title = {
           "Fast",
           "security",
           "all you need",
           "start"
   };


   public String [] list_description = {
           "description1",
           "description2",
           "description3",
           "description4"
   };


   public int [] list_images = {
           R.drawable.image_1,
           R.drawable.image_2,
           R.drawable.image_3,
           R.drawable.image_4
    };




   public sliderAdapter (Context context){
       this.context = context ;
   }

    @Override
    public int getCount() {
        return list_title.length;
    }

    @Override
    public boolean isViewFromObject(@NonNull View view, @NonNull Object object) {
        return (view == (LinearLayout)object);
    }


    @NonNull
    @Override
    public Object instantiateItem(@NonNull ViewGroup container, int position) {
        inflater  =(LayoutInflater) context.getSystemService(context.LAYOUT_INFLATER_SERVICE);

        View view = inflater.inflate(R.layout.slider_custom,container,false);


        ImageView imageView = (ImageView) view.findViewById(R.id.img_item);
        TextView textView  = (TextView) view.findViewById(R.id.title_item);
        TextView textView1 = (TextView) view.findViewById(R.id.description_item);

        imageView.setImageResource(list_images[position]);
        textView.setText(list_title[position]);
        textView1.setText(list_description[position]);

        container.addView(view);
        return view;
    }




    @Override
    public void destroyItem(@NonNull ViewGroup container, int position, @NonNull Object object) {
             container.removeView((LinearLayout)object);
    }



}
