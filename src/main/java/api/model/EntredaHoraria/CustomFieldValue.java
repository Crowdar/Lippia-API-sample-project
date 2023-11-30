package api.model.EntredaHoraria;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class CustomFieldValue {
    private String customFieldId;
    private String timeEntryId;
    private String value;
    private String name;
    private String type;
}
