package itacademy.book.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "book")
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ToString
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String bookTitle;

    @Column(name = "author")
    private String bookAuthor;

    @Column(name = "price")
    private Integer bookPrice;
}
