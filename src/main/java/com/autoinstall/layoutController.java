package com.autoinstall;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.control.ChoiceBox;

public class layoutController {
    ObservableList<String> presetList = FXCollections.observableArrayList("Windows 7", "Windows 10");

    @FXML
    private ChoiceBox<String> presetChoiceBox;

    @FXML
    private void initialize() {
        presetChoiceBox.setItems(presetList);
    }
}
