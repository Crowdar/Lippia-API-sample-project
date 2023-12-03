package ar.steps;

import ar.validaciones.ValidacionHoraria;
import ar.validaciones.ValidacionNuevaEntrada;
import io.cucumber.java.en.And;
import services.BaseService;


public class EntradaHorariaSteps {
    @And("Se valida las entradas horarias")
    public void workspaceID(){
        ValidacionHoraria.validador();
    }
    @And("Agrego una descripcion '(.*)', una hora de inicio '(.*)' y una hora de fin '(.*)'")
    public void valores(String descripcion,String inicio, String fin){
        BaseService.DESCRIPCION.set(descripcion);
        BaseService.INICIO.set(inicio);
        BaseService.FIN.set(fin);
    }
    @And("Se valida la nueva entrada horaria")
    public void validacionHoraria(){
        ValidacionNuevaEntrada.validador();
    }
}