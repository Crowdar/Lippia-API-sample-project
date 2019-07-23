package api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Users {

    @JsonProperty("data")
    List<User> data;

    @JsonProperty("page")
    private int page;

    @JsonProperty("total")
    private int total;

    public List<User> getData() {
        return data;
    }

    public void setData(List<User> data) {
        this.data = data;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

}
