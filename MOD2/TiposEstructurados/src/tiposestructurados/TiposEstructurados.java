/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tiposestructurados;

import java.util.Date;


public class TiposEstructurados {

 

    enum Mes {
        xaneiro, febreiro, marzo, abril, maio, xuño, xullo, agosto, setembro, outubro, novembro, decembro
    }
    enum Intensidad{CEGADOR,BRILLANTE,VISIBLE,APAGADO,INVISIBLE}

static final class SistemaSolar{
    String name;
    Intensidad brillo;
    int numEstrellas;
    int numPlaneta;
    double diametroUA;
    boolean hayVida;
    Date fechaRegistro;
    @Override
    public String toString(){
        return "Sistema solar "+name+" con brillo "+brillo.name()+"\nTiene " +numEstrellas+ " estrellas y "+numPlaneta+" planetas";
    }
    
    
}

public static void main(String[] args){
SistemaSolar unsistemaSolar=new SistemaSolar();
unsistemaSolar.name="Carenina 2b";
unsistemaSolar.brillo=Intensidad.VISIBLE;
unsistemaSolar.numEstrellas=5;
unsistemaSolar.numPlaneta=3;
unsistemaSolar.diametroUA=8.5;
unsistemaSolar.hayVida=true;
unsistemaSolar.fechaRegistro=new Date();

SistemaSolar[] sistemasGalacticos=new SistemaSolar[12];
sistemasGalacticos[0]=new SistemaSolar();

System.out.println(unsistemaSolar);
}
}