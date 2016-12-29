package com.bw.ddvs;

/**
 * Created by PigGhost on 2016/12/29.
 * 被观察者接口
 */

public interface Watched {

    //在其接口中定义一个用来增加观察者的方法
    public void add(Watcher watcher);

    //再定义一个用来删除观察者权利的方法
    public void remove(Watcher watcher);

    //再定义一个可以实现行为变现并向观察者传输信息的方法
    public void notifyWhater(Content content);
}
