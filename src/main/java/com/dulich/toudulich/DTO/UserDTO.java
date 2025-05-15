package com.dulich.toudulich.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.JoinColumn;
import jakarta.validation.constraints.NotBlank;
import lombok.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class UserDTO {
    @NotBlank(message = "Họ và tên không được bỏ trống")
    private String name ;
    @JsonProperty("password")
    @NotBlank(message = "Mật khẩu không đuược bỏ trống")
    private String password ;

    private String retypePassword ;

    @NotBlank(message = "Số điện thoại không được bỏ trống")
    private String phone ;

    private String gender ;

    private String email ;

    private String address ;

    @JsonProperty("role_id")
    private Long roleID ;

}
