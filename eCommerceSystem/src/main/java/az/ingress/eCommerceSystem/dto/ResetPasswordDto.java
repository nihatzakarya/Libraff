package az.ingress.eCommerceSystem.dto;

import lombok.Data;

@Data
public class ResetPasswordDto {

    String email;

    String oldPassword;

    String newPassword;
}
