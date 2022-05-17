package com.example.demo;
//todo Пример строки палиндром - А роза упала на лапу азора
//todo Читается слева направо так же как и справа налево
//todo Написать функцию, которая будет определять является ли строка палиндромом
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Palindrome {
    //Possibility for user to enter something and for program to read something
    static final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {
        System.out.println("Please enter your string:" + "\n" + "Let`s check if this one is Palindrome:"  );
        //Creating and initializing a variable where input will be what is written
        String initialPalindrome = READER.readLine();
        //Creating and initializing a variable where in input will be replaced all spaces with no spaces
        String Palindrome = initialPalindrome.replaceAll(" ", "");
        //Displaying initial input for user convenience
        System.out.println("Your initial input: " + initialPalindrome);

        //Creating and initializing a variable that is reversed to the initial variable for user convenience
        String PalindromeReversedForUser = new StringBuffer(initialPalindrome).reverse().toString();
        //Creating and initializing a variable that is reversed to the initial variable without spaces
        String PalindromeReversed = new StringBuffer(Palindrome).reverse().toString();

        //Check if initial and reversed variables are the same (ignoring case)
        System.out.println("Your reversed initial input: " + PalindromeReversedForUser);
        if (Palindrome.equalsIgnoreCase(PalindromeReversed)) {
            //if the same, then palindrome
            System.out.println("Congratulations! This one is Palindrome");
        } else {
            //if not than not
            System.out.println("This one is not palindrome");
        }
    }
}
