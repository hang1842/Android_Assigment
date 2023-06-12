package com.greg.assigment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.ListFragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

///**
// * A simple {@link Fragment} subclass.
// * Use the {@link SoupMenuFragment#newInstance} factory method to
// * create an instance of this fragment.
// */
public class SoupMenuFragment extends Fragment {

//    // TODO: Rename parameter arguments, choose names that match
//    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//    private static final String ARG_PARAM1 = "param1";
//    private static final String ARG_PARAM2 = "param2";
//
//    // TODO: Rename and change types of parameters
//    private String mParam1;
//    private String mParam2;

    public SoupMenuFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.fragment_soup_menu, container, false);
       // return view;

        RecyclerView recyclerView;
        recyclerView = view.findViewById(R.id.recycler_view);

        //populate arrays from Location
        String[] locationNames = new String[Location.Soups.length];
        int[] imageIds = new int[Location.Soups.length];
        String[] locationDescription= new String[Location.Soups.length];
        float[] locationPrice= new float[Location.Soups.length];

        for(int i = 0; i < Location.Soups.length; i++){
            locationNames[i] = Location.Soups[i].getName();
            imageIds[i] = Location.Soups[i].getImageResourceId();
            locationDescription[i]=Location.Soups[i].getDescription();
            locationPrice[i]=Location.Soups[i].getPrice();
        }

        // Inflate the layout for this fragment
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(view.getContext());
        recyclerView.setLayoutManager(linearLayoutManager);

        CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(locationNames, locationDescription,locationPrice,imageIds);
        recyclerView.setAdapter(adapter);
        return view;
    }
//    /**
//     * Use this factory method to create a new instance of
//     * this fragment using the provided parameters.
//     *
//     * @param param1 Parameter 1.
//     * @param param2 Parameter 2.
//     * @return A new instance of fragment SoupMenuFragment.
//     */
//    // TODO: Rename and change types and number of parameters
//    public static SoupMenuFragment newInstance(String param1, String param2) {
//        SoupMenuFragment fragment = new SoupMenuFragment();
//        Bundle args = new Bundle();
//        args.putString(ARG_PARAM1, param1);
//        args.putString(ARG_PARAM2, param2);
//        fragment.setArguments(args);
//        return fragment;
//    }
//
//    @Override
//    public void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        if (getArguments() != null) {
//            mParam1 = getArguments().getString(ARG_PARAM1);
//            mParam2 = getArguments().getString(ARG_PARAM2);
//        }
//    }


}