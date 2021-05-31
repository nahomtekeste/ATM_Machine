package com.eriskillshare;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int balance = 2000;
        int choose ;

        Scanner sc = new Scanner(System.in);
        System.out.println("***** Welcome to the ATM Machine ******");
        System.out.println(" Please Enter your Name : ");
        String name = sc.next();
        do {
            System.out.println("***********************************************************");
            System.out.println(" Welcome " + name + "  Choose one of the following options ");
            System.out.println("***********************************************************");
            System.out.println("\n1. Show Balance \n2. With draw Money \n3. Deposit Money \n4 Exist : ");
            choose= sc.nextInt();

            switch (choose) {
                case 1:
                    System.out.println(" Your Balances is " + balance);
                    break;
                case 2:
                    System.out.println(" ********** Withdraw Money *******");
                    System.out.println(" How much would you like to withdraw ? :");
                    int amount_withdraw = sc.nextInt();

                    if (amount_withdraw > balance) {
                        System.out.println("Invalid Input Your current balance is " + balance);
                    }else {
                        System.out.println("Are you sure you want withdraw £ " + amount_withdraw + " Y/N");
                        String sure = sc.next().toLowerCase();
                        if (sure !="N"){
                            balance = balance - amount_withdraw;
                            System.out.println(" Your New Balance is " + balance);
                        }else {
                            System.out.println("Please enter a different amount ?");
                        }
                    }
                    break;
                case 3:
                    System.out.println("**************** Deposit Money ***********");
                    System.out.println(" How much would you like to deposit? ");
                    int amount_deposit = sc.nextInt();
                    if (amount_deposit < 10 ){
                        System.out.println(" Sorry you cant Deposit less than 10 : ");
                    }else {
                        balance = balance + amount_deposit;
                        System.out.println(" Your New Balance is " + balance);
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        }while (choose != 5);
    }
}
