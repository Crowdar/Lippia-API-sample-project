package ar.steps;

import ar.validaciones.ValidacionUsuario;
import io.cucumber.java.en.And;
import services.UsuarioService;

public class UsuarioSteps {
    @And("Valido los datos de mi usuario")
    public void validacionUsuario(){
        ValidacionUsuario.validador();
    }
    @And("Obtengo un usuarioid valido")
    public void usuarioID(){
        UsuarioService.obtengoUsuarioId();
    }
}
