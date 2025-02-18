package org.example;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;

@Component
@JsonIgnoreProperties(ignoreUnknown = true)
public class Anzeige implements CommandLineRunner {

    @Autowired
    private WarehouseInt warehouseRepository;

    @Autowired
    private ProductInt productRepository;

    @Override
    public void run(String... args) throws Exception {
        // Erstelle 2 Warehouse Datensätze
        Warehouse warehouse1 = new Warehouse();
        warehouse1.setWarehouseName("Linz Bahnhof");
        warehouse1.setWarehouseAddress("Bahnhofsstrasse 27/9");
        warehouse1.setWarehousePostalCode("4020");
        warehouse1.setWarehouseCity("Linz");
        warehouse1.setWarehouseCountry("Austria");
        warehouse1.setTimestamp(Timestamp.valueOf("2021-09-12 08:52:39.077"));

        Warehouse warehouse2 = new Warehouse();
        warehouse2.setWarehouseName("Wien Hauptbahnhof");
        warehouse2.setWarehouseAddress("Wien Hauptbahnhof 1");
        warehouse2.setWarehousePostalCode("1100");
        warehouse2.setWarehouseCity("Wien");
        warehouse2.setWarehouseCountry("Austria");
        warehouse2.setTimestamp(Timestamp.valueOf("2021-09-13 09:05:21.101"));

        warehouseRepository.save(warehouse1);
        warehouseRepository.save(warehouse2);

        // Erstelle 10 Product Datensätze
        Product product1 = new Product();
        product1.setProductID(1);
        product1.setProductName("Bio Orangensaft Sonne");
        product1.setProductCategory("Getränk");
        product1.setProductQuantity(2500);
        product1.setProductUnit("Packung 1L");
        product1.setWarehouse(warehouse1);

        Product product2 = new Product();
        product2.setProductID(2);
        product2.setProductName("Bio Apfelsaft Gold");
        product2.setProductCategory("Getränk");
        product2.setProductQuantity(3420);
        product2.setProductUnit("Packung 1L");
        product2.setWarehouse(warehouse1);

        Product product3 = new Product();
        product3.setProductID(3);
        product3.setProductName("Ananas Saft");
        product3.setProductCategory("Getränk");
        product3.setProductQuantity(3000);
        product3.setProductUnit("Packung 0.5L");
        product3.setWarehouse(warehouse1);

        Product product4 = new Product();
        product4.setProductID(4);
        product4.setProductName("Apfelmus");
        product4.setProductCategory("Lebensmittel");
        product4.setProductQuantity(1500);
        product4.setProductUnit("Packung 500g");
        product4.setWarehouse(warehouse1);

        Product product5 = new Product();
        product5.setProductID(5);
        product5.setProductName("Kaffee");
        product5.setProductCategory("Getränk");
        product5.setProductQuantity(1200);
        product5.setProductUnit("Packung 250g");
        product5.setWarehouse(warehouse2);

        Product product6 = new Product();
        product6.setProductID(6);
        product6.setProductName("Tee Kamille");
        product6.setProductCategory("Getränk");
        product6.setProductQuantity(1800);
        product6.setProductUnit("Packung 100g");
        product6.setWarehouse(warehouse2);

        Product product7 = new Product();
        product7.setProductID(7);
        product7.setProductName("Honig");
        product7.setProductCategory("Lebensmittel");
        product7.setProductQuantity(2200);
        product7.setProductUnit("Packung 1kg");
        product7.setWarehouse(warehouse2);

        Product product8 = new Product();
        product8.setProductID(8);
        product8.setProductName("Getreide Bio");
        product8.setProductCategory("Lebensmittel");
        product8.setProductQuantity(2500);
        product8.setProductUnit("Packung 1kg");
        product8.setWarehouse(warehouse2);

        Product product9 = new Product();
        product9.setProductID(9);
        product9.setProductName("Kochschokolade");
        product9.setProductCategory("Süssigkeiten");
        product9.setProductQuantity(1000);
        product9.setProductUnit("Packung 500g");
        product9.setWarehouse(warehouse2);

        Product product10 = new Product();
        product10.setProductID(10);
        product10.setProductName("Kekse Bio");
        product10.setProductCategory("Süssigkeiten");
        product10.setProductQuantity(1700);
        product10.setProductUnit("Packung 250g");
        product10.setWarehouse(warehouse2);

        // Speichern der Produkte
        productRepository.save(product1);
        productRepository.save(product2);
        productRepository.save(product3);
        productRepository.save(product4);
        productRepository.save(product5);
        productRepository.save(product6);
        productRepository.save(product7);
        productRepository.save(product8);
        productRepository.save(product9);
        productRepository.save(product10);
    }
}