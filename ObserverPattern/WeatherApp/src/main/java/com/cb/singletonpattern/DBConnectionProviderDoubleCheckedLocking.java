package com.cb.singletonpattern;

public class DBConnectionProviderDoubleCheckedLocking{

    private static volatile DBConnectionProviderDoubleCheckedLocking instance;
    public String dbName;

    private DBConnectionProviderDoubleCheckedLocking(String dbName){
        this.dbName = dbName;
        System.out.println("Creating new instance - with db name - " + dbName);
    }

    public static DBConnectionProviderDoubleCheckedLocking getInstance(String dbName){
        if(instance == null){

            synchronized(DBConnectionProviderDoubleCheckedLocking.class){
                if(instance == null){
                    instance = new DBConnectionProviderDoubleCheckedLocking(dbName);
                }
            }
        }
        
        return instance;
    }
}