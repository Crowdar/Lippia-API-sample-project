package api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class ResponseHeaders {

    @JsonProperty("foo1")
    private String foo1;

    @JsonProperty("foo2")
    private String foo2;

    public String getFoo1() {
        return foo1;
    }

    public void setFoo1(String foo1) {
        this.foo1 = foo1;
    }

    public String getFoo2() {
        return foo2;
    }

    public void setFoo2(String foo2) {
        this.foo2 = foo2;
    }
}
