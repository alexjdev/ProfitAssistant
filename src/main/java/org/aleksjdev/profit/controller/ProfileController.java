package org.aleksjdev.profit.controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.ResourceBundle;

@Component
public class ProfileController extends AbstractController implements Initializable {

    @FXML
    private TableView profileTable;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
