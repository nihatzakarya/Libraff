package az.ingress.eCommerceSystem.dto.response;

import az.ingress.eCommerceSystem.entity.BookType;
import az.ingress.eCommerceSystem.entity.ToyType;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import lombok.*;
import lombok.experimental.FieldDefaults;


@Builder
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class LibraffResponse {

    Long id;

    String libraff;

    @Enumerated(EnumType.STRING)
    BookType bookType;

    @Enumerated(EnumType.STRING)
    ToyType toyType;
    Double price;
}
