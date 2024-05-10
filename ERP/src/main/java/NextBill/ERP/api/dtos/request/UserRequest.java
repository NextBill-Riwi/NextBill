package NextBill.ERP.api.dtos.request;

import java.util.UUID;

import NextBill.ERP.util.enums.StudentStatus;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserRequest {

    private UUID id;

    @Size(min = 0, max = 100)
    @Email(message = "El correo debe ser una direccion de correo valida")
    @NotBlank(message = "El correo del usuario a crear es requerido")
    private String email;

    @Size(min = 8, max = 32)
    @NotBlank(message = "La contraseña del usuario a crear es requerida")
    private String password;

    @NotBlank(message = "El nombre del usuario a crear es requerido")
    private String name;

    @NotBlank(message = "El telefono del usuario a crear es requerido")
    private String phoneNumber;
    
    @NotBlank(message = "La URL del avatar del usuario a crear es requerida")
    private String urlImage;
    
    @Size(min = 0, max = 32)
    @NotBlank(message = "El total de puntos del usuario a crear es requerido")
    private int totalCoins;
    
    @Size(min = 0, max = 32)
    @NotBlank(message = "El id del rol para el usuario a crear es requerido")
    private int roleId;
    
    private StudentStatus status;
}