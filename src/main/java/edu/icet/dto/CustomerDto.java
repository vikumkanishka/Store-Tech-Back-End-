package edu.icet.dto;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CustomerDto {

    private String id;

    private String name;

    private String email;

    private Integer phone;
}
