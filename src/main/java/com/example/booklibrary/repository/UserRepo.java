package com.example.booklibrary.repository;

import com.example.booklibrary.model.CustomUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface UserRepo extends JpaRepository<CustomUser , Integer> {

}
