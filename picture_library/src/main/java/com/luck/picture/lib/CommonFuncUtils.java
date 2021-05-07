package com.luck.picture.lib;

import android.app.Instrumentation;

/**
 * @ClassName: MD5Utils
 * @Description: java类作用描述
 * @Author: chenzhicheng
 * @Date: 2021/2/25 15:25
 */
public class CommonFuncUtils {

    public static void simulateKeystroke(final int KeyCode) {


        new Thread(new Runnable() {

            public void run() {
                // TODO Auto-generated method stub
                try {

                    Instrumentation inst=new Instrumentation();
                    inst.sendKeyDownUpSync(KeyCode);
                } catch (Exception e) {
                    // TODO: handle exception
                }
            }
        }).start();
    }
}
