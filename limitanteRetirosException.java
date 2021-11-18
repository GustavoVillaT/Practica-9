/**
* @author Brigada 4
*/
public class limitanteRetirosException extends Exception{
  public limitanteRetirosException(){
    super("No se permiten mas de 3 retiros diarios");
  }
}