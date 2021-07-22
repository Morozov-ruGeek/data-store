package ru.amorozov.data.store.datastore.entities;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Table(name = "document")
@NoArgsConstructor
@Data
public class Document {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @OneToOne
    @JoinColumn (name = "id")
    private TypeOfDocument typeOfDocument;

    @ManyToOne
    @JoinColumn (name = "user_id")
    private User user;

    @Column(name = "series")
    private Long series;

    @Column(name = "number")
    private Long number;

    @Column(name = "document_date")
    private Date dateOfDocument;

    @CreationTimestamp
    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @UpdateTimestamp
    @Column(name = "updated_at")
    private LocalDateTime updatedAt;
}
