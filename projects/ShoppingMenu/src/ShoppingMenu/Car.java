package ShoppingMenu;
import java.util.ArrayList;

public final class Car {
    private static final ArrayList<Product> products = new ArrayList<>();
//being final meas I cannot point to a diff memory slot with products, yet I can add remove or modify its content

    public static void addToCar(Product product){
        products.add(product);
    }

    public static void removeFromCar(int index,int qtty){
        inCar();
        System.out.println("");
        if(products.get(index).getAmountInCar() > qtty ){
            products.get(index).setAmountInCar(qtty);
        }else
        {
            products.remove(index);
        }
        inCar();
    }

    public static void cleanCar(){
        products.clear();
    }

    public static void inCar(){
        System.out.println("Productos en el carrito:\n");
        products.forEach(product -> {
            System.out.print(product.getName());
            System.out.print(" cantidad "+product.getAmountInCar()+"\n");
        });
        //using lambda expression even though no lambdas have benn declared

        //products.forEach(System.out::println); // this form calls directly toString method in each product
    }
}
