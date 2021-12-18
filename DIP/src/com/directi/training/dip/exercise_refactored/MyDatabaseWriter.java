package com.directi.training.dip.exercise_refactored;

public class MyDatabaseWriter implements IWriter {
    
    @Override
    public void write(String encodedString){
        MyDatabase database = new MyDatabase();
        database.write(encodedString);
    }
}
