package org.aleksjdev.profit.service.impl;

import org.aleksjdev.profit.dao.ProfileDao;
import org.aleksjdev.profit.service.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service("profileService")
public class ProfileServiceImpl implements ProfileService {

    @Autowired
    private ProfileDao profileDao;

    @Transactional
    @Override
    public void addProfile(String profileName) {
        profileDao.addProfile(profileName);
    }
}
