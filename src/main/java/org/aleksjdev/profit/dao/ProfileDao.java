package org.aleksjdev.profit.dao;

import org.aleksjdev.profit.model.Profile;

public interface ProfileDao {

    Profile findProfileById(Long id);
}
