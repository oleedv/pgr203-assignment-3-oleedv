package no.kristiania.jdbc;

import org.junit.Test;

import java.util.Random;

import static org.assertj.core.api.Assertions.assertThat;

public class WebshopTest {

    @Test
    public void shouldRetrieveStoredProducts() {
        ProductDao dao = new ProductDao();
        String productName = pickOne(new String[] {"Apples", "Bananas", "Coconuts", "Dates"});
        dao.insertProduct(productName);
        assertThat(dao.listAll()).contains(productName);
    }

    private String pickOne(String[] strings) {
        return strings[new Random().nextInt(strings.length)];
    }
}
