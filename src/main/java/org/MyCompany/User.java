package org.MyCompany;

import java.util.Scanner;

public class User {
    private Scanner sc;
    private int input = 0;

    public int getInput() {
        sc = new Scanner(System.in);
        while (input == 0){
            System.out.println("Please enter your search criteria (number 1-4): \n" +
                    "1. ticket price \n" +
                    "2. flight duration \n" +
                    "3. departure time \n" +
                    "4. arival time \n");
            input = sc.nextInt();
        }

        return input;
    }
}
