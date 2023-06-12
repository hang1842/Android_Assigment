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
// * Use the {@link DrinkMenuFragment#newInstance} factory method to
// * create an instance of this fragment.
// */
public class DrinkMenuFragment extends Fragment {

//    // TODO: Rename parameter arguments, choose names that match
//    // the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
//    private static final String ARG_PARAM1 = "param1";
//    private static final String ARG_PARAM2 = "param2";
//
//    // TODO: Rename and change types of parameters
//    private String mParam1;
//    private String mParam2;

    public DrinkMenuFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_drink_menu, container, false);
       // return view;

        RecyclerView recyclerView = view.findViewById(R.id.recycler_view);

        String[] locationNames = new String[Location.Drinks.length];
        int[] imageIds = new int[Location.Drinks.length];
        String[] locationDescription = new String[Location.Drinks.length];
        float[] locationPrice = new float[Location.Drinks.length];

        for (int i = 0; i < Location.Drinks.length; i++) {
            locationNames[i] = Location.Drinks[i].getName();
            imageIds[i] = Location.Drinks[i].getImageResourceId();
            locationDescription[i] = Location.Drinks[i].getDescription();
            locationPrice[i] = Location.Drinks[i].getPrice();
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
//     * @return A new instance of fragment DrinkMenuFragment.
//     */
//    // TODO: Rename and change types and number of parameters
//    public static DrinkMenuFragment newInstance(String param1, String param2) {
//        DrinkMenuFragment fragment = new DrinkMenuFragment();
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