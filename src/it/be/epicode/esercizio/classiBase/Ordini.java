package it.be.epicode.esercizio.classiBase;

import java.time.LocalDate;
import java.util.List;

public class Ordini {
    Long id;
    String status;
    LocalDate orderDate;
    LocalDate deliveryDate;
    List<Prodotti> prodotti;
    Customer customer;


    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getStatus() {
        return status;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public LocalDate getOrderDate() {
        return orderDate;
    }
    public void setOrderDate(LocalDate orderDate) {
        this.orderDate = orderDate;
    }
    public LocalDate getDeliveryDate() {
        return deliveryDate;
    }
    public void setDeliveryDate(LocalDate deliveryDate) {
        this.deliveryDate = deliveryDate;
    }
    public List<Prodotti> getProdotti() {
        return prodotti;
    }
    public void setProdotti(List<Prodotti> prodotti) {
        this.prodotti = prodotti;
    }
    public Customer getCustomer() {
        return customer;
    }
    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Ordini(Long id, String status,LocalDate orderDate,LocalDate deliveryDate, List<Prodotti> prodotti, Customer customer){
        this.id = id;
        this.status = status;
        this.orderDate = orderDate;
        this.deliveryDate = deliveryDate;
        this.prodotti = prodotti;
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Ordini [id=" + id + ", status=" + status + ", orderDate=" + orderDate + ", deliveryDate=" + deliveryDate + ", prodotti=" + prodotti + ", customer=" + customer + "]";
    }
}

