package ShoppingMenu;
import java.util.Scanner;

public class Main {
    public double balance=103.0;
    public int selection=0;
    public void main(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("balance actual: "+balance);
        while(true) {
            int qty=0;
            System.out.println("""
                    Seleccion de productos:
                    1. Cofi
                    2. wine
                    3. gum               
                    4. ver carrito
                    5. Salir
                    """
            );
            try {
                selection = scanner.nextInt();
                switch (selection) {
                    case 1:
                        System.out.println("selecciona la cantidad:");
                        qty = scanner.nextInt();
                        Cofi cofi = new Cofi(qty);
                        Car.addToCar(cofi);
                        break;
                    case 2:
                        System.out.println("selecciona la cantidad:");
                        qty = scanner.nextInt();
                        Wine wine = new Wine(qty);
                        Car.addToCar(wine);
                        break;
                    case 3:
                        System.out.println("selecciona la cantidad:");
                        qty = scanner.nextInt();
                        Gum gum = new Gum(qty);
                        Car.addToCar(gum);
                        break;
                    case 4:
                        Car.inCar();
                    case 5:
                        break;
                    default:
                        continue;
                }
            }catch(IndexOutOfBoundsException e){
                System.out.println("mala eleccion");
            }
        }
    }
}
