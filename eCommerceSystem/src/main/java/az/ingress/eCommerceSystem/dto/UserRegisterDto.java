package az.ingress.eCommerceSystem.dto;

import lombok.Data;

@Data
public class UserRegisterDto extends UserDto {

    String repeatPassword;

}
