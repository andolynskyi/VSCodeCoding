package javaTasks.string;

import java.util.Random;
import java.util.Scanner;

//new addition

public class Tasks {

    //Task2
    /*
    Write a program that will generate a random uppercase letter. Print the letter.
    Hint: ascii table
     */

     public static void task2(){

        Random random = new Random();
        int num = random.nextInt(26) + 65;
        
        System.out.println((char) num);

        int n = random.nextInt(26) + 65;
        char c =  (char)n;
        
        System.out.println(c);
        
     }

    //Task3
    /*
    Write a program that will take ask the user for their age. Let the user know if they have access to the building. 
    They must be 30 years old to have access to the building.
    If the user enters an age above 100 or age less than 0, print “Not a valid age”.
    If they are old enough print “Welcome to the building” but if they are too young print “Sorry try again when you’re 30”
     */

     public static void task3(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = scanner.nextInt();

        if(age > 100 || age < 1){
            System.out.println("Not a valid age");
        }else{
            if(age < 18){
                System.out.println("Too young, goodbye");
            }else{
                System.out.println("Welcome");
            }
        } 
     }

    //Task4
    /*
    Send Message: User will enter a message, if message is valid it will be sent, there is a chance the message will not be delivered due to internet
    > User takes a message that needs to be at least 15 characters
    > If the message is valid user will see message: “sent” and “not sent” if the message was not valid
    > If message was sent there is a 50 % chance the message will not be delivered. >> If the message is delivered user will see message: “ delivered”
    HINT: use random number for random chance to send
     */
    public static void task4(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your message");
        String message = scanner.nextLine();

        Random random = new Random();
        int chance = random.nextInt(2) + 1;
        
        if(message.length() >= 5){
            if(chance % 2 == 0){
                System.out.println("Sent");
            }else{
                System.out.println("Not sent");
            }
        }else{
            System.out.println("Not valid message");
        }

        


        
    }
    
    //Task5
    /*
    User is asked to enter a sentence. Display the sentence with the first word moved to the end of the sentence.
    > input: “Java is a fun language”
    > output: “is a fun language Java”
    hint: you know the first space will be the end of the first word
     */
    public static void task5(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your sentense");
        String str = "Java is a fun language";

        System.out.println(str.substring(str.indexOf(" ") + 1) + " " + str.substring(0, str.indexOf(" ")));
        
        
    }

        //Task6
    /*
    User is asked to enter an account number. You will check if these account numbers are valid.
    > If the account number begins with a “2” the account number should be 7 characters long
    > If the account number begins with a “5” the account number should be 10 characters long
    —> If the account number does not begin with a 2 or a 5 OR the account number lengths do not meet the expected results print “ Invalid account number”
     */
    public static void task6(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter account number: ");
        String accNumber = scanner.nextLine();

        if(accNumber.substring(0, 1).equals("2") && accNumber.length() == 7 
                                    || accNumber.substring(0,1).equals("5") && accNumber.length() == 10){
            System.out.println("Valid account number");
        }else{
            System.out.println("Not valid account number");
        }


        
    }
    

    public static void main(String[] args) {

        // task2();
        // task3();
        // task4();
        // task5();
        task6();
        
    }
    
    
}
