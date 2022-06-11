package com.tienda.online.tiendaOnline.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "provider")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(value={"hibernateLazyInitializer","handler","fieldHandler"})
public class Provider {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "provider_id", nullable = false, updatable = false)
    private Long providerId;

    @Column(name = "email", unique=true, length=100, nullable = false)
    private String email;

    @Column(name = "provider_name", unique=false, length=100, nullable = false)
    private String providerName;

    @Column(name = "provider_address", unique=false, length=100, nullable = false)
    private String providerAddress;

    @Column(name = "provider_pw", unique=false, length=20, nullable = false)
    private String providerPw;

    @Column(name = "created_date", unique=true, length=10, nullable = false)
    private String createdDate;

    @Column(name = "updated_date", unique=true, length=10, nullable = false)
    private String updatedDate;
}
