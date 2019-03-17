package com.xningf.designmode.Singleton;

import com.sun.deploy.util.StringUtils;

public class Singleton {

    static class sing{//静态内部类
        public static String singleton = "gingleton";
    }

    public static String getSingleton() {
        return sing.singleton;
    }
}
