package ch.rohner.microservices.mschuck.services;

import ch.rohner.microservices.mschuck.models.JokeResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class JokeService {
    final static String URL_RANDOM_JOKE = "http://api.icndb.com/jokes/random";

    public JokeResponse getChuckNorrisJoke() {
        final RestTemplate restTemplate = new RestTemplate();
        final JokeResponse chuckNorrisJoke = restTemplate.getForObject(URL_RANDOM_JOKE, JokeResponse.class);
        return chuckNorrisJoke;
    }
}