package coche;

/**
 *
 * @author Jesus_Jurado
 * 
 */
public class Main {
    
      public static void main(String[] args) {
        Coche mycar;
        int stockActual;
        
        mycar = vende_car();
        
        compra_car(mycar);
        
        stockActual = mycar.obtenerStock();
        System.out.println("El stock actual es "+ stockActual );
    }

    /**
     * 
     * @param mycar 
     * 
     */
    public static void compra_car(Coche mycar) {
        try
        {
            System.out.println("Compra de Coches");
            mycar.comprar(500);
        } catch (Exception e)
        {
            System.out.print("Fallo al ingresar " + e);
        }
    }

    
    /**
     * 
     * @return Coche
     */
    public static Coche vende_car() {
        Coche mycar;
        mycar = new Coche("Opel",12000,500);
        try
        {
            System.out.println("Venta de Coches");
            mycar.vender(300, 100);
        } catch (Exception e)
        {
            System.out.print("Fallo al vender " + e);
        }
        return mycar;
    }

}