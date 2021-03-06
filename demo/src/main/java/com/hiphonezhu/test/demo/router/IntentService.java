package com.hiphonezhu.test.demo.router;

import com.android.baseline.framework.router.IntentWrapper;
import com.android.baseline.framework.router.annotations.ClassName;
import com.android.baseline.framework.router.annotations.Key;
import com.android.baseline.framework.router.annotations.RequestCode;
import com.android.baseline.framework.router.annotations.TargetClass;
import com.hiphonezhu.test.demo.ActivityDemo2;

/**
 * Activity跳转路由
 * @author hiphonezhu@gmail.com
 * @version [Android-BaseLine, 16/10/21 12:23]
 */

public interface IntentService {
    @ClassName("com.hiphonezhu.test.demo.ActivityDemo2")
    @RequestCode(100)
    void intent2ActivityDemo2(@Key("platform") String platform, @Key("year") int year);

    @TargetClass(ActivityDemo2.class)
    IntentWrapper intent2ActivityDemo2Raw(@Key("platform") String platform, @Key("year") int year);
}
