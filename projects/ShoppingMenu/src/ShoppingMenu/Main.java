package ShoppingMenu;

import java.util.Scanner;

public class Main {
    private double balance=0.0;
    public void main(){
        Scanner scanner =new Scanner(System.in);
        System.out.println("balance actual: ");
        balance=scanner.nextDouble(); //scanner includes methods to prevent typos exceptions in inputs

        Wine waine = new Wine(3);
        Car.addToCar(waine);
        Car.inCar();
        Car.removeFromCar(1,1);

    }
}
