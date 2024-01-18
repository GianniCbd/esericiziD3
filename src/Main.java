import it.be.epicode.esercizio.categoria.Categoria;
import it.be.epicode.esercizio.classiBase.Customer;
import it.be.epicode.esercizio.classiBase.Ordini;
import it.be.epicode.esercizio.classiBase.Prodotti;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public class Main {
    public static void main(String[] args) {
        Customer clienteUno = new Customer(23L,"Mario Rossi",2);
        Customer clienteDue = new Customer(24L,"Francesco Bianchi",1);
        Customer clienteTre = new Customer(25L,"Pamela Verdi",1);
        //------------------------------------------------------------------//
        Prodotti prodottoUno = new Prodotti(1L,"PS5", Categoria.BOYS, 499.99);
        Prodotti prodottoDue = new Prodotti(2L,"BoxSet GoT", Categoria.BOOKS,116.99);
        Prodotti prodottoTre = new Prodotti(3L,"Biberon",Categoria.BABY,4.80);
        Prodotti prodottoQuattro = new Prodotti(4L,"NikeAirForce",Categoria.BOYS,119.0);
        Prodotti prodottoCinque = new Prodotti(5L,"Java, La guida completa",Categoria.BOOKS,54.05);
        Prodotti prodottoSei = new Prodotti(6L,"Maglia 8-12Mesi", Categoria.BABY,20.0);
        Prodotti prodottoSette = new Prodotti(7L,"BoxSet Harry Potter",Categoria.BOOKS,110.0);
        List<Prodotti> carrelloUno = new ArrayList<>();
        carrelloUno.add(prodottoCinque);
        carrelloUno.add(prodottoTre);
        carrelloUno.add(prodottoUno);
        List<Prodotti> carrelloDue = new ArrayList<>();
        carrelloDue.add(prodottoSette);
        carrelloDue.add(prodottoDue);
        carrelloDue.add(prodottoQuattro);
        carrelloDue.add(prodottoSei);
        List<Prodotti> carrelloTre = new ArrayList<>();
        carrelloTre.add(prodottoCinque);
        //----------------------------------------------------------------------------//
        Ordini ordineUno = new Ordini(100L,"In Lavorazione", LocalDate.of(22, 2, 1),LocalDate.of(22, 2, 3),carrelloDue,clienteUno);
        Ordini ordiniDue = new Ordini(101L,"In Consegna",LocalDate.of(22, 2, 1),LocalDate.of(22, 2, 3),carrelloUno,clienteTre);
        Ordini ordiniTre = new Ordini(102L,"Errore di inserimento indirizzo",LocalDate.of(22, 2, 1),LocalDate.of(22, 2, 3),carrelloTre,clienteDue);
        //----------------------------------------------------------------------------//

        List<Prodotti> tuttiProdotti = new ArrayList<>();
        tuttiProdotti.add(prodottoUno);
        tuttiProdotti.add(prodottoDue);
        tuttiProdotti.add(prodottoTre);
        tuttiProdotti.add(prodottoQuattro);
        tuttiProdotti.add(prodottoCinque);
        tuttiProdotti.add(prodottoSei);
        tuttiProdotti.add(prodottoSette);
        System.out.println("Libri più costosi");
        ListaProdotti(tuttiProdotti);
        System.out.println("**************************************************");
        List<Ordini> tuttiOrdini = new ArrayList<>();
        tuttiOrdini.add(ordineUno);
        tuttiOrdini.add(ordiniDue);
        tuttiOrdini.add(ordiniTre);
        System.out.println("Lista ordini con prodotti categoria Baby");
        ListaOrdini(tuttiOrdini);
        System.out.println("**************************************************");
        List<Ordini> tuttiOrdiniBoys = new ArrayList<>();
        tuttiOrdiniBoys.add(ordineUno);
        tuttiOrdiniBoys.add(ordiniDue);
        tuttiOrdiniBoys.add(ordiniTre);
        System.out.println("Lista ordini con prodotti categoria Boys");
        ListaOrdiniBoys(tuttiOrdiniBoys);

        System.out.println("**************************************************");
        System.out.println("Informazioni sul cliente uno:");
        System.out.println("ID: " + clienteUno.getId() + " - " + "Nome: " + clienteUno.getName() + " - " + "Livello: " + clienteUno.getTier());
        System.out.println("**************************************************");
        System.out.println("Informazioni sul cliente due:");
        System.out.println("ID: " + clienteDue.getId() + " - " + "Nome: " + clienteDue.getName() + " - " + "Livello: " + clienteDue.getTier());
        System.out.println("**************************************************");
        System.out.println("Informazioni sul cliente tre:");
        System.out.println("ID: " + clienteTre.getId() + " - " + "Nome: " + clienteTre.getName() + " - " + "Livello: " + clienteTre.getTier());


        System.out.println("**************************************************");
        System.out.println("Informazioni sul prodotto uno:");
        System.out.println("ID: " + prodottoUno.getId() + " - " + "Nome: " + prodottoUno.getNameProduct() + " - " + "Categoria: " + prodottoUno.getCategory() + " - " + "Prezzo: " + prodottoUno.getPrice());


        System.out.println("**************************************************");
        System.out.println("Informazioni sull'ordine uno:");
        System.out.println("ID: " + ordineUno.getId() + " - " + "Stato: " + ordineUno.getStatus() + " - " + "Data ordine: " + ordineUno.getOrderDate() + " - " + "Data consegna: " + ordineUno.getDeliveryDate() + " - " + "Prodotti: " + ordineUno.getProdotti() + " - " + "Cliente: " + ordineUno.getCustomer());
        System.out.println("**************************************************");
        System.out.println("Informazioni sull'ordine due:");
        System.out.println("ID: " + ordiniDue.getId() + " - " + "Stato: " + ordiniDue.getStatus() + " - " + "Data ordine: " + ordineUno.getOrderDate() + " - " + "Data consegna: " + ordiniDue.getDeliveryDate() + " - " + "Prodotti: " + ordiniDue.getProdotti() + " - " + "Cliente: " + ordiniDue.getCustomer());
        System.out.println("**************************************************");
        System.out.println("Informazioni sull'ordine tre:");
        System.out.println("ID: " + ordiniTre.getId() + " - " + "Stato: " + ordiniTre.getStatus() + " - " + "Data ordine: " + ordiniTre.getOrderDate() + " - " + "Data consegna: " + ordiniTre.getDeliveryDate() + " - " + "Prodotti: " + ordiniTre.getProdotti() + " - " + "Cliente: " + ordiniTre.getCustomer());

    }


    public static void ListaProdotti(List<Prodotti> tuttiProdotti){
        List<Prodotti> book = tuttiProdotti.stream().filter(c -> c.getCategory() == Categoria.BOOKS).filter(p -> p.getPrice() > 100).toList();
        ;
        for(Prodotti prodotti : book){
            System.out.println(prodotti.getNameProduct());
        }
    }

    public static void ListaOrdini(List<Ordini> tuttiOrdini) {
        tuttiOrdini.stream()
                .filter(o -> o.getProdotti().stream()
                        .anyMatch(c -> c.getCategory() == Categoria.BABY))
                .forEach(o -> System.out.println("Id:" + o.getId() + " " + "Categoria:" + o.getProdotti().stream()
                        .filter(c -> c.getCategory() == Categoria.BABY)
                        .findFirst()
                        .get()
                        .getCategory()));
    }

    public static void ListaOrdiniBoys(List<Ordini> tuttiOrdiniBoys) {
        tuttiOrdiniBoys.stream()
                .filter(o -> o.getProdotti().stream()
                        .anyMatch(c -> c.getCategory() == Categoria.BOYS))
                .forEach(o -> {

                    System.out.println("Id:" + o.getId() + " " + "Categoria:" + o.getProdotti().stream()
                            .filter(c -> c.getCategory() == Categoria.BOYS)
                            .findFirst()
                            .map(boysProduct -> {
                                double sconto = boysProduct.getPrice() * 0.10;
                                double prezzoScontato = boysProduct.getPrice() - sconto;
                                boysProduct.setPrice(prezzoScontato);
                                return boysProduct.getCategory();
                            })
                            .get()
                    );
                });
    }



}