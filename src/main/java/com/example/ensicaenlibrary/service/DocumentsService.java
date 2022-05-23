package com.example.ensicaenlibrary.service;

import com.example.ensicaenlibrary.domain.Documents;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

@Service
public class DocumentsService {

    @Autowired
    private DocumentsRepository documentsRepository;

    public HttpStatus postDocument(Documents document) {
        try {
            this.documentsRepository.save(document);
            return HttpStatus.OK;
        } catch (IllegalArgumentException exception) {
            return HttpStatus.BAD_REQUEST;
        }

    }

    public Documents getDocument(Integer documentid) {
        return this.documentsRepository.findByDocumentId(documentid);
    }

    public Iterable<Documents> getDocuments() {
        return this.documentsRepository.findAll();
    }
}
