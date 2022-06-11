package com.tienda.online.tiendaOnline.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "product")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(value={"hibernateLazyInitializer","handler","fieldHandler"})

public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id", nullable = false, updatable = false)
    private Long id;

    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Column(name = "description", nullable = false, length = 100)
    private String description;

    @Column(name = "price", nullable = false, length = 100)
    private String price;

    @Column(name = "stock", nullable = false, length = 100)
    private String stock;

    @Column(name = "url_image_product", nullable = false, length = 100)
    private String urlImagenProducto;

    @ManyToOne
    @JoinColumn(name = "provider_id", nullable = false)
    private Provider provider;

}
