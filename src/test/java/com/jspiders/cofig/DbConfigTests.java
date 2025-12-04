package com.jspiders.cofig;

import com.jspiders.config.DBConfig;
import org.hibernate.Session;

public class DbConfigTests
{
    public static void main(String[] args)
    {
        DbConnectionTest();

    }
    public static void DbConnectionTest()
    {
        System.out.println("test db connnection");
        try{
          Session session= DBConfig.getSession();
            session.close();
            DBConfig.shutdown();
            System.out.println("connection  DB passed");

        }
        catch (Exception ex){
            System.out.println(" test DB failed connection");
        }

    }
}
