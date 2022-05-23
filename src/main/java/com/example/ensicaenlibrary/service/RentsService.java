package com.example.ensicaenlibrary.service;

import com.example.ensicaenlibrary.domain.Rents;
import com.example.ensicaenlibrary.repository.RentsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class RentsService {

    @Autowired
    private RentsRepository rentsRepository;

    public HttpStatus postRent(Rents rent) {
        try {
            this.rentsRepository.save(rent);
            return HttpStatus.OK;
        } catch (IllegalArgumentException exception) {
            return HttpStatus.BAD_REQUEST;
        }
    }

    public Rents getRent(Integer rentId) {
        return this.rentsRepository.findByRentId(rentId);
    }

    public Iterable<Rents> getRents() {
        return this.rentsRepository.findAll();
    }
}
