package com.directi.training.dip.exercise_refactored;

import java.io.IOException;
import java.util.Base64;

public class EncodingModule{

    public void encode(IReader reader, IWriter writer) throws IOException{
        

        String inputString = reader.read();
        String encodedString = Base64.getEncoder().encodeToString(inputString.getBytes());
        writer.write(encodedString);
    }
}

