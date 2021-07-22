package ru.amorozov.data.store.datastore.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.amorozov.data.store.datastore.entities.TypeOfDocument;
import ru.amorozov.data.store.datastore.error_handling.ResourceNotFoundException;
import ru.amorozov.data.store.datastore.repositories.TypeOfDocumentRepository;

import java.util.Optional;

@Service
public class TypeOfDocumentService {
    private final TypeOfDocumentRepository typeOfDocumentRepository;

    @Autowired
    public TypeOfDocumentService(TypeOfDocumentRepository typeOfDocumentRepository) {
        this.typeOfDocumentRepository = typeOfDocumentRepository;
    }

    public TypeOfDocument findById(Long id) {
        return typeOfDocumentRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Type of document id: " + id + "not found"));
    }
}
