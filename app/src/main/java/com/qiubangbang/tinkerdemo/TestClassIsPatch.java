package com.qiubangbang.tinkerdemo;

import android.widget.Toast;

/**
 * Created by qiubangbang on 2017/2/15.
 */
public class TestClassIsPatch {
    public void run(MainActivity mainActivity) {
        Toast.makeText(mainActivity, "this is a new method in new class", Toast.LENGTH_SHORT).show();
    }
}
