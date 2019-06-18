package ch.rohner.microservices.f1.finishingStatus.api;

import ch.rohner.microservices.f1.finishingStatus.Models.FinishStatusResponse;
import ch.rohner.microservices.f1.finishingStatus.Services.FinishingStatusService;
import ch.rohner.microservices.f1.finishingStatus.Services.JokeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class FinishingStatusController {
    private FinishingStatusService finishingStatusService;
    private JokeService jokeService;

    @Autowired
    public FinishingStatusController(FinishingStatusService finishingStatusService, JokeService jokeService) {
        this.finishingStatusService = finishingStatusService;
        this.jokeService = jokeService;
    }

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public FinishStatusResponse getFinishingStatus() {
        final FinishStatusResponse finishingStatus = finishingStatusService.getFinishingStatus();
        finishingStatus.setJoke(jokeService.getJoke());
        return finishingStatus;
    }
}
