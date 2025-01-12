package ShoppingMenu;
import java.util.ArrayList;
import java.util.Scanner;

public final class Car {
    //being final meas I cannot point to a diff memory slot with products, yet I can add remove or modify its content
    private static final ArrayList<Product> products = new ArrayList<>();
    private static Scanner scanner =new Scanner(System.in);
    private static int input =0;

    public static void inCar() {
        System.out.println("Productos en el carrito:\n");
        for (int i = 1; i <= products.size(); i++) {
            Product product = products.get(i-1);
            System.out.print(i + ". " + product.getName());
            System.out.print(" Cantidad: " + product.getAmountInCar() + "\n");
        }
        System.out.println(products.size()+1+". Empty Car");
        input = scanner.nextInt();
        if (input ==products.size()){
            cleanCar();
        }else {
            manageItems(products.get(input-1));
            inCar();
        }
    }

    public static void manageItems(Product product){
            System.out.println("""
                    Opciones:
                    1. Aumentar cantidad
                    2. Disminuit cantidad
                    3. Eliminar del carrito
                    """);
            int selection=scanner.nextInt();
            switch (selection){
                case 1:
                    System.out.println("Cantidad a añadir: ");
                    product.addToCAr(scanner.nextInt());
                    break;
                case 2:
                    System.out.println("Cantidad a eliminar: ");
                    product.removeFromCar(scanner.nextInt());
                    break;
                case 3:
                    product.removeFromCar(product.getAmountInCar());
                    break;
                default: break;
            }
        }

    public static void addToCar(Product product){
        products.add(product);
    }

    public static void cleanCar(){
        products.clear();
    }

}
