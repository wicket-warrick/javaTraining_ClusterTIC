package visibilidadatributos;

public class VisibilidadAtributos {

    void run() {
       var unaCuenta = new Cuenta("Caja");
        
       unaCuenta.muestraEstado();
       unaCuenta.setNombre("Mi caja");
       
       (new Cuenta("Mi banco")).muestraEstado();
    }

    public static void main(String[] args) {
        (new VisibilidadAtributos()).run();
    }
}
