package api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Data {

    @JsonProperty("data")
    private User data;

    public User getData() {
        return data;
    }

    public void setData(User data) {
        this.data = data;
    }

}
