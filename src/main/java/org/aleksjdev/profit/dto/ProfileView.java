package org.aleksjdev.profit.dto;

import javafx.beans.property.SimpleLongProperty;
import javafx.beans.property.SimpleStringProperty;

/**
 * Модель для отображения профилей в таблице на UI
 *
 * @author Aleksey Gorbachev
 */
public class ProfileView {

    /**
     * Идентификатор профиля
     */
    private SimpleLongProperty profileId;

    /**
     * Название профиля
     */
    private SimpleStringProperty profileName;

    public ProfileView() {
    }

    public ProfileView(long profileId, String profileName) {
        this.profileId = new SimpleLongProperty(profileId);
        this.profileName = new SimpleStringProperty(profileName);
    }

    public long getProfileId() {
        return profileId.get();
    }

    public void setProfileId(long profileId) {
        this.profileId.set(profileId);
    }

    public String getProfileName() {
        return profileName.get();
    }

    public void setProfileName(String profileName) {
        this.profileName.set(profileName);
    }
}
