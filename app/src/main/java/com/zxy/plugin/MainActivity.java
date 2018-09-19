package com.zxy.plugin;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * @author：xinyu.zhou
 * @version: 2018/6/6
 * @ClassName:
 * @Description: ${todo}(这里用一句话描述这个类的作用)
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView= findViewById(R.id.tv);
        textView.setText(com.zxy.plugin.MyPlguinTestClass.str);
    }
}
