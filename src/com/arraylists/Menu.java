package com.arraylists;
import  java.util.Scanner;
import java.util.ArrayList;
public class Menu {
    public static void main(String [] args){

        ArrayList<Integer> integer= new ArrayList<>();
        Scanner scn =new Scanner(System.in);

        while(true){
            displayMenu();
            int choice =scn.nextInt();

            if(choice==1){
                System.out.println("Enter a integer");
                integer.add(scn.nextInt());
                System.out.println("Added");
            }else if(choice==2){
                System.out.println("Enter a integer to be removed");
                int elementToRemove= scn.nextInt();
                if(integer.contains(elementToRemove)){
                    integer.remove(Integer.valueOf(elementToRemove));
                    System.out.println("Removed");
                }else{
                    System.out.println("Element not found");
                    System.out.println("Enter the element which is there in list");
                }
            }else if(choice==3){
                System.out.println("Displaying the elements");
                System.out.println(integer);
            }else if(choice==4){
                System.out.println("GoodBye");
                break;
            }

        }
    }

    private static void displayMenu(){
        System.out.println();
        System.out.println("1.Add");
        System.out.println("2.Remove");
        System.out.println("3.Display");
        System.out.println("4.Exit");
        System.out.println();
        System.out.println("Your choice");
    }

}

