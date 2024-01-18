package it.be.epicode.esercizio.classiBase;


import it.be.epicode.esercizio.categoria.Categoria;

public class Prodotti {
    Long id;
    String nameProduct;
    Categoria category;
    Double price;
    public Prodotti (Long id, String nameProduct, Categoria category, Double price){
        this.id = id;
        this.nameProduct = nameProduct;
        this.category = category;
        this.price = price;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNameProduct() {
        return nameProduct;
    }
    public void setNameProduct(String nameProduct) {
        this.nameProduct = nameProduct;
    }
    public Categoria getCategory() {
        return category;
    }
    public void setCategory(Categoria category) {
        this.category = category;
    }
    public Double getPrice() {
        return price;
    }
    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Prodotti [id=" + id + ", nomeProdotto=" + nameProduct + ", categoria=" + category + ", prezzo=" + price + "]";
    }
}