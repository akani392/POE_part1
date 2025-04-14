/*a
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.registration1;

import java.util.Scanner;

/**
 *
 * @author Akani Mbambo
 */
class Login {
    
   // Method to validate the username
    public boolean checkUsername(String storedUsername) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String inputUsername = scanner.nextLine();

        if (inputUsername.equals(storedUsername)) {
            System.out.println("Username is correct.");
            return true; // Username is valid
        } else {
            System.out.println("Username is incorrect. Please try again.");
            return false; // Username is invalid
        }
    }

    // Method to validate the password
    public boolean checkPassword(String storedPassword) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your password: ");
        String inputPassword = scanner.nextLine();

        if (inputPassword.equals(storedPassword)) {
            System.out.println("Password is correct.");
            return true; // Password is valid
        } else {
            System.out.println("Password is incorrect. Please try again.");
            return false; // Password is invalid
        }
    }
}

        
        
    

    

