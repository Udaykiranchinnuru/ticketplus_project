package com.jspiders.main;

import com.jspiders.users.AdminServiceImpl;

import java.util.Scanner;

public class TicketPlusApplication {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Select User Type" +"\n"+
                "1.Admin\n" +
                "2.Customer\n" +
                "3.Exit");

        Integer user = scanner.nextInt();
        switch (user)
        {
            case 1 :
                System.out.println(
                        "1.Add Movie\n" +
                                "2.Create Show\n" +
                                "3.Exit");
                AdminServiceImpl adminService = new AdminServiceImpl();
                Integer choice = scanner.nextInt();

                switch (choice) {
                    case 1 :  adminService.createMovie();
                    default: break;
                }
                break;

            default: System.exit(0);
        }
    }
}