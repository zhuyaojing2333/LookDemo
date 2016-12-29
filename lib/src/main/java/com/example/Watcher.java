package com.example;

import java.util.Observable;
import java.util.Observer;

/**
 * Created by PigGhost on 2016/12/29.
 */

public class Watcher implements Observer {
    public Watcher(Observable o) {

        o.addObserver(this);

    }

    @Override
    public void update(Observable observable, Object o) {
        System.out.println("状态发生改变：" + ((Watched)o).getData());
    }
}
