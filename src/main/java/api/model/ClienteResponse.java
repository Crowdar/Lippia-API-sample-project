package api.model;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class ClienteResponse {
    public String id;
    public String name;
    public String email;
    public String workspaceId;
    public boolean archived;
    public String address;
    public String note;
}