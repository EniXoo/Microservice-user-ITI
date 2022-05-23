package com.example.ensicaenlibrary.repository;

import com.example.ensicaenlibrary.domain.Users;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Component;

@Component
public interface UsersRepository extends CrudRepository<Users, Long> {
    Users findByUserId(Integer userId);

    void deleteByUserId(Integer id);
}
