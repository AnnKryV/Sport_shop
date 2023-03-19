import Products.FabricBuilder;
import Products.Order;

public class BuilderPattern {

    public static void main(String[] args) {

        FabricBuilder orderform = new FabricBuilder();

        Order orderA = orderform.orderAform();
        System.out.println("First order:");
        orderA.showItems();
        System.out.println("\nTotal cost: " + orderA.getCost());

        Order orderB = orderform.orderBform();
        System.out.println("\nSecond order:");
        orderB.showItems();
        System.out.println("\nTotal cost: " + orderB.getCost());

    }

}
