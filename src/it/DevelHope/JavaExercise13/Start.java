package it.DevelHope.JavaExercise13;

import lombok.Data;

public class Start {



    public static void main(String[] args) {

        String myName = "Marco Lo Bello";
        boolean isMyNameEven = true;
        boolean isMyNameOdd = true;

        System.out.println("Is the number of my Name's letters Ever or Odd? ");

        if (myName.length()%2 == 0){
            System.out.println("The number of the name of your letters are Even");
        } else{
            System.out.println("The number of the name of your letters are Odd");
        }
    }







}
