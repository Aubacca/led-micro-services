package ch.rohner.microservices.f1.finishingStatus.Models;

import ch.rohner.microservices.f1.finishingStatus.Models.msChuckNorris.JokeResponse;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties
public class FinishStatusResponse {
    @JsonProperty("MRData")
    private MRData mrData;
    private JokeResponse joke;

    public FinishStatusResponse() {
    }

    public MRData getMrData() {
        return mrData;
    }

    public void setMrData(MRData mrData) {
        this.mrData = mrData;
    }

    public JokeResponse getJoke() {
        return joke;
    }

    public void setJoke(JokeResponse joke) {
        this.joke = joke;
    }

}
