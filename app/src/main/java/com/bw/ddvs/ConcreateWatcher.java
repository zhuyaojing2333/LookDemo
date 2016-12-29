package com.bw.ddvs;

/**
 * Created by PigGhost on 2016/12/29.
 * 观察者实现类
 */

public class ConcreateWatcher implements Watcher {

    //复写其方法
    @Override
    public void updateNotify(Content content) {
        int id = content.getId();
        String name = content.getName();
        String address = content.getAddress();

        System.out.println("id:" + id + "/n name:" + name + "/n address:" + address);
    }
}
