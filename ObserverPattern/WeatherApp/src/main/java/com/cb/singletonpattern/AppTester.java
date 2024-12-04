package com.cb.singletonpattern;

public class AppTester {

    public static void main(String[] args) throws InterruptedException {
        
        for(int i=1; i<=10; i++){
            System.out.println("Created thread - " + i);
            new Thread(){
                public void run(){
                    // DBConnectionProviderWithoutThreadSafe.getInstance("db_"+Math.random());
                    // DBConnectionProviderWithNaiveThreadSafe.getInstance("db_" + Math.random());
                    DBConnectionProviderDoubleCheckedLocking.getInstance("db_" + Math.random());
                }
            }.start();
            // Thread.sleep(1000);
        }

    }
    
}
