package com.jspiders.config;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DBConfig
{
    private static SessionFactory sessionFactory;

    static
    {
        System.out.println("load configuration");
        Configuration configuration=new Configuration();
        configuration.configure("hibernate.cfg.xml");

        sessionFactory = configuration.buildSessionFactory();
        System.out.println("buildsession factory done");

    }

    public static Session getSession(){
        Session session = sessionFactory.openSession();
        System.out.println("opne session");

        return  session;
    }

    public static void shutdown()
    {

        sessionFactory.close();
        System.out.println("sessfactory close");
    }
}
