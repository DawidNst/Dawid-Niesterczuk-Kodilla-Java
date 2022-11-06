package com.kodilla.hibernate.invoice.dao;

import com.kodilla.hibernate.invoice.Invoice;
import com.kodilla.hibernate.invoice.Item;
import com.kodilla.hibernate.invoice.Product;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import java.math.BigDecimal;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;


@ExtendWith(SpringExtension.class)
@SpringBootTest
public class InvoiceDaoTestSuite {

    @Autowired
    private InvoiceDao invoiceDao;
    @Autowired
    private ProductDao productDao;

    @Test
    void testInvoiceDaoSave(){
        //Given
        Product product1 = new Product("Phone Oppo");
        Product product2 = new Product("HeadSeat Reza-er");
        Product product3 = new Product("Book Java");
        Item item1 = new Item(new BigDecimal(4000), new BigDecimal(1200), 3);
        Item item2 = new Item(new BigDecimal(260), new BigDecimal(520), 2);
        Item item3 = new Item(new BigDecimal(69), new BigDecimal(69), 1);
        Item item4 = new Item(new BigDecimal(122), new BigDecimal(488), 4);
        item1.setProduct(product1);
        item2.setProduct(product2);
        item3.setProduct(product3);
        item4.setProduct(product1);
        productDao.save(product1);
        productDao.save(product2);
        productDao.save(product3);
        Invoice invoice = new Invoice("order");
        invoice.getItems().add(item1);
        invoice.getItems().add(item2);
        invoice.getItems().add(item3);
        invoice.getItems().add(item4);
        item1.setInvoice(invoice);
        item2.setInvoice(invoice);
        item3.setInvoice(invoice);
        item4.setInvoice(invoice);


        //When
        invoiceDao.save(invoice);
        int id = invoice.getId();
        long numberOfProducts = productDao.count();
        List<Invoice> result = invoiceDao.findInvoiceByNumber("order");

        //Then
        assertEquals(1, result.size());
        assertNotEquals(0L, numberOfProducts);
        assertEquals(3, numberOfProducts);

        //CleanUp
        try {
            productDao.deleteById(product1.getId());
            productDao.deleteById(product2.getId());
            productDao.deleteById(product3.getId());
            invoiceDao.deleteById(id);
        } catch (Exception e) {
            //do nothing
        }


    }


}