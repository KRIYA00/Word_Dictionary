package com.example.demo;

import java.io.*;
import java.util.HashMap;

public class DictionarySaver
{
    private HashMap<String,String> Dictionarylist;
    DictionarySaver()
    {
        Dictionarylist=new HashMap<>();
    }
    HashMap<String,String> getDictionarylist()
    {
        return Dictionarylist;
    }
    void serializeHashMap() throws IOException {
        FileOutputStream fos=new FileOutputStream("dicyionaryData");
        ObjectOutputStream oos=new ObjectOutputStream(fos);
        oos.writeObject(Dictionarylist);
        oos.close();
        fos.close();
    }
    void deserializeHashMap() throws IOException, ClassNotFoundException {
        FileInputStream file=new FileInputStream("dicyionaryData");
        ObjectInputStream ois=new ObjectInputStream(file);
        Dictionarylist=(HashMap<String, String>)ois.readObject();


    }
}
