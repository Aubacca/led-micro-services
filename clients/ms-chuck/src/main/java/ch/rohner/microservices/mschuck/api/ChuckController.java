package ch.rohner.microservices.mschuck.api;

import ch.rohner.microservices.mschuck.models.JokeResponse;
import ch.rohner.microservices.mschuck.services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class ChuckController {

    private JokeService jokeService;

    @Autowired
    public ChuckController(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public JokeResponse getJoke() {
        return jokeService.getChuckNorrisJoke();
    }
}
