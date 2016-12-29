package com.bw.ddvs;

import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements Watcher{
    private TextView tv;
    Handler handler = new Handler();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv = (TextView) findViewById(R.id.tv);

        doTest();
    }

    private void doTest() {
        // 实例一个被观察者
        // 使用时可使用单例,在Application中进行
        final Watched watched = new ConcreateWatched();

        watched.add(this);

        // 当被观察者发生变化时：调用其信息方法
        Content content = new Content();

        content.setId(994112);

        content.setName("PigGhost");

        content.setAddress("翠云涧");

        doDateChange(watched, content);

        // 被观察者可以调用删除方法
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Content content = new Content();
                content.setId(125589);

                content.setName("Zhaoyingjie");

                content.setAddress("北京市海淀区");
                doDateChange(watched, content);
            }
        }, 3000);
    }

    public void doDateChange(Watched watched, Content content){
        watched.notifyWhater(content);
    }

    @Override
    public void updateNotify(Content content) {
        final String s = "mine  id = " + content.getId() + "  name = " + content.getName();

        doShowTest(s);
    }

    private void doShowTest(String s) {
        tv.setText(s);
    }
}
