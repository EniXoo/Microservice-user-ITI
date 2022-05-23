package com.example.ensicaenlibrary.service;

import com.example.ensicaenlibrary.domain.Users;
import com.example.ensicaenlibrary.repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class UsersService {

    @Autowired
    private UsersRepository usersRepository;

    public HttpStatus postUser(Users user) {
        try {
            this.usersRepository.save(user);
            return HttpStatus.OK;
        } catch (IllegalArgumentException exception) {
            return HttpStatus.BAD_REQUEST;
        }
    }

    public HttpStatus deleteUserById(Integer id) {
        try {
            this.usersRepository.deleteByUserId(id);
            return HttpStatus.OK;
        } catch (IllegalArgumentException exception) {
            return HttpStatus.BAD_REQUEST;
        }
    }

    public Users getUserById(Integer id) {
        return this.usersRepository.findByUserId(id);
    }

    public Iterable<Users> getUsers() {
        return this.usersRepository.findAll();
    }
}
