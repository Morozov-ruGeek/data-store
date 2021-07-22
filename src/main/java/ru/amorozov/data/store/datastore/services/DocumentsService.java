package ru.amorozov.data.store.datastore.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.amorozov.data.store.datastore.dto.CreateDocumentDTO;
import ru.amorozov.data.store.datastore.entities.Document;
import ru.amorozov.data.store.datastore.repositories.DocumentsRepository;

@Service
@AllArgsConstructor
public class DocumentsService {
    private final DocumentsRepository documentsRepository;
    private final UserService userService;


    public void createDocument(CreateDocumentDTO createDocumentDTO) {
        Document document = new Document();
        document.setTypeOfDocument(createDocumentDTO.getTypeOfDocument());
        document.setSeries(document.getSeries());
        document.setNumber(createDocumentDTO.getNumber());
        document.setDateOfDocument(createDocumentDTO.getDateOfDocument());
        document.setUser(userService.findById(createDocumentDTO.getUserId()).get());
        document = documentsRepository.save(document);
    }

}
