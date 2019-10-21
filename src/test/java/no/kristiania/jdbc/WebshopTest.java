package no.kristiania.jdbc;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WebshopTest {
    @Test
    void shouldRetrieveStoredProduct() {
        Productdao dao = new Productdao();
        dao.insertProduct("Apples");
        assertThat(dao.listAll()).contains("Apples");

    }
}
