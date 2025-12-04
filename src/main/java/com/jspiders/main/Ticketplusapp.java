package com.jspiders.main;

import com.jspiders.users.AdminServiceImpl;

import java.util.Scanner;

public class Ticketplusapp
{
    static Scanner scanner= new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println();
        System.out.println("======welcome to ticketplus App======");

        System.out.println("select user type");

        System.out.println("1..admin\n"+"2.customer \n"+"any key for exit\n");


        Integer user= scanner.nextInt();

        switch (user)
        {
            case 1:
                System.out.println("ADMIN");
                AdminServiceImpl adminService=new AdminServiceImpl();
                System.out.println("1.add movie \n"+"2.create show\n"+"any key for exit");
                
                Integer adminoptions=scanner.nextInt();



        }
    }
}
