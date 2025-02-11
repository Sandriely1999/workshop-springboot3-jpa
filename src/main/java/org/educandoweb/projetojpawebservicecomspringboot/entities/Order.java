package org.educandoweb.projetojpawebservicecomspringboot.entities;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Getter;
import org.educandoweb.projetojpawebservicecomspringboot.enums.OrderStatus;

import javax.persistence.*;
import java.io.Serializable;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

@Getter
@Entity
@Table(name = "tb_order")
public class Order implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss'Z'", timezone = "GMT")
    private Instant moment;

    private Integer orderstatus;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private User client;

    @OneToMany(mappedBy = "id.order")
    private Set<OrderItem> items = new HashSet<>();

    @OneToOne(mappedBy = "order", cascade = CascadeType.ALL)
    private Payment payment;

    public Order() {

    }

    public Order(Long id, Instant moment,OrderStatus orderstatus, User client) {
        this.id = id;
        this.moment = moment;
        setOrderstatus(orderstatus);
        this.client = client;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setMoment(Instant moment) {
        this.moment = moment;
    }

    public OrderStatus getOrderstatus() {
        return OrderStatus.valueOf(orderstatus);
    }

    public void setOrderstatus(OrderStatus orderstatus) {
        if (orderstatus != null) {
            this.orderstatus = orderstatus.getCode();
        }
    }

    public void setClient(User client) {
        this.client = client;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }

    public Set<OrderItem> getItems() {
        return items;
    }

    public Double getTotal() {
        double sum =0.0;
        for (OrderItem x : items) {
            sum += x.getSubTotal();
        }
        return sum;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Order order = (Order) o;
        return id.equals(order.id);
    }

    @Override
    public int hashCode() {
        return id.hashCode();
    }
}
