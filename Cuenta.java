/**
* @author Brigada 4
*/
public class Cuenta{
  private double saldo;
  /**
  * Constructor
  @ param saldo Saldo de la cuenta
  */
  public Cuenta(){
    saldo=0;
  }
  /**
  * Depositar
  * @param monto valor que va a depositar
  * @return saldo Valor monetario en la cuenta
  */
  public void depositar(double monto) throws operacionNoPermitidaException{
  System.out.println("Depositando...");
  if(monto>20000)
    throw new operacionNoPermitidaException();
  else
    saldo+=monto;
  }
  private int numeroRetiros=1;
  /**
  * Retirar
  * @param monto valor que va a retirar
  * @return saldo Valor monetario en la cuenta
  */
  public void retirar(double monto) throws SaldoInsuficienteException,ArithmeticException,limitanteRetirosException{
    if(numeroRetiros>3)
      throw new limitanteRetirosException();
    else{
      System.out.println("Retirando...");
      if(saldo<monto)
        throw new SaldoInsuficienteException();
      else{
        saldo-=monto;
        System.out.println(numeroRetiros); //Numero de retiros hechos
        numeroRetiros+=1;
      }
    }
  }
  /**
  * Consultar Saldo
  * @return saldo Valor monetario en la cuenta
  */
  public double consultaSaldo(){
    System.out.println("Tu saldo es: "+saldo);
    return saldo;
  }
}