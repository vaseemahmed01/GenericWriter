package com.io.imp;

import com.io.exception.WriterException;
import com.io.utility.WriterUtility;
import com.io.writer.Writer;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FilesWriter extends Writer {

    @Override
    public void write(String str) throws Exception {

        FileWriter fw=new FileWriter("file/output.txt");
        // read character wise from string and write
        for (int i = 0; i < str.length(); i++)
            fw.write(str.charAt(i));
        //close the file
        fw.close();
    }

    //Read the text from file
    @Override
    public String read(String strText) throws Exception {
        // variable declaration
        int ch;

        // check if File exists or not
        FileReader fr=null;
        try
        {
            fr = new FileReader("file/output.txt");
        }
        catch (FileNotFoundException fe)
        {
            System.out.println("File not found");
        }

        // read from FileReader till the end of file
        while ((ch=fr.read())!=-1)
            System.out.print((char)ch);

        // close the file
        fr.close();

        return  "";

    }
}
