package org.aleksjdev.profit;

import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import org.aleksjdev.profit.config.ApplicationConfig;
import org.aleksjdev.profit.controller.Controller;
import org.apache.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;
import java.io.InputStream;

/**
 * Custom loader for Spring Framework support
 */
public class SpringFXMLLoader {

    private static final Logger LOG = Logger.getLogger(SpringFXMLLoader.class);

    private static final ApplicationContext APPLICATION_CONTEXT = new AnnotationConfigApplicationContext(ApplicationConfig.class);

    public static Controller load(String url) {
        try (InputStream fxmlStream = SpringFXMLLoader.class
                .getResourceAsStream(url)) {
            FXMLLoader loader = new FXMLLoader();
            loader.setControllerFactory(clazz -> APPLICATION_CONTEXT.getBean(clazz));
            Node view = loader.load(fxmlStream);
            Controller controller = loader.getController();
            controller.setView(view);

            return controller;
        } catch (IOException ioException) {
            LOG.error(ioException.getMessage(), ioException);
            throw new RuntimeException(ioException);
        }
    }

}
