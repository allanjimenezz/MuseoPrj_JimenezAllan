import java.time.LocalDate;
import java.time.format.DateTimeFormatter; 
import java.util.ArrayList;
import java.util.List;

/**
 * Representa las ventas y la ganancia del museo en un día.
 * Cada venta del día contiene una lista con la información de boletos vendidos.
 * Cada venta del día especifica la fecha correspondiente.
 * 
 * @author Allan Jiménez
 * @version 1.0
 */
public class VentaDelDia
{
    /**
     * Día, mes y año en el que se realizan las ventas.
     */
    private String fechaDeLaVenta;
    
    /**
     * Lista de boletos vendidos en la fecha correspondiente.
     */
    private List<BoletoMuseo> boletosVendidos; 
    
    /**
     * Crea un registro de ventas del día con la fecha actual.
     * Inicializa la lista de boletos vendidos.
     * 
     */
    public VentaDelDia() {
        fechaDeLaVenta = establecerFechaDeLaVenta();
        boletosVendidos = new ArrayList<>();
    }
    
    /**
     * Agrega al arreglo un boleto vendido.
     * 
     * @param boleto el boleto que se agrega
     */
    public void registrarVentaBoleto(BoletoMuseo boleto) {
        boletosVendidos.add(boleto);
    }
    
    /**
     * Calcula la ganancia total del día.
     * 
     * @return el monto total recaudado en el día
     */
    public double calcularTotalVentaDelDia() {
        double total = 0.0;
        for (BoletoMuseo b : boletosVendidos) {
            total += b.getPrecio();
        }
        return total;
    }
    
    /**
     * Obtiene la fecha actual en formato yyyy-MM-dd
     * 
     * @return la fecha de la venta
     */
    private String establecerFechaDeLaVenta() {
        DateTimeFormatter f = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        return LocalDate.now().format(f);
    }
    
    /**
     * Devuelve una representación textual del estado actual de la venta del día.
     * 
     * @return una cadena con la fecha de la venta y la información detallada de cada boleto
     */
    public String toString() {
        String msg = "VentaDelDia\n";
        msg += " Fecha: " +fechaDeLaVenta + "\n";
        msg += " Cantidad de boletos: " + boletosVendidos.size() + "\n";
        msg += " Detalle:\n";
        for (BoletoMuseo b : boletosVendidos) {
            msg += " -Boleto #" + b.getNumeroBoleto() + " | " + b.getPrecio() + "\n";
        }
        msg += " Total: " + calcularTotalVentaDelDia();
        return msg;
    }
}