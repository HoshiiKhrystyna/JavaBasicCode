package com.syntaxclass1;

import java.util.Locale;

public class Task4 {
    //Create a method that will say Hello in different language based
    // on the country that will passed when method is executed
void sayHello(String country){
    String hello;
    country=country.toLowerCase();
    switch(country){
        case "USA":
            hello="Hola";
            break;
        case "Ukraine":
            hello="Pryvit";
            break;
        case "France":
            hello="Bounjur";
            break;
        default:
            hello="country not found";

    }
    System.out.println(hello);
}

    public static void main(String [] args){
Task4 task4=new Task4();
task4.sayHello("France");
    }
}
