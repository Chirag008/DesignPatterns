package com.cb.singletonpattern;

public class DBConnectionProviderWithNaiveThreadSafe{

    private static DBConnectionProviderWithNaiveThreadSafe instance;
    public String dbName;

    private DBConnectionProviderWithNaiveThreadSafe(String dbName){
        this.dbName = dbName;
        System.out.println("Creating new instance - with db name - " + dbName);
    }

    public static synchronized DBConnectionProviderWithNaiveThreadSafe getInstance(String dbName){
        
        if(instance == null){
            instance = new DBConnectionProviderWithNaiveThreadSafe(dbName);
        }
        
        return instance;
    }
}