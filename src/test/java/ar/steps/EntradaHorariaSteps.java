package ar.steps;

import ar.validaciones.ValidacionHoraria;
import ar.validaciones.ValidacionValoresEntrada;
import io.cucumber.java.en.And;
import services.BaseService;
import services.NuevaEntradaHorariaService;

public class EntradaHorariaSteps {
    @And("Se valida las consultas horarias")
    public void workspaceID(){
        ValidacionHoraria.validador();
    }
    @And("Agrego una descripcion '(.*)', una hora de inicio '(.*)' y una hora de fin '(.*)'$")
    public void valores(String descripcion,String inicio, String fin){
        BaseService.DESCRIPCION.set(descripcion);
        BaseService.INICIO.set(inicio);
        BaseService.FIN.set(fin);
    }
    @And("Se valida la entrada horaria")
    public void validacionHoraria(){
        ValidacionValoresEntrada.validador();
    }
    @And("Obtengo una entradaid")
    public void entradaid(){
        NuevaEntradaHorariaService.obtengoEntradaHorariaID();
    }
}