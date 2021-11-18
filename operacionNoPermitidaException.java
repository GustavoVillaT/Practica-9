/**
* @author Brigada 4
*/
public class operacionNoPermitidaException extends Exception{
  public operacionNoPermitidaException(){
    super("No se permiten depositos mayores a $20000");
  }
}