package com.io.main;

import com.io.exception.WriterException;
import com.io.factory.GetWriterFactory;
import com.io.utility.WriterConstant;
import com.io.writer.Writer;
import java.util.Scanner;

public class GenericWriter {

    public static void main(String[] args) {

        GetWriterFactory writerFactory = new GetWriterFactory();
        String finalString;
        Writer writer = null;
        int writerType; //default String
        String text;
        System.out.println("**********START********************");
        System.out.println(" 1 - String Writer");
        System.out.println(" 2 - File Writer");
        System.out.print("Please enter the writer number as above (1 or 2) :");

        try {

            Scanner in = new Scanner(System.in);
            writerType = Integer.parseInt(in.nextLine());
            System.out.println("You have entered type : " + writerType);
            System.out.println("Please enter text to write : ");
            text = in.nextLine();
            System.out.println("You have entered text : " + text);

            switch (writerType) {
                case 1: //String Writer
                    System.out.println("*****String Writer Started**** ");

                    //Get StringWriter object
                    writer = writerFactory.getWriterType(writerType);
                    finalString = text;

                    System.out.println("String writing completed :: " + finalString);

                    System.out.println("*****String Writer Operation is starting****");
                    // Operation - Apply toUpperCase
                    finalString = writer.ConvertUpperCase(finalString);
                    System.out.println("Operation - Upper Case :: " + finalString);

                    // Operation - Apply toLoweCase
                    finalString = writer.convertLowerCase(finalString);
                    System.out.println("Operation - Lower Case :: " + finalString);

                    //Operation - Stupid Removal
                    finalString = writer.wordRemover(finalString , WriterConstant.STUPID);
                    System.out.println("Operation - Stupid Remover :: " + finalString);

                    //Operation - Duplicate Removal
                    finalString = writer.duplicateRemover(finalString);
                    System.out.println("Operation - Duplicate Remover :: " + finalString);

                    //Writing text to string
                    writer.write(finalString);
                    System.out.println("Final String : " + finalString);

                    System.out.println("*****String Writer Operation END****");

                    return;
                case 2: //File Writer
                    System.out.println("File Writer selected");
                    writer = writerFactory.getWriterType(writerType);
                    finalString = text;
                    //finalString = writer.writerString;

                    System.out.println("*****File Writer Operation is starting****");

                    // Operation - Apply toUpperCase
                    finalString = writer.ConvertUpperCase(finalString);
                    System.out.println("Operation - Upper Case :: " + finalString);

                    // Operation - Apply toLoweCase
                    finalString = writer.convertLowerCase(finalString);
                    System.out.println("Operation - Lower Case :: " + finalString);

                    //Operation - Stupid Removal
                    finalString = writer.wordRemover(finalString, WriterConstant.STUPID);
                    System.out.println("Operation - Stupid Remover :: " + finalString);

                    //Operation - Duplicate Removal
                    finalString = writer.duplicateRemover(finalString);
                    System.out.println("Operation - Duplicate Remover :: " + finalString);

                    System.out.println("*****File Writer Starting**** ");
                    //Writing text to string
                    writer.write(finalString);

                    System.out.println("Final String : " + finalString);
                    System.out.println("******File writing completed****");

                    System.out.println("******File Reading starting****");
                    String findResult = writer.read("really");

                    return;
                default:
                    System.out.println("No Writer available for this type : " + writer);
                    System.out.println("Please enter 1- Sring Writer and 2- File Writer");
            }

            System.out.println("**********END********************");

        } catch (WriterException wrexp) {
            wrexp.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
