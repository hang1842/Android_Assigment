package com.greg.assigment;

import android.content.ClipData;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;

import java.util.Random;

public class CaptionedImagesAdapter extends RecyclerView.Adapter<CaptionedImagesAdapter.ViewHolder>
{
    boolean selected = false;
    private String[] name;
    private int[] imageId;

    private String[] description;

    private float[] prices;


    public CaptionedImagesAdapter(String[] name, String[] description, float[] prices, int[] imageId) {
        this.name = name;
        this.imageId = imageId;
        this.description = description;
        this.prices = prices;
    }

    @NonNull
    @Override
    public CaptionedImagesAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        MaterialCardView materialCardView = (MaterialCardView)
                LayoutInflater.from(parent.getContext()).inflate(R.layout.card_captioned_image, parent, false);
        return new ViewHolder(materialCardView);

//        EditText editText = materialCardView.findViewById(R.id.txt_quantity);
//        Button button = materialCardView.findViewById(R.id.but_confirm);

    }

    @Override
    public void onBindViewHolder(@NonNull CaptionedImagesAdapter.ViewHolder holder, int position) {
        MaterialCardView mcv = holder.materialCardView;
        ImageView imageView = mcv.findViewById(R.id.info_image);
        imageView.setImageResource(imageId[position]);
        imageView.setContentDescription(name[position]);

        TextView textView_name = mcv.findViewById(R.id.info_name);
        textView_name.setText(name[position]);

        TextView textView_description=mcv.findViewById(R.id.info_description);
        textView_description.setText(description[position]);

        TextView textView_price=mcv.findViewById(R.id.info_price);
        textView_price.setText(String.valueOf(prices[position]));

//        holder.addToOrderButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                String NAME = item.getName();
//              int QUANTITY = Integer.parseInt(holder.quantityEditText.getText().toString());
//              float PRICE = item.getPrice();
//
//              Order order = new Order(NAME,QUANTITY,PRICE);
//              sqLiteDatabase.insert("Order", null, order);
//            }
//        });


    }


    @Override
    public int getItemCount() {
        return name.length;
    }

    public  boolean click_selected(){
       return selected = true;
    }

    public  static class ViewHolder extends RecyclerView.ViewHolder {
        private MaterialCardView materialCardView;
        CardView cardView;
        Button addToOrderButton;
        EditText quantityEditText;
        public ViewHolder(MaterialCardView materialCardView){
            super(materialCardView);
            this.materialCardView = materialCardView;
            cardView = itemView.findViewById(R.id.card_view);
            addToOrderButton = itemView.findViewById(R.id.confirm);
            quantityEditText = itemView.findViewById(R.id.quantity);

        }


    }
}
