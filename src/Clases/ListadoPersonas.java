
package Clases;

import Ventanas.CrearPersona;
import java.util.ArrayList;
import java.util.List;


/*
clase que represeta el listado de personas.
*/
public class ListadoPersonas {
  private List<Persona> listadoPersonas=new ArrayList();  

    public ListadoPersonas(List<Persona> listadoPersonas) {
        this.listadoPersonas = listadoPersonas;
    }

    public ListadoPersonas() {
        }

    public List<Persona> getListadoPersonas() {
        return listadoPersonas;
    }

    public void setListadoPersonas(List<Persona> listadoPersonas) {
        this.listadoPersonas = listadoPersonas;
    }
    
    public List<Persona> CargarDatos(Persona p){
    this.listadoPersonas.add(p);
    return listadoPersonas;
    }
}
