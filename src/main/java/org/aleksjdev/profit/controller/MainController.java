package org.aleksjdev.profit.controller;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.aleksjdev.profit.SpringFXMLLoader;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Главный контроллер приложения
 *
 * @author Aleksey Gorbachev
 */
@Component
public class MainController extends AbstractController implements Initializable {

    private static final String PROFILE_TITLE = "Профили";
    private static final String PROFILE_FORM = "/fxml/profile/profileForm.fxml";

    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

    public void profileForm(ActionEvent actionEvent) {
        Stage stage = new Stage();
        ProfileController controller = (ProfileController) SpringFXMLLoader.load(PROFILE_FORM);
        Scene scene = new Scene((Parent) controller.getView());
        stage.setTitle(PROFILE_TITLE);
        stage.setScene(scene);
        stage.show();
    }

    public void exit(ActionEvent actionEvent) {
        Platform.exit();
    }

}
