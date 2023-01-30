package com.example.appeasily;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link home_fragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class home_fragment extends Fragment {

    // TODO: Rename parameter arguments, choose names that match
    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";


    // TODO: Rename and change types of parameters
    private String mParam1;
    private String mParam2;

    public home_fragment() {
        // Required empty public constructor
    }

    /**
     * Use this factory method to create a new instance of
     * this fragment using the provided parameters.
     *
     * @param param1 Parameter 1.
     * @param param2 Parameter 2.
     * @return A new instance of fragment home_fragment.
     */
    // TODO: Rename and change types and number of parameters
    public static home_fragment newInstance(String param1, String param2) {
        home_fragment fragment = new home_fragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        sliderAdapterInApp mySlider ;
        ViewPager viewPager ;
        RecyclerView rv ;
        ArrayList<FrameTheSales> my_frame = new ArrayList<>();

        my_frame.add(new FrameTheSales(R.drawable.images_in_app,"the product1"));
        my_frame.add(new FrameTheSales(R.drawable.images_in_app,"the product2"));
        my_frame.add(new FrameTheSales(R.drawable.images_in_app,"the product3"));
        my_frame.add(new FrameTheSales(R.drawable.images_in_app,"the product4"));
        my_frame.add(new FrameTheSales(R.drawable.images_in_app,"the product5"));
        my_frame.add(new FrameTheSales(R.drawable.images_in_app,"the product6"));
        my_frame.add(new FrameTheSales(R.drawable.images_in_app,"the product7"));
        my_frame.add(new FrameTheSales(R.drawable.images_in_app,"the product8"));
        my_frame.add(new FrameTheSales(R.drawable.images_in_app,"the product9"));
        my_frame.add(new FrameTheSales(R.drawable.images_in_app,"the product10"));
        my_frame.add(new FrameTheSales(R.drawable.images_in_app,"the product11"));


        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home_fragment, container, false);

        viewPager = (ViewPager) view.findViewById(R.id.slider_in_app);
        rv = (RecyclerView) view.findViewById(R.id.recycler_sales);


        RecyclerViewAdapter recyclerViewAdapter = new RecyclerViewAdapter(getContext(),my_frame);
        RecyclerView.LayoutManager lm =new GridLayoutManager(getContext(),2);

        rv.setAdapter(recyclerViewAdapter);
        rv.setLayoutManager(lm);
        rv.setHasFixedSize(true);

        mySlider = new sliderAdapterInApp(getContext());
        viewPager.setAdapter(mySlider);
        return view ;

    }
}