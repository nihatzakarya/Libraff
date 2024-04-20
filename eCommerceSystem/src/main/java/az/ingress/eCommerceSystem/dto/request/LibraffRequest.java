package az.ingress.eCommerceSystem.dto.request;

import az.ingress.eCommerceSystem.entity.BookType;
import az.ingress.eCommerceSystem.entity.ToyType;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;


@Builder
@Data
@AllArgsConstructor
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class LibraffRequest {
    String libraff;

    @Enumerated(EnumType.STRING)
    BookType bookType;

    @Enumerated(EnumType.STRING)
    ToyType toyType;
    Double price;
}
