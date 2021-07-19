package ru.amorozov.data.store.datastore.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.amorozov.data.store.datastore.entities.Documents;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DocumentsDto {
    private String typeOfDocumentTitle;
    private Long series;
    private Long number;
    private Date dateOfDocument;

    public DocumentsDto(Documents documents){
        this.typeOfDocumentTitle = documents.getTypeOfDocuments().;
        this.series = documents.getSeries();
        this.number = documents.getNumber();
        this.dateOfDocument = documents.getDateOfDocument();
    }
}
