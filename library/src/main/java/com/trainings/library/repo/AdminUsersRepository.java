package com.trainings.library.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.trainings.library.repo.entity.AdminUser;
import org.springframework.stereotype.Repository;

@Repository
public interface AdminUsersRepository extends JpaRepository<AdminUser,Integer>{

	AdminUser findByUserNameAndPassword(String userName, String pwd);
	AdminUser findByUserName(String userName);

	

}
