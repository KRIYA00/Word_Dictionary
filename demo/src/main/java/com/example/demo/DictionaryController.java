package com.example.demo;

import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class DictionaryController
{
private  DictionarySaver db;
@FXML
TextField addword;
@FXML
TextField meaning;
@FXML
TextField findword;
@FXML
    TextField search;
@FXML
    public void Search(MouseEvent e) throws IOException, ClassNotFoundException
{
    db=new DictionarySaver();
  // db.serializeHashMap();
    db.deserializeHashMap();
    Alert alert=new Alert(Alert.AlertType.INFORMATION);
    alert.setHeaderText("WordDictionary");

   // System.out.println("Search Button is clicked");
    if(search.getText().equals(""))
    {
        alert.setContentText("Please insert the word to search");
        alert.showAndWait();
    }
    else if(db.getDictionarylist().containsKey(search.getText().toLowerCase()))
    {
        alert.setContentText("Word is available in the dictionary");
        alert.showAndWait();
    }
    else
    {
        alert.setContentText("Word is not available in the dictionary");
        alert.showAndWait();
    }
}

    @FXML
    public void Add(MouseEvent e) throws IOException, ClassNotFoundException {

      //  System.out.println("Add Button is clicked");
        Alert alert=new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("WordDictionary");
        alert.setContentText("New Word Added to Dictionary");
        alert.showAndWait();
        db=new DictionarySaver();
        db.deserializeHashMap();
        db.getDictionarylist().put(addword.getText().toLowerCase(),meaning.getText());
        db.serializeHashMap();
    }


    @FXML
    public void FindMeaning(MouseEvent e) throws IOException, ClassNotFoundException {
        System.out.println("Find Meaning Button is clicked");
        db=new DictionarySaver();
        db.deserializeHashMap();
        Alert alert=new Alert(Alert.AlertType.INFORMATION);
        alert.setHeaderText("WordDictionary");
        if(findword.getText().equals(""))
        {
            alert.setContentText("Please insert the word to find its meaning");
            alert.showAndWait();
        }
        else if(db.getDictionarylist().containsKey(findword.getText().toLowerCase()))
        {
          //  System.out.println(db.getDictionarylist().get(findword.getText()));
            alert.setContentText(db.getDictionarylist().get(findword.getText()));
            alert.showAndWait();
        }
        else
        {
            System.out.println("not found");
        }
    }


}
