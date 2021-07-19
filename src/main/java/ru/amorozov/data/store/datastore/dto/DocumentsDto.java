package ru.amorozov.data.store.datastore.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import ru.amorozov.data.store.datastore.entities.Document;

import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DocumentsDto {
    private int id;
    private String typeOfDocumentTitle;
    private Long series;
    private Long number;
    private Date dateOfDocument;

    public DocumentsDto(Document document){
        this.typeOfDocumentTitle = document.getTypeOfDocuments().get(this.id).getDocumentName();
        this.series = document.getSeries();
        this.number = document.getNumber();
        this.dateOfDocument = document.getDateOfDocument();
    }
}
