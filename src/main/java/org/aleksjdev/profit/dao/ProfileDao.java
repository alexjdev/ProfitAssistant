package org.aleksjdev.profit.dao;

import org.aleksjdev.profit.model.Profile;

/**
 * DAO для работы с профилями
 *
 * @author Aleksey Gorbachev
 */
public interface ProfileDao {

    /**
     * Получить профиль по идентификатору
     *
     * @param id идентификатор профиля
     * @return профиль
     */
    Profile findProfileById(Long id);

    /**
     * Добавить новый профиль
     *
     * @param profileName название профиля
     */
    void addProfile(String profileName);
}
