package com.io.test;


import com.io.imp.StringWriter;
import com.io.utility.WriterConstant;
import org.junit.Assert;
import org.junit.Test;
import org.omg.CORBA.PUBLIC_MEMBER;

public class StringWriterTest {

    StringWriter writer = new StringWriter();
    String inputString = "This is really really stupid!!!";

    @Test
    public void convertLowerCase() {
        Assert.assertEquals("String : Conver to lower case",
                "this is really really stupid!!!", writer.convertLowerCase(inputString));

    }

    //Convert to Upper case
    @Test
    public void convertUpperCase() {
        Assert.assertEquals("String : Conver to Upper case",
                "THIS IS REALLY REALLY STUPID!!!",  writer.ConvertUpperCase(inputString));

    }

    @Test
    public void stupidRemover() {
        Assert.assertEquals("String : Stupid word removal ::",
                "This is really really s*****!!!",writer.wordRemover(inputString, WriterConstant.STUPID));
    }

    @Test
    public void duplicateRemover() {
        Assert.assertEquals("String : Duplicate removal ::",
                "This is really stupid!!!",writer.duplicateRemover(inputString));
    }


}