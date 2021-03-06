package com.bootcamp.store.controller.response;

import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class UserResponse {
    private Long id;
    private String userName;
    private int age;
    private String password;
    private boolean active;
    private String roles;
    private List<InvoiceResponse> invoiceResponseList;
}
