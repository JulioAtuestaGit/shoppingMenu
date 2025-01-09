package ShoppingMenu;

public abstract class Product {
    private final String name;
    private final String description;
    private final double price;
    private int stock;

    public Product (String name, String description, double price, int stock){
        this.name=name;
        this.description=description;
        this.price=price;
        this.stock=stock;
    }
    @Override
    public String toString() {
        return "Producto: "+ name+
                "Descripcion: "+ description+
                "Precio: "+ price+
                "Cantidad disponible: "+ stock;
    }
    public void setStock(int amount){
        if (stock>0){
            stock-=amount;
        }else{
            System.out.println();
        }
    }
}
