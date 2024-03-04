/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cobropagos;
import java.util.Date;
import java.util.Scanner;
import java.math.BigDecimal;

public class CobroPagos {
    /* Definición de estructuras de datos*/
    /*Opcións a executar polo programa*/
    enum Opcion{COBRO, PAGO,MOVIMIENTOS,SALIR};
    
    /*Opcións tipos de movementos*/
    enum TipoMovimiento{CARGO,ABONO};
    
    /*Dato/obxecto que guarda toda a información*/
    
    final class Movimiento{
        Date fechaMovimiento;
        TipoMovimiento tipo;
        String concepto;
        BigDecimal importe;
        
        public String toString(){
            return tipo.name() + " el "+fechaMovimiento+" por"+importe+ " euros. '" +concepto+"'";
        }
        
    }
    /*Número máximo de movimientos*/
    final static int MAX_MOVIMIENTOS=1024;

/* Creación de array de número movimiento, onde defino que número de movimientos realicei e como son cada un deste movimientos do array.
neste caso, son do tipo class Movimiento
*/
    Movimiento[] movimientos=new Movimiento[MAX_MOVIMIENTOS];
    int numMovimientos=0;

/*Implementación de métodos que darán funcionalidade á aplicación*/

//Bucle principal da aplicación.

    void bucleApp(){
    Opcion opcion;
    do{
    muestraOpciones();
    opcion=solicitarOpcion();
    switch(opcion){
        case COBRO:
        case PAGO:
            anotaMovimientos(opcion==Opcion.COBRO ? TipoMovimiento.ABONO : TipoMovimiento.CARGO);
            break;
        case MOVIMIENTOS:
            listaMovimientos();
            break;
            
    }}while(opcion !=Opcion.SALIR);
    
}
    
    
    void muestraOpciones(){
    for(Opcion unaOpcion : Opcion.values())System.out.printf("\t%d ->%s\n",unaOpcion.ordinal(),unaOpcion.name());}

    Opcion solicitarOpcion(){
        Scanner scanner = new Scanner(System.in);
        int opcion;
        System.out.print("\nIntroduce ó número de opción a executar: ");
        opcion=scanner.nextInt();
        return Opcion.values()[opcion];
        
    }
    void anotaMovimientos(TipoMovimiento tipo){
        Scanner scanner =new Scanner (System.in);
        //Creamos un novo momento e gardámolo onde corresponda dentro do array de movementos
        movimientos[numMovimientos]=new Movimiento();
        //Agregamos o tipo de movemento
        movimientos[numMovimientos].tipo=tipo;
        movimientos[numMovimientos].fechaMovimiento=new Date();
        System.out.print("Concepto: ");
        movimientos[numMovimientos].concepto=scanner.nextLine();
        System.out.print("Importe: ");
        movimientos[numMovimientos].importe=new BigDecimal(scanner.next());
        System.out.println("\nMovimiento anotado correctamente");
        numMovimientos++;
    }
    
    void listaMovimientos(){
        System.out.println();
        for (int i=0;i<numMovimientos;i++){
            System.out.println(movimientos[i]);
        System.out.println();
        
        }
    }
    
    
    
    
    
    
    public static void main(String[] args) {
        /**
         * Crea o obxecto da clase CobroPagos, e en lugar de almacenalo, 
         * executa o método bucleApp, que é o bucle principal de execución do
         * progrma.
         */
        (new CobroPagos()).bucleApp();
       
    }
    
}
