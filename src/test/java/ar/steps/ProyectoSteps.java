package ar.steps;

import ar.validaciones.ValidacionProyecto;
import io.cucumber.java.en.And;
import services.ProyectoService;

public class ProyectoSteps {
    @And("Validacion de proyecto")
    public void validacionProyecto(){
        ValidacionProyecto.validador();
    }
    @And("Obtengo un proyectoid")
    public void proyectoID(){
        ProyectoService.obtengoProyectoId();
    }
}
