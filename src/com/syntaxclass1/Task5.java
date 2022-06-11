package com.syntaxclass1;

public class Task5 {
  //  Create a method createEmail(). Based on values of users
    //  name, lastName and email type, your method should return
    //  complete email Address. Example:
    //  createEmail(John, Snow, gmail) → johnsnow@gmail.com
String completeEmail(String firstName,String lastName, String emailTipe){
return firstName+lastName+"@"+emailTipe+".com";
}

    public static void main(String [] args){
        Task5 task5=new Task5();
        System.out.println(task5.completeEmail("Khrystyna","Hoshii","gmail"));
    }
}
