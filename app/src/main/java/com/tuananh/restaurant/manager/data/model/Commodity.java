package com.tuananh.restaurant.manager.data.model;

/**
 * Created by framgia on 09/10/2016.
 */
public class Commodity {
    private int mId;
    private int mName;
    private int mCost;

    public Commodity(int id, int name, int cost) {
        mId = id;
        mName = name;
        mCost = cost;
    }

    public Commodity(int name, int cost) {
        mName = name;
        mCost = cost;
    }

    public int getId() {
        return mId;
    }

    public int getName() {
        return mName;
    }

    public int getCost() {
        return mCost;
    }
}
