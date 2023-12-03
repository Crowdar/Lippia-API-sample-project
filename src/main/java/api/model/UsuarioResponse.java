package api.model;

import api.model.usuario.Settings;
import lombok.Getter;
import lombok.Setter;
import java.util.ArrayList;

@Getter
@Setter

public class UsuarioResponse {
    public String id;
    public String email;
    public String name;
    public ArrayList<Object> memberships;
    public String profilePicture;
    public String activeWorkspace;
    public String defaultWorkspace;
    public Settings settings;
    public String status;
    public ArrayList<Object> customFields;
}
