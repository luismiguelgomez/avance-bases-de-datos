package com.tienda.online.tiendaOnline.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "orden")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@JsonIgnoreProperties(value={"hibernateLazyInitializer","handler","fieldHandler"})
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id", nullable = false)
    private Long orderId;

    @Column(name = "name_producto", nullable = false, length = 100)
    private String nameProduct;

    @Column(name = "price_producto", nullable = false, length = 100)
    private String priceProduct;

    @Column(name = "creation_date", nullable = false, length = 100)
    private String dateOrder;

    @Column(name = "order_state", nullable = false, length = 100)
    private String stateOrder;

    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customer customer;
}
