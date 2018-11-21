/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposvariables;

/**
 *
 * @author soporte
 */
public class Tiposvariables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //varibles publicas
        variablespublicas.estado = "Procesando Solicitud";
        variablespublicas.identificador =
                (int) (Math.random()* 100);
        
        System.out.println("La ciudad es " + constantes.ciudad);
        
        if (constantes.pais.equals("Argentina")){
            instancia Instancia = new instancia ("Araceli", "Estudiante"); 
        }
        
    }
    
    
}
