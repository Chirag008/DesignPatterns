package com.cb.singletonpattern;

public class DBConnectionProviderWithoutThreadSafe{

    private static DBConnectionProviderWithoutThreadSafe instance;
    public String dbName;

    private DBConnectionProviderWithoutThreadSafe(String dbName){
        this.dbName = dbName;
        System.out.println("Creating new instance - with db name - " + dbName);
    }

    public static DBConnectionProviderWithoutThreadSafe getInstance(String dbName){

        if(instance == null){
            instance = new DBConnectionProviderWithoutThreadSafe(dbName);
        }
        
        return instance;
    }
}