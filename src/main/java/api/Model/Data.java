package api.Model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Data {

    @JsonProperty("data")
    private User user;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

}
