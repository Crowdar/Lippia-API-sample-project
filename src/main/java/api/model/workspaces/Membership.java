package api.model.workspaces;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class Membership {
    public String userId;
    public Object hourlyRate;
    public Object costRate;
    public String targetId;
    public String membershipType;
    public String membershipStatus;
}
