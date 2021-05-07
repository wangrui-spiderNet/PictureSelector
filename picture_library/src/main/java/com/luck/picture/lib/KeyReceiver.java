package com.luck.picture.lib;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.view.KeyEvent;

public class KeyReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        int keyCode = intent.getIntExtra("keyCode", 0);
        if (keyCode == 0) {//????H941
            keyCode = intent.getIntExtra("keycode", 0);
        }
        boolean keyDown = intent.getBooleanExtra("keydown", false);
        long now = SystemClock.uptimeMillis();
        if (keyDown) {
            switch (keyCode) {
                case KeyEvent.KEYCODE_F2:
//                    ToastUtils.showShort("f1");
//                        super.on
//                        KeyEvent keyEvent = KeyEvent.KEYCODE_VOLUME_DOWN;
//                        onKeyDown(KeyEvent.KEYCODE_BACK, new KeyEvent(now, now, KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_DPAD_UP, 0, 0, 4, 108));
                    CommonFuncUtils.simulateKeystroke(KeyEvent.KEYCODE_BACK);
//                        dispatchKeyEvent(new KeyEvent(KeyEvent.ACTION_DOWN, KeyEvent.KEYCODE_BACK));
//                    dialog_Exit(BaseDataSource.getInstance().getmActivity().getApplicationContext());
                    break;
                case KeyEvent.KEYCODE_F1:
//                    ToastUtils.showShort("f2");
//                        getDe
                    CommonFuncUtils.simulateKeystroke(KeyEvent.KEYCODE_DPAD_CENTER);
                    break;
            }
        } else {
            switch (keyCode) {
                case KeyEvent.KEYCODE_F1:
//                    ToastUtils.showShort("f1");
                    break;
                case KeyEvent.KEYCODE_F2:
//                    ToastUtils.showShort("f2");
                    break;
            }

        }


    }
}