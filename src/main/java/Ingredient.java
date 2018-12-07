public class Ingredient implements Food{
    private String name;
    private float price;

    public Ingredient(String name,float price){
        this.name = name;
        this.price = price;
    }

    @Override
    public float getPrice(){
        return this.price;
    }

    @Override
    public String getName(){
        return this.name;
    }

    public void setPrice(float p){
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
