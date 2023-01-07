package com.example.demo;

import javafx.fxml.FXMLLoader;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;

public class DictionaryPage
{
    AnchorPane root;
    DictionaryPage() throws IOException {
        root= FXMLLoader.load(getClass().getResource("diction.fxml"));
    }
}
