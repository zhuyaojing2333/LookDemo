package com.bw.ddvs;

/**
 * Created by PigGhost on 2016/12/29.
 * 观察者接口
 */

public interface Watcher {
    //再定义一个用来接收更新信息的方法
    public void updateNotify(Content content);
}
