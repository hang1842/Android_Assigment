package com.greg.assigment;

import androidx.annotation.StringRes;

public class Location {
    private String name;
    private String description;
    private float price;
    private int imageResourceId;

    public Location(String name, String description, float price, int imageResourceId) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.imageResourceId = imageResourceId;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public float getPrice() {
        return price;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public static final Location[] Soups={
            new Location("Grid Box Hotpot","Nine squares, each with different flavors and spiciness",55.00f,
                    R.drawable.gridbox),
            new Location("ZiMu Hotpot","Nested together, two concentric pots, one large and one small, can be used to place soup of different flavors and spiciness",45.00f,
                    R.drawable.zimu),
            new Location("Mandarin Duck Hotpot","There is a partition in the pot to divide the soup with different flavors and spiciness",45.00f,
                    R.drawable.mandarinduck),
            new Location("Mushroom Hotpot","Cooked together with various fresh mushrooms, it has a delicious taste and rich nutrition",35.00f,
                    R.drawable.mushroom),
    };

    public static final Location[] Vegetables={
            new Location("Needle Mushroom"," ",20.00f,
                    R.drawable.needlemushroom),
            new Location("Chinese cabbage","",15.00f,
                    R.drawable.chinesecabbage),
            new Location("Mooli","",15.00f,
                    R.drawable.mooli),
            new Location("The Lotus Root","",25.00f,
                    R.drawable.lotusroot),
            new Location("Tofu Skin","",15.00f,
                    R.drawable.tofuskin),
            new Location("Laminaria Japonica","",20.00f,
                    R.drawable.laminariajaponica),
    };

    public static final Location[] Meals={
            new Location("Lamb Roll","",55.00f,
                    R.drawable.lamb),
            new Location("Beef Roll","",45.00f,
                    R.drawable.beef),
            new Location("Pork Roll","",45.00f,
                    R.drawable.pork),
            new Location("Beef Omasum","",35.00f,
                    R.drawable.beefomasum),
            new Location("Shrimp","",55.00f,
                    R.drawable.shrimp),
            new Location("Huang Hou","",45.00f,
                    R.drawable.huanghou),
            new Location("Corydoras","",45.00f,
                    R.drawable.corydoras),
            new Location("Shrimp Paste","",35.00f,
                    R.drawable.shrimppaste),
    };

    public static final Location[] Drinks={
            new Location("Herbal Tea","",8.00f,
                    R.drawable.herbaltea),
            new Location("Coke","",5.00f,
                    R.drawable.coke),
            new Location("Sprite","",5.00f,
                    R.drawable.sprite),
            new Location("Lemon & Paeroa","",5.00f,
                    R.drawable.lp),
            new Location("Coconut Milk","",5.00f,
                    R.drawable.coconutmilk),
    };

    public static final Location[] Desserts={
            new Location("Guiling Paste","",10.00f,
                    R.drawable.guilingpaste),
            new Location("Papaya Water","",8.00f,
                    R.drawable.papayawater),
            new Location("Cheese Cake","",15.00f,
                    R.drawable.cheesecake),
            new Location("Chocolate Lava Cake","",15.00f,
                    R.drawable.chocolatelavacake),
            new Location("Apple Pie","",10.00f,
                    R.drawable.mandarinduck),
            new Location("Brown Sugar Glutinous Rice Cake","",20.00f,
                    R.drawable.mushroom),
    };
}
