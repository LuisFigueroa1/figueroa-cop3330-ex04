package org.example;

/*
 *  UCF COP3330 Fall 2021 exercise 01 Solution
 *  Copyright 2021 Luis Figueroa
 */
import java.util.Scanner; //the scanner utility

public class App
{
    public static void main( String[] args ) //main function
    {
        Scanner userInput = new Scanner(System.in);

        //declare the variables that will be used in the madlibs
        String noun1; //noun
        String verb1; //verb
        String adj1; //adjective
        String adv1; //adverb

        System.out.println( "Enter a noun: " ); //prompt noun input
        noun1 = userInput.nextLine(); //scan the input
        System.out.println( "Enter a verb: " ); //prompt verb input
        verb1 = userInput.nextLine();
        System.out.println( "Enter an adjective: " ); //prompt adjective input
        adj1 = userInput.nextLine();
        System.out.println( "Enter an adverb: " ); //prompt adverb input
        adv1 = userInput.nextLine();

        //print output
        System.out.println( "Do you " + verb1 + " your " + adj1 + " " + noun1 + " " + adv1 + "? That's hilarious!" );
    }
}