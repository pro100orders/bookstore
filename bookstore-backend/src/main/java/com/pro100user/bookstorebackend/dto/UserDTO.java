package com.pro100user.bookstorebackend.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class UserDTO {

    private Long id;

    private String name;

    private String surname;

    private String email;

    private String phone;

    private String address;
}
