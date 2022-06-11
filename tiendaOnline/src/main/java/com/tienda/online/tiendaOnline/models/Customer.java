package com.tienda.online.tiendaOnline.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "customer")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(value={"hibernateLazyInitializer","handler","fieldHandler"})
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id", nullable = false, updatable = false)
    private Long customerId;

    @Column(name = "id_type", unique=false,nullable = false)
    private Long idTypeUser;

    @Column(name = "email", unique=true, length=100, nullable = false)
    private String email;

    @Column(name = "name", length=100, nullable = false)
    private String name;

    @Column(name = "customer_pw", length=20, nullable = false)
    private String customerPw;

    @Column(name = "created_date", unique=true, length=10, nullable = false)
    private String createdDate;

    @Column(name = "updated_date", unique=true, length=10, nullable = false)
    private String updatedDate;
}
