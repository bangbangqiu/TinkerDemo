package com.qiubangbang.tinkerdemo;

import android.app.Application;
import android.content.Context;
import android.content.Intent;

import com.tencent.tinker.anno.DefaultLifeCycle;
import com.tencent.tinker.lib.tinker.TinkerInstaller;
import com.tencent.tinker.loader.app.DefaultApplicationLike;
import com.tencent.tinker.loader.shareutil.ShareConstants;

/**
 * Created by qiubangbang on 2017/2/15.
 */

@DefaultLifeCycle(application = ".Application",
        flags = ShareConstants.TINKER_ENABLE_ALL,
        loadVerifyFlag = false)

public class ApplicationLike extends DefaultApplicationLike {
    public ApplicationLike(Application application, int tinkerFlags, boolean tinkerLoadVerifyFlag, long applicationStartElapsedTime, long applicationStartMillisTime, Intent tinkerResultIntent) {
        super(application, tinkerFlags, tinkerLoadVerifyFlag, applicationStartElapsedTime, applicationStartMillisTime, tinkerResultIntent);
    }

    @Override
    public void onBaseContextAttached(Context base) {
        super.onBaseContextAttached(base);
        TinkerInstaller.install(this);
    }
}
