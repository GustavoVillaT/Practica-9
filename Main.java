/**
* @author Brigada 4
*/
class Main {
  public static void main(String[] args) {
    System.out.println("Practica 9");
    try{
    String mensajes[] = {"uno","dos","tres"};
    for(int i=0;i<=3;i++)
      System.out.println(mensajes[i]);
    }catch(ArrayIndexOutOfBoundsException e){
      System.out.println("Error: "+e);
      System.out.println("Error: "+e.getMessage());
    }
    System.out.println("Esta linea esta cool");
    System.out.println("#################Exception Anidada###########");
    try{
      Integer denominador = 0;
      float equis=5/denominador;
      System.out.println(equis);
    }catch(ArrayIndexOutOfBoundsException e){
      System.out.println("Error: "+e.getMessage());
    }catch(ArithmeticException e){
      System.out.println("Error: "+e.getMessage());
    }catch(Exception e){
      System.out.println("Error: "+e.getMessage());
    }
    System.out.println("#################Propagación de Exception###########");
    try{
    imprimirArreglo();
    }catch(ArrayIndexOutOfBoundsException e){
      System.out.println("Error-> "+e.getMessage());
    }finally{
      System.out.println("Cualquier cosa que suceda, entra en el finally");
    }
    System.out.println("#################Creación de Exception###########");
    Cuenta cuenta= new Cuenta();
    try{
    cuenta.depositar(10000);
    cuenta.consultaSaldo();
    cuenta.retirar(800);
    cuenta.consultaSaldo();
    cuenta.retirar(1100);
    cuenta.consultaSaldo();
    cuenta.retirar(500);
    cuenta.consultaSaldo();
    cuenta.retirar(500);    
    }catch(SaldoInsuficienteException e){
      System.out.println("Error-> "+e.getMessage());
      ofrecerTarjetaCredito();
    }catch(operacionNoPermitidaException e){
      System.out.println("Error-> "+e.getMessage());
    }catch (limitanteRetirosException e){
      System.out.println("Error-> "+e.getMessage());
    }catch(Exception e){
      System.out.println("Error: "+e.getMessage());
    }
  }
    public static void ofrecerTarjetaCredito(){
      System.out.println("¿Te interesa una tarjeta de credito?");
    }
    //throws para documentacion
    public static void imprimirArreglo()throws ArrayIndexOutOfBoundsException{
       String mensajes[] = {"uno","dos","tres"};
    for(int i=0;i<=3;i++)
      System.out.println(mensajes[i]);
    }
  }