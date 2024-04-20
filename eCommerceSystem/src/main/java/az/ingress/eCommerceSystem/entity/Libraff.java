package az.ingress.eCommerceSystem.entity;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Builder
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "libraff")
public class Libraff {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    Long id;

    String libraff;

    @Enumerated(EnumType.STRING)
    BookType bookType;

    @Enumerated(EnumType.STRING)
    ToyType toyType;
    Double price;
}
