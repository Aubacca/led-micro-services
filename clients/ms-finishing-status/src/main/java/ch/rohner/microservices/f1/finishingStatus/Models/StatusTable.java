package ch.rohner.microservices.f1.finishingStatus.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

@JsonIgnoreProperties
public class StatusTable {
    @JsonProperty("Status")
    private List<Status> status;

    public StatusTable() {
    }

    public List<Status> getStatus() {
        return status;
    }

    public void setStatus(List<Status> status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "StatusTable{" +
                "status=" + status +
                '}';
    }
}
