package ru.amorozov.data.store.datastore.contollers;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import ru.amorozov.data.store.datastore.dto.DocumentsDto;
import ru.amorozov.data.store.datastore.services.DocumentsService;

@RestController
@RequestMapping("/api/v1/documents")
public class DocumentsController {
    private final DocumentsService documentsService;

    public DocumentsController(DocumentsService documentsService) {
        this.documentsService = documentsService;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void addDocument(@RequestBody DocumentsDto documentsDto) {
        documentsService.addDocument(documentsDto);
    }
}
