package com.qiubangbang.tinkerdemo;

import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.tencent.tinker.lib.tinker.TinkerInstaller;

import java.io.File;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static final String TAG = "MainActivity";
    private Button btnLoadPatch;
    private TextView tvShowPatch;
    private File patchFile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnLoadPatch = (Button) findViewById(R.id.btn_loadPatch);
        tvShowPatch = (TextView) findViewById(R.id.tv_showPatch);
        btnLoadPatch.setOnClickListener(this);
        Log.d(TAG, "onCreate: ");
        patchFile = new File(Environment.getExternalStorageDirectory(), "patch_" + BuildConfig.VERSION_NAME + ".apk");
    }

    @Override
    public void onClick(View v) {
//        if (patchFile.exists()) {
//            TinkerInstaller.onReceiveUpgradePatch(this, patchFile.getAbsolutePath());
//        } else {
//            Toast.makeText(this, "找不到补丁文件" + patchFile.getAbsolutePath(), Toast.LENGTH_SHORT).show();
//        }
        newMethod();
        new TestClassIsPatch().run(this);
    }

    private void newMethod(){
        Toast.makeText(this, "i am a new Method", Toast.LENGTH_SHORT).show();
    }
}
