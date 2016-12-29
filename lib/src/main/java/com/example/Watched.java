package com.example;

import java.util.Observable;

/**
 * Created by PigGhost on 2016/12/29.
 */

public class Watched extends Observable {
    private String data = "";

    public String getData() {
        return data;
    }

    public void setData(String data) {

        if(!this.data.equals(data)){
            this.data = data;
            setChanged();
        }

        notifyObservers();
    }
}
