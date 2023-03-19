package Products;

import Products.Caps.BlackCap;
import Products.Caps.WhiteCap;
import Products.Shirts.BlueShirt;
import Products.Shirts.RedShirt;

public class FabricBuilder {

    public Order orderAform() {
        Order orderAItem = new Order();
        orderAItem.addItem(new WhiteCap());
        orderAItem.addItem(new RedShirt());
        return orderAItem;
    }
    public Order orderBform() {
        Order orderBItem = new Order();
        orderBItem.addItem(new BlackCap());
        orderBItem.addItem(new BlueShirt());
        return orderBItem;
    }
}
