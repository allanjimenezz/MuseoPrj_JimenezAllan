import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * Representa un boleto emitido por el museo.
 * Cada boleto tiene un precio, número y fecha de emisión.
 * La clase mantiene un contador global de boletos emitidos.
 * 
 * @author Allan Jiménez
 * @version 1.0
 */
public class BoletoMuseo
{
    /**
     * Precio del boleto.
     */
    private double precio;
    
    /**
     * Número único asignado al boleto
     */
    private int numeroBoleto;
    
    /**
     * Fecha en que se emite el boleto.
     */
    private String fechaEmision;
    
    /**
     * Cantidad total de boletos emitidos.
     */
    private static int contador = 0;
    
    /**
     * Instancia un nuevo objeto de clase BoletoMuseo.
     * 
     * @param precio el precio del boleto
     */
    public BoletoMuseo(double precio) {
        this.precio = precio;
        contador++;
        this.numeroBoleto = contador;
        this.fechaEmision = establecerFechaEmisionBoleto();
    }
    
    /**
     * Obtiene la fecha de emisión en formato yyyy-MM-dd.
     * 
     * @return la fecha de emisión
     */
    private String establecerFechaEmisionBoleto() {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDate.now().format(f);
    }
    
    /**
     * Devuelve el total de boletos emitidos.
     * 
     * @return el número de boletos emitidos.
     */
    public static int getContador() {
        return contador;
    }
    
    
    /** 
     * Devuelve el número único del boleto.
     * 
     * @return el número dell boleto.
     */
    public int getNumeroBoleto() {
        return numeroBoleto;
    }
    
    /**
     * Devuelve el precio del boleto.
     * 
     * @return el precio del boleto.
     */
    public double getPrecio() {
        return precio;
    }
    
    /**
     * Devuelve una representación textual del estado actual del boleto.
     * 
     * @return una cadena con la información completa del boleto
     */
    public String toString() {
        String msg = "BoletoMuseo\n";
        msg += " Numero: " + numeroBoleto + "\n";
        msg += " Precio: " + precio + "\n";
        msg += " Fecha Emisión:" + fechaEmision;
        return msg;
    }
}