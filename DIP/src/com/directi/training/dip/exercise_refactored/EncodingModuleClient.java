package com.directi.training.dip.exercise_refactored;

import java.io.IOException;

public class EncodingModuleClient
{
    public static void main(String[] args) throws IOException
    {
        EncodingModule encodingModule = new EncodingModule();

        IReader reader = new MyFileReader(
            "DIP/src/com/directi/training/dip/exercise/beforeEncryption.txt");
        IWriter writer = new MyFileWriter(
            "DIP/src/com/directi/training/dip/exercise/afterEncryption.txt");
        encodingModule.encode(reader,writer);

        reader = new MyDatabaseReader("http", "firstappwith.appspot.com", "/index.html");
        writer = new MyDatabaseWriter();
        encodingModule.encode(reader, writer);

    }
}
