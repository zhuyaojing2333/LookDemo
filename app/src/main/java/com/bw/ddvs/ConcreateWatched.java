package com.bw.ddvs;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by PigGhost on 2016/12/29.
 * 被观察者实现类
 */

public class ConcreateWatched implements Watched {
    //定义一个List来封装Watcher
    private List<Watcher> list = new ArrayList<>();

    @Override
    public void add(Watcher watcher) {
        list.add(watcher);
    }

    @Override
    public void remove(Watcher watcher) {
        list.remove(watcher);
    }

    @Override
    public void notifyWhater(Content content) {
        for(Watcher watcher:list){
            watcher.updateNotify(content);
        }
    }
}
