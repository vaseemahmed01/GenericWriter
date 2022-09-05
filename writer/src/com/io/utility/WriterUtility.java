package com.io.utility;

public class WriterUtility {

    /*
    * Masking Stupid word using regex
    * I/P - This is really really stupid!!!
    * O - This is really really s*****!!!
    */
    public static String maskStupid(String strLine, String word){

        String[] alsoReplace = {word};

        for (String str : alsoReplace) {
            strLine = strLine.replaceAll("(?i)\\b" + str + "\\b" , WriterConstant.STUPID_MASK);
        }
        strLine = strLine.trim().replaceAll(" +", " "); // remove multiple space into single

        return strLine;
    }

    //Convert String to lowercase
    public static String toLowerCase(String strText) {
        return strText.toLowerCase();
    }

    //Convert String to Upercaes
    public static String toUpperCase(String strText) {
        return strText.toUpperCase();
    }

    //duplicate removal
    public static String removeDuplicateWord(String strLine){
        return strLine.replaceAll(WriterConstant.REMOVE_DUPLICATE_REGEX, "");
    }


}
