package com.autoinstall;

import java.util.Arrays;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Alert;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.PasswordField;
import javafx.scene.layout.VBox;

public class LayoutController {
    final ObservableList<String> presetList = FXCollections.observableArrayList("Windows 7", "Windows 10");
    final String[] win7AppList = {
            "Office 2007",
            "Winrar",
            "TightVNC",
            "Chrome",
            "Firefox",
            "Anydesk",
            "Teamviewer",
            "CutePDF",
            "LibreOffice",
            "Adobe Reader",
            "Easy Inventory"
    };

    final String[] win10AppList = {
            "Office 2016",
            "Winrar",
            "TightVNC",
            "Chrome",
            "Firefox",
            "Anydesk",
            "Teamviewer",
            "CutePDF",
            "LibreOffice",
            "Adobe Reader",
            "Easy Inventory"
    };

    @FXML
    private ChoiceBox<String> presetChoiceBox;

    @FXML
    private VBox appList;

    @FXML
    PasswordField eiPassword;

    @FXML
    PasswordField tvPassword;

    @FXML
    private void initialize() {
        presetChoiceBox.setItems(presetList);
    }

    @FXML
    private void handlePreset() {
        if (presetChoiceBox.getValue().equals("Windows 7")) {
            setAppPreset(win7AppList);
        } else {
            setAppPreset(win10AppList);
        }
    }

    @FXML
    private void onInstallPress() {
        if (eiPassword.getText().isEmpty() || tvPassword.getText().isEmpty()) {
            Alert alert = new Alert(Alert.AlertType.WARNING);
            alert.setTitle("Senhas vazias");
            alert.setHeaderText("Campo de senhas vazias, por favor informe todas as senhas.");
            alert.showAndWait();
        }
    }

    private void setAppPreset(String[] presetList) {
        for (Node node : appList.getChildren()) {
            CheckBox cb = (CheckBox) node;
            if (Arrays.asList(presetList).contains(cb.getText())) {
                cb.selectedProperty().setValue(true);
            } else {
                cb.selectedProperty().setValue(false);
            }
        }
    }
}
