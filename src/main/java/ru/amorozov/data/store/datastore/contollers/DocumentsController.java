package ru.amorozov.data.store.datastore.contollers;


import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.*;
import ru.amorozov.data.store.datastore.dto.CreateDocumentDTO;
import ru.amorozov.data.store.datastore.error_handling.InvalidDataException;
import ru.amorozov.data.store.datastore.services.DocumentsService;

import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/v1/users/documents")
@AllArgsConstructor
public class DocumentsController {
    private final DocumentsService documentsService;

    /*
    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void createDocument(@RequestBody CreateDocumentDTO createDocumentDTO, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            throw new InvalidDataException(bindingResult.getAllErrors().stream().map(ObjectError::getDefaultMessage).collect(Collectors.toList()));
        }
        if (createDocumentDTO == null){
            throw new NullPointerException("CreateDocumentDTO is null");
        }
        documentsService.createDocument(createDocumentDTO);
    }
    */
}
