package com.example.ensicaenlibrary.controller;

import com.example.ensicaenlibrary.domain.Users;
import com.example.ensicaenlibrary.service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class UsersController {

    @Autowired
    private UsersService usersService;

    public UsersController() {
        this.usersService = new UsersService();
    }

    @PostMapping("/user")
    public HttpStatus postUser(@RequestBody Users user) {
        return this.usersService.postUser(user);
    }

    @DeleteMapping("/user/id")
    public HttpStatus deleteUserById(@RequestParam Integer userid) {
        return this.usersService.deleteUserById(userid);
    }

    @PutMapping("/user/")
    public HttpStatus updateUser(@RequestBody Users user) {
        return this.usersService.updateUser(user);
    }

    @GetMapping("/user/id")
    public ResponseEntity<Users> getUserById(@RequestParam Integer userid) {
        Users user = this.usersService.getUserById(userid);
        return new ResponseEntity<>(user, user == null ? HttpStatus.NOT_FOUND : HttpStatus.FOUND);
    }

    @GetMapping("/users")
    public ResponseEntity<Iterable<Users>> getUsers() {
        Iterable<Users> user = this.usersService.getUsers();
        return new ResponseEntity<>(user, user == null ? HttpStatus.NOT_FOUND : HttpStatus.FOUND);
    }
}
