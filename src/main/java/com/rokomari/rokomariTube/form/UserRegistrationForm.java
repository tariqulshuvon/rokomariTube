package com.rokomari.rokomariTube.form;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class UserRegistrationForm {
    private Long id;
    private String username;
    private String email;
    private String password;
}
