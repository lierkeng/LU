package com.li.pc.lutils;

import android.content.Context;
import android.widget.Toast;

/**
 * author   ：mo
 * data     ：2017/1/3
 * time     ：11:29
 * function :
 */

public class ToastUtils  {
    /**
     * 显示吐司
     *
     * @param context
     * @param str
     */
    public static void showToast(Context context, String str) {
        Toast.makeText(context, str, Toast.LENGTH_LONG).show();
    }
}
