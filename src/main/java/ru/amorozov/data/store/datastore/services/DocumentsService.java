package ru.amorozov.data.store.datastore.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.amorozov.data.store.datastore.dto.DocumentsDto;
import ru.amorozov.data.store.datastore.entities.Documents;
import ru.amorozov.data.store.datastore.repositories.DocumentsRepository;

@Service
@AllArgsConstructor
public class DocumentsService {
    private final DocumentsRepository documentsRepository;
    private final TypeOfDocumentService typeOfDocumentService;

    public void addDocument(DocumentsDto documentsDto) {
        Documents document = new Documents();

        typeOfDocumentService.findByDocumentName()
        document.setTypeOfDocuments(typeOfDocumentService.findByDocumentName(documentsDto.getTypeOfDocumentTitle()));
    }
}
