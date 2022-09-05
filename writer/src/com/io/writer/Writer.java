package com.io.writer;

import com.io.exception.WriterException;
import com.io.utility.WriterUtility;

public abstract class Writer {

    public static String writerString;
    abstract public String read(String strText) throws Exception;

    abstract public void write(String strText) throws Exception;

    //Covert given string to lower case
    public String convertLowerCase(String strText) {
        return WriterUtility.toLowerCase(strText);
    }

    //Convert string to uppercase
    public String ConvertUpperCase(String strText) {
        return WriterUtility.toUpperCase(strText);
    }

    //Stupid masking
    public String wordRemover(String strLine, String word) {
        return WriterUtility.maskStupid(strLine,word);
    }

    //Remove duplicate work from string line
    public String duplicateRemover(String strText) {
        return WriterUtility.removeDuplicateWord(strText);
    }
}
