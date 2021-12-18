package com.directi.training.dip.exercise_refactored;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class MyFileWriter implements IWriter {
    
    private String fileName;

    public MyFileWriter(String fileName){
        this.fileName=fileName;
    }

    public void write(String encodedLine) throws IOException{
        
        BufferedWriter writer = new BufferedWriter(new FileWriter(fileName));
        writer.append(encodedLine);
        writer.close();
    }

}
