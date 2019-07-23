package api.model;

import com.fasterxml.jackson.annotation.JsonProperty;

public class UserCreated {

    @JsonProperty("name")
    private String name;

    @JsonProperty("job")
    private String job;

    @JsonProperty("id")
    private String id;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }


}
