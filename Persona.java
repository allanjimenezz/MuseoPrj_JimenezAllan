/**
 * Representa una persona que puede comprar un boleto del museo.
 * Cada persona tiene un nombre.
 * Cada persona puede tener una identificación única y un boleto asociado.
 * 
 * @author Allan Jiménez
 * @version 1.0
 */
public class Persona
{
    /**
     * Nombre de la persona.
     */
    private String nombre;
    
    /** 
     * Identificación única de la persona. 
     */
    private String identificacion;
    
    /** 
     * Boleto asignado a la persona.
     */
    private BoletoMuseo miBoleto;
    
    /**
     * Instancia un nuevo objeto de clase Persona con nombre e identificación.
     * 
     * @param nombre el nombre de la persona
     * @param ident la identidificación única de la persona
     */
    public Persona(String nombre, String ident) {
        this(nombre);
        identificacion = ident;
    }
    
    /**
     * Instancia un nuevo objeto de clase Persona únicamente con el nombre. 
     * 
     * @param nombre el nombre de la persona
     */
    public Persona(String nombre) {
        this.nombre = nombre;
    }
    
    /**
     * Asigna un valor al atributo identificación.
     * 
     * @param pIdentificacion la identificación única de la persona
     */
    public void setIdentificacion(String pIdentificacion) {
        identificacion = pIdentificacion;
    }
    
    /**
     * Asigna un boleto a una persona.
     * 
     * @param pMiBoleto el boleto que se asigna
     */
    public void asignarBoleto(BoletoMuseo pMiBoleto) {
        miBoleto = pMiBoleto;
    }
    
    /**
     * Consulta el valor del boleto asociado.
     * 
     * @return el número de boleto asignado
     */
    public int consultarMiNumeroDeBoleto() {
        return miBoleto.getNumeroBoleto();
    }
    
    /**
     * Devuelve una representación textual del estado actual de la persona.
     * 
     * @return una cadena con la información completa de la persona
     */
    public String toString() {
        String msg = "\n";
        msg += " Nombre: " + nombre + "\n";
        msg += " Identificación: " + identificacion + "\n";
        if (miBoleto != null) {
            msg += " Boleto asignado: #" + miBoleto.getNumeroBoleto() + "\n";
        } else {
            msg += " Boleto asignado: (ninguno)\n";
        }
        return msg;
    }
}