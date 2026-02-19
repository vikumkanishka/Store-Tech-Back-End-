package edu.icet.dto;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CustomerDto {

    private String id;

    private String title;

    private String name;

    private Date dob;

    private Double salary;

    private String address;

    private String city;

    private String province;

    private String postalcode;
}
