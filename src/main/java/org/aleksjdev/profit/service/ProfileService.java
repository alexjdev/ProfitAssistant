package org.aleksjdev.profit.service;

/**
 * Сервис для работы с профилями
 *
 * @author Aleksey Gorbachev
 */
public interface ProfileService {

    /**
     * Сохранение нового профиля
     *
     * @param profileName  название профиля
     */
    void addProfile(String profileName);
}
