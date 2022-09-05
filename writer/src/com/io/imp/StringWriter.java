package com.io.imp;

import com.io.utility.WriterUtility;
import com.io.writer.Writer;

public class StringWriter extends Writer {


    @Override
    public void write(String strText) {
        writerString = strText;
    }

    @Override
    public String read(String strText) {
        return strText;
    }
}
