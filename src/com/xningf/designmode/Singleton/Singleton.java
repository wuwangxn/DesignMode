package com.xningf.designmode.Singleton;

import com.sun.deploy.util.StringUtils;

public class Singleton {
    private static String singleton;

    public static String getSingleton() {
        if (singleton == null || singleton == "")
            singleton = "singleton";
        return singleton;
    }
}
