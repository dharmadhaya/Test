package com.trainings.library.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.trainings.library.repo.AdminUsersRepository;
import com.trainings.library.repo.entity.AdminUser;
import com.trainings.library.web.model.User;
import com.trainings.library.web.model.UserAccount;

@Service
public class UserService {

    @Autowired
    AdminUsersRepository adminUserRepository;

    public boolean validate(User user) {

        AdminUser adminUserTable = adminUserRepository.findByUserNameAndPassword(user.getUserName(), user.getPassword());

        if (adminUserTable == null) {
            return false;
        } else {
            return true;
        }
    }

	public void addUserAccountDetails(UserAccount userAccount) {
		// TODO Auto-generated method stub
		AdminUser adminUser = new AdminUser();
		adminUser.setFullName(userAccount.getUseFullName());
		adminUser.setUserName(userAccount.getUseName());
		adminUser.setPassword(userAccount.getUsePassword());
		adminUserRepository.save(adminUser);
		
	}
}
