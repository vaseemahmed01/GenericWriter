package com.io.factory;

import com.io.utility.WriterConstant;
import com.io.imp.FilesWriter;
import com.io.imp.StringWriter;
import com.io.writer.Writer;

public class GetWriterFactory {

    public Writer getWriterType(int writerType) {

        if (WriterConstant.FILE_WRITER == writerType) {
            return new FilesWriter();
        } else if (WriterConstant.STRING_WRITER == writerType) {
            return new StringWriter();
        }
        return null;
    }
}
