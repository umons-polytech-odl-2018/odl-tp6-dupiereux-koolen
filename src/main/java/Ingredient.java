public class Ingredient implements Food{
    private String name;
    private double price;

    public Ingredient(){};
    public Ingredient(String name,double price){
        this.name = name;
        this.price = price;
    }

    @Override
    public double getPrice(){
        return this.price;
    }

    @Override
    public String getName(){
        return this.name;
    }

    public void setPrice(double p){
        this.price = p;
    }

    public void setName(String n){
        this.name = n;
    }
    @Override
    public String toString(){
        return "Food("+ name + "\' "+" price"+price+")";
    }

}
