/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.registration1;

// improting java classes
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


/**
 *
 * @author Akani Mbambo
 */
public class Registration1 {
    private String storedUsername;
    private String storedPassword;
    private String storedPhoneNumber;


     public static void main(String[] args) {
         
        // Create an instance of the Login class
        Login objLogin = new Login();

        // Importing scanner class
        Scanner input = new Scanner(System.in);

        // Variables to store registration details
        String storedUsername = null;
        String storedPassword = null;
        
        //asking user to enter name
        System.out.println(" Please input your name: ");
        String name = input.nextLine();
        
        //asking user to enter thier surname
        System.out.println(" Please input your surname: ");
        String surname= input.nextLine();

        // Instructing user
        System.out.print(" Please create a username. Username must consist of an underscore (_) and must be 5 characters long. ");
        String username = input.nextLine();

        // Validate username
        if (username.contains("_") && username.length() <= 5) {
            System.out.println(" User successfully registered ");
            //Store the username
            storedUsername = username;
        } else {
            System.out.println(" Username incorrectly inputted: ");
          
           
        }

        // Asking user to create a password
        System.out.println(" Please create a password that contains at least 8 characters, 1 uppercase letter, 1 lowercase letter, and 1 number: ");
        String password = input.nextLine();

        // Validate password
        if (password.length() >= 8 && password.matches(".*[A-Z].*") && password.matches(".*[a-z].*") && password.matches(".*[0-9].*")) {
            System.out.println(" Password successfully created ");
           //Store the password
            storedPassword = password; 
        } else {
            System.out.println(" Password incorrectly inputted: ");
       
        }

        // Asking user to create a phone number
        System.out.println(" Please enter your phone number. The phone number must begin with +27 and must be 12 characters long: ");
        String phoneNumber = input.nextLine();

        // Validate phone number using regex
        String phonePattern = "^\\+27\\d{9}$"; // Regex for +27 followed by 9 digits
        if (phoneNumber.matches(phonePattern)) {
            System.out.println(" Phone number successfully created ");
        } else {
            System.out.println(" Phone number incorrectly inputted. Please ensure it starts with +27 and contains 9 digits after that. ");
           
        }
        
        // Registration complete
        System.out.println(" Registration successfull ");

        System.out.print("Login");
        // Login functionality  
        System.out.println("Please log in:");
        boolean isUsernameValid = objLogin.checkUsername(storedUsername);
        boolean isPasswordValid = objLogin.checkPassword(storedPassword);

        if (isUsernameValid && isPasswordValid) {
            System.out.println("Login successful. Welcome " + name + " " + surname + " It's great to see you");
        } else {
            System.out.println("Login failed. Please try again.");
        }

        input.close();
        
    }
}

     