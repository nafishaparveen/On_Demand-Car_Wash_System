package com.javabrains.Packageservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Document("WashPackage")
public class WashPackage {
    @Id
    private String id;
    private String name;
    private String type;
    private BigDecimal price;
    private String service;


}
