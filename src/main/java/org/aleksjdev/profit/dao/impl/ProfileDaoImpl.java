package org.aleksjdev.profit.dao.impl;

import org.aleksjdev.profit.dao.ProfileDao;
import org.aleksjdev.profit.model.Profile;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class ProfileDaoImpl implements ProfileDao {

    @PersistenceContext
    private EntityManager em;

    @Override
    public Profile findProfileById(Long id) {
        return em.find(Profile.class, id);
    }

    @Override
    public void addProfile(String profileName) {
        Profile profile = new Profile(profileName);
        em.persist(profile);
    }
}
