package ru.amorozov.data.store.datastore.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ru.amorozov.data.store.datastore.dto.DocumentsDto;
import ru.amorozov.data.store.datastore.entities.Document;
import ru.amorozov.data.store.datastore.repositories.DocumentsRepository;

@Service
@AllArgsConstructor
public class DocumentsService {
    private final DocumentsRepository documentsRepository;
    private final TypeOfDocumentService typeOfDocumentService;

    public void addDocument(DocumentsDto documentsDto) {
        Document document = new Document();
        document.setTypeOfDocuments(typeOfDocumentService.findIdByDocumentName(documentsDto.getTypeOfDocumentTitle()));
        document.setSeries(document.getSeries());
        document.setNumber(documentsDto.getNumber());
        document.setDateOfDocument(documentsDto.getDateOfDocument());
    }
}
