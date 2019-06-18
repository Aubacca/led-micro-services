package ch.rohner.microservices.f1.finishingStatus.Services;

import ch.rohner.microservices.f1.finishingStatus.Models.FinishStatusResponse;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class FinishingStatusService {
    private final static String URL_FINISHING_STATUS = "http://ergast.com/api/f1/status.json";
    private RestTemplate restTemplate;

    public FinishingStatusService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public FinishStatusResponse getFinishingStatus() {
        final FinishStatusResponse finishingStatus = restTemplate.getForObject("http://ergast.com/api/f1/status.json", FinishStatusResponse.class);
        return finishingStatus;
    }
}
