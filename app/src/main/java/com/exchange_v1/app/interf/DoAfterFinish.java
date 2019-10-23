package com.exchange_v1.app.interf;

import android.content.Context;

import java.io.Serializable;

public interface DoAfterFinish extends Serializable {

    //执行相关操作
    public void execute(Context context);

}
