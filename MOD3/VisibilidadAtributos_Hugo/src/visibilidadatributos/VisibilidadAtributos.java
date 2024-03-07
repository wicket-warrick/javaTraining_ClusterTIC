/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package visibilidadatributos;

/*Clase principal, que permite crerar obxecto da clase Cuenta */
/*Funcionamento da aplicación*/
public class VisibilidadAtributos {
    /*Creación de obxecto da clase Cuenta e traballo con eles*/
    void run (){
        Cuenta  account1 = new Cuenta("Cash");
        account1.showState();
        // Unha vez creado os getters e setters, xa poden acceder ós atributos privados
        account1.setName("Nova conta");
        
    }

    
    public static void main(String[] args) {
        /*Crear un obexcto da clase principal .*/
        (new VisibilidadAtributos()).run();
     
    }
    
}
