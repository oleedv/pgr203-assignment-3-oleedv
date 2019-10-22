package no.kristiania.jdbc;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class WebshopTest {

    @Test
    void shouldRetrieveStoredProducts() {
        ProductDao dao = new ProductDao();
        dao.insertProduct("Apples");
        assertThat(dao.listAll()).contains("Apples");
    }
}
