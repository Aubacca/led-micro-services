package ch.rohner.microservices.f1.finishingStatus.Models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties
public class MRData {
    private String series;
    private String url;
    private String limit;
    private String offset;
    private String total;
    @JsonProperty("StatusTable")
    private StatusTable statusTable;

    public MRData() {
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public String getOffset() {
        return offset;
    }

    public void setOffset(String offset) {
        this.offset = offset;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public StatusTable getStatusTable() {
        return statusTable;
    }

    public void setStatusTable(StatusTable statusTable) {
        this.statusTable = statusTable;
    }

    @Override
    public String toString() {
        return "MRData{" +
                "series='" + series + '\'' +
                ", url='" + url + '\'' +
                ", limit='" + limit + '\'' +
                ", offset='" + offset + '\'' +
                ", total='" + total + '\'' +
                ", statusTable=" + statusTable +
                '}';
    }
}
