package ShoppingMenu;

public final class wine {
    private final String name ="vino";
    private final String description ="Vino tinto dulce";
    private final double price =101;
    private int stock=12;

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
