package ShoppingMenu;

public final class cofi {
    private final String name ="Cafe";
    private final String description ="Cafe molido suave";
    private final double price =38.50;
    private int stock=10;

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
