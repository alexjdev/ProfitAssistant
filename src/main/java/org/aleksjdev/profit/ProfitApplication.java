package org.aleksjdev.profit;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import org.aleksjdev.profit.controller.MainController;

/**
 * Главный класс приложения
 */
public class ProfitApplication extends Application {

    private static final String APPLICATION_TITLE = "Расчет стоимости оконных изделий";
    private static final String MAIN_FORM = "/fxml/main.fxml";

    public static void main(String[] args) throws Exception {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        MainController controller = (MainController) SpringFXMLLoader.load(MAIN_FORM);
        Scene scene = new Scene((Parent) controller.getView());
        stage.setTitle(APPLICATION_TITLE);
        stage.setScene(scene);
        stage.show();
    }
}
