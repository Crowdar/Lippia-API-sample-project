package api.model.workspaces;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Membership {
    private String userId;
    private String hourlyRate;
    private String costRate;
    private String targetId;
    private String membershipType;
    private String membershipStatus;
}
