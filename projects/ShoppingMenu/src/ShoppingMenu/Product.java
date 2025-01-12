package ShoppingMenu;

public abstract class Product {
// abstract 'cause it does not represent a real object itself but a concept with properties and functionalities from several real objects
    private final String name;
    private final String description;
    private final double price;
    private int stock;
    private int amountInCar=0;

    public Product (String name, String description, double price, int stock, int amountInCar){
        this.name=name;
        this.description=description;
        this.price=price;
        this.stock=stock;
        this.amountInCar=amountInCar;
    }
    @Override
    public String toString() {
        return "\nProducto: "+ name+
                "\nDescripcion: "+ description+
                "\nPrecio: "+ price+
                "\nCantidad disponible: "+ stock;
    }
    public void setStock(){
        if (stock>0){
            stock-=amountInCar;
        }else{
            System.out.println();
        }
    }
    public void removeFromCar(int removed){
        amountInCar-=removed;
    }
    public void addToCAr(int added){
        amountInCar+=added;
    }
    public String getName(){return name;}
    public int getAmountInCar(){return amountInCar;}
}
