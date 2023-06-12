package com.greg.assigment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

///**
// * A simple {@link Fragment} subclass.
// * Use the {@link DessertMenuFragment#newInstance} factory method to
// * create an instance of this fragment.
// */
public class DessertMenuFragment extends Fragment {

//    // TODO: Rename parameter arguments, choose names that match
//    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//    private static final String ARG_PARAM1 = "param1";
//    private static final String ARG_PARAM2 = "param2";
//
//    // TODO: Rename and change types of parameters
//    private String mParam1;
//    private String mParam2;

    public DessertMenuFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_dessert_menu, container, false);
        //return view;

        RecyclerView recyclerView = view.findViewById(R.id.recycler_view);

        String[] locationNames = new String[Location.Desserts.length];
        int[] imageIds = new int[Location.Desserts.length];
        String[] locationDescription = new String[Location.Desserts.length];
        float[] locationPrice = new float[Location.Desserts.length];

        for (int i = 0; i < Location.Desserts.length; i++) {
            locationNames[i] = Location.Desserts[i].getName();
            imageIds[i] = Location.Desserts[i].getImageResourceId();
            locationDescription[i] = Location.Desserts[i].getDescription();
            locationPrice[i] = Location.Desserts[i].getPrice();
        }
            GridLayoutManager gridLayoutManager = new GridLayoutManager(view.getContext(), 2,
                    GridLayoutManager.HORIZONTAL, false);
            recyclerView.setLayoutManager(gridLayoutManager);

            CaptionedImagesAdapter adapter = new CaptionedImagesAdapter(locationNames, locationDescription, locationPrice, imageIds);
            recyclerView.setAdapter(adapter);
            return view;


    }
//    /**
//     * Use this factory method to create a new instance of
//     * this fragment using the provided parameters.
//     *
//     * @param param1 Parameter 1.
//     * @param param2 Parameter 2.
//     * @return A new instance of fragment DessertMenuFragment.
//     */
//    // TODO: Rename and change types and number of parameters
//    public static DessertMenuFragment newInstance(String param1, String param2) {
//        DessertMenuFragment fragment = new DessertMenuFragment();
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