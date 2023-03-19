package Products.Shirts;

public class RedShirt extends Shirt{

    @Override
    public float price(){
        return 17.5f;
    }
    @Override
    public String name(){
        return "Red shirt";
    }
    @Override
    public String firm(){
        return "Active sports";
    }
}
