package org.aleksjdev.profit.controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import org.aleksjdev.profit.dto.ProfileView;
import org.aleksjdev.profit.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.LinkedList;
import java.util.List;
import java.util.ResourceBundle;

/**
 * Контроллер для работы с профилями в приложении
 *
 * @author Aleksey Gorbachev
 */
@Component
public class ProfileController extends AbstractController implements Initializable {

    /**
     * Таблица профилей
     */
    @FXML
    private TableView<ProfileView> profileTable;

    /**
     * Столбец идентификатора профиля
     */
    @FXML
    private TableColumn<ProfileView, Long> profileIdColumn;

    /**
     * Столбец названия профиля
     */
    @FXML
    private TableColumn<ProfileView, Long> profileNameColumn;

    /**
     * Репозиторий профилей
     */
    @Autowired
    private ProfileService profileService;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        profileTable.setItems(getData());
        profileIdColumn.setCellValueFactory(new PropertyValueFactory<>("profileId"));
        profileNameColumn.setCellValueFactory(new PropertyValueFactory<>("profileName"));
    }

    private ObservableList<ProfileView> getData() {
        List<ProfileView> list = new LinkedList<>();
        list.add(new ProfileView(1, "Profile 1"));
        list.add(new ProfileView(2, "Profile 2"));
        list.add(new ProfileView(3, "Profile 3"));
        ObservableList data = FXCollections.observableList(list);
        return data;
    }
}
