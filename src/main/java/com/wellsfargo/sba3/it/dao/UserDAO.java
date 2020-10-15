package com.wellsfargo.sba3.it.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wellsfargo.sba3.it.entity.UserEntity;

@Repository
public interface UserDAO extends JpaRepository<UserEntity, Integer>{

}
