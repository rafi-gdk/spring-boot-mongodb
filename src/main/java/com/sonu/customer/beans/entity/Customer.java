package com.sonu.customer.beans.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collation = "Customer")
public class Customer {

    @Id
    private String customerId;
    private String customerName;
    private LocalDate customerDOB;
    private String phoneNumber;
    private String email;
    private String password;
    private List<Address> addresses;
}
