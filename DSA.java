package dsa;

import java.util.*;

public class DSA {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("Enter the Desired Data Structure \n 1.Array \n 2.Linked List \n 3.Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1: {
                    Array A = new Array();
                }
                break;
                case 2:{
                    LinkedList Ls = new LinkedList();
                }
                break;
                case 3: {
                    return;
                }
                default: {
                    System.out.println("Invalid Selection");
                    return;
                }

            }
        }

    }

}
