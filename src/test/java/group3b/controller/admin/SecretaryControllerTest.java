package group3b.controller.admin;

import group3b.domain.Secretary;
import group3b.factory.SecretaryFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.*;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.client.HttpClientErrorException;

import static org.junit.Assert.*;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@RunWith(SpringRunner.class)
public class SecretaryControllerTest {

    @Autowired

    private TestRestTemplate restTemplate;
    private String baseURL="http://localhost:8080/secretary";

    @Test
    public void create() {
        Secretary secretary = SecretaryFactory.getSecretary("Secretary One");

        ResponseEntity<Secretary> postResponse = restTemplate.postForEntity(baseURL + "/create", secretary, Secretary.class);
        assertNotNull(postResponse);
        assertNotNull(postResponse.getBody());
    }

    @Test
    public void update() {
        int id = 1;
        Secretary secretary = restTemplate.getForObject(baseURL + "/Secretary/" + id, Secretary.class);

        restTemplate.put(baseURL + "/secretarys/" + id, secretary);
        Secretary updatedSecretary = restTemplate.getForObject(baseURL + "/Secretary/" + id, Secretary.class);
        assertNotNull(updatedSecretary);
    }

    @Test
    public void delete() {
        int id = 2;
        Secretary secretary = restTemplate.getForObject(baseURL + "/secretarys/" + id, Secretary.class);
        assertNotNull(secretary);
        restTemplate.delete(baseURL + "/secretarys/" + id);
        try {
            secretary = restTemplate.getForObject(baseURL + "/secretarys/" + id, Secretary.class);
        } catch (final HttpClientErrorException e) {
            assertEquals(e.getStatusCode(), HttpStatus.NOT_FOUND);
        }
    }

    @Test
    public void read() {
        Secretary secretary = restTemplate.getForObject(baseURL + "/read", Secretary.class);
        assertNotNull(secretary);
    }

    @Test
    public void getAll() {

        HttpHeaders headers = new HttpHeaders();

        HttpEntity<String> entity = new HttpEntity<String>(null, headers);
        ResponseEntity<String> response = restTemplate.exchange(baseURL + "/read/all",
                HttpMethod.GET, entity, String.class);
        assertNotNull(response.getBody());

    }
}