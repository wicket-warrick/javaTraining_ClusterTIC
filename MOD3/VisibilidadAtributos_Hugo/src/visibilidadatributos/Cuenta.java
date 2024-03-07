
package visibilidadatributos;
import java.math.BigDecimal;
import java.util.Date;
/**
 *
 * @author hugo.suarez
 */
public class Cuenta {
    /* Creación de atributos para almacenar estado de cada un dos obxectos instanciados */
    private long number;
    private String name;
    private BigDecimal balance;
    
    
    
    /* Creación de atributo protegido, accesible para subclases de esta */
    /* Atributo de interes para calquera subclase derivada de Cuenta */
    private Date lastMovement;
    
    /* Creación de atributo protegido, accesible para subclases de esta */
    /*Maximo 'valor' do numero de conta, en función de Long.MAX_VALUE */
    public static final long MAX_NUM_CUENTA = Long.MAX_VALUE;
    
    /* Creación de atributos estáticos */
    /* Atributo estático para almacenar o seguinte código de conta */
    
    
    private static long nextCode = 1000L;
    
    /*Permite controlar o tempo de inicio da clase , cargada en memoria */
    private static long startClass;
    
    /*Bloque de inicialización , dos atributos estáticos*/
    // 
    static{
        startClass = System.nanoTime();
        System.out.println("Clase Cuenta cargada " + startClass);
        
    }
/* Método constructor que permite inicializar os atributos de cada obxecto instanciado */
    public Cuenta(String nameAccount) {
        //Número de conta incrementado en 1, segundo o atributo de clase
        number = nextCode++;
        //Nome da conta, segundo o parámetro de entrada(atributo de instancia)
        name = nameAccount;
        //Saldo inicial da conta, 0 (atributo de instancia)
        balance = new BigDecimal(0);
    }
    
    
    public void showState() {
        /* Método que permite mostrar o estado interno de cada obxecto instanciado */
        /*nextCode e getStartClase son atributos de clase */
        /*number, name e balance son atributos de instancia */
        System.out.println("nextCode = " + nextCode + "\n" +
                "startClass = " + startClass + "\n" +
                "number = " + getNumber() + "\n" +
                "name = " + getName()
        );
    }

    /**
     * @return the number
     */
    public long getNumber() {
        return number;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the balance
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * @return the lastMovement
     */
    public Date getLastMovement() {
        return lastMovement;
    }



}
