package visibilidadatributos;

import java.math.BigDecimal;
import java.util.Date;

public class Cuenta {   
    // Atributos con el estado interno de cada cuenta, privados
    private long numero;
    private String nombre;
    private BigDecimal saldo;
    
    // Atributo protegido, accesible para subclases de esta
    private Date ultimoMovimiento;

    // Constante pública accesible para todos
    public static final long MAX_NUM_CUENTA = Long.MAX_VALUE;
    
    // Atributos estáticos
    private static long siguienteCodigo = 1000L;
    private static long inicioClase;
    
    // Bloque de inicialización
    static {
        inicioClase = System.nanoTime();
        System.out.println("Clase Cuenta cargada " + getInicioClase());
    }

    /**
     * @return the inicioClase
     */
    public static long getInicioClase() {
        return inicioClase;
    }

    public Cuenta(String nombreCuenta) {
        numero = siguienteCodigo++;
        nombre = nombreCuenta;
        saldo = new BigDecimal(0);
    }
   
    public void muestraEstado() {
        System.out.println("siguienteCodigo = " + siguienteCodigo + "\n" +
                "inicioClase = " + getInicioClase() + "\n" +
                "numero = " + getNumero() + "\n" +
                "nombre = " + getNombre()
        );
    }

    /**
     * @return the numero
     */
    public long getNumero() {
        return numero;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the saldo
     */
    public BigDecimal getSaldo() {
        return saldo;
    }

    /**
     * @return the ultimoMovimiento
     */
    public Date getUltimoMovimiento() {
        return ultimoMovimiento;
    }
}
