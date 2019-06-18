package ch.rohner.microservices.f1.finishingStatus.Services;

import ch.rohner.microservices.f1.finishingStatus.Models.msChuckNorris.JokeResponse;
import com.netflix.discovery.EurekaClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class JokeService {
//    private final static String URL_JOKE_SERVICE = "http://MS-CHUCK-NORRIS-JOKES/api/v1";
    private final static String URL_JOKE_SERVICE = "http://localhost:8101/api/v1";
    @LoadBalanced()
    private RestTemplate restTemplate;

    @Qualifier("eurekaClient")
    @Autowired
    private EurekaClient discoveryClient;

    public JokeService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public JokeResponse getJoke() {
        String url = discoveryClient.getNextServerFromEureka("ms-chuck-norris-jokes", false).getHomePageUrl();
        final JokeResponse jokeResult = restTemplate.getForObject(url + "/api/v1", JokeResponse.class);
        return jokeResult;
    }
}
