import java.util.ArrayList;

public abstract class Pizza implements Food{
    String name;
    ArrayList<Ingredient> listOfIng;

    public Pizza(){}

    public Pizza(String name){
        this.name = name;
        this.listOfIng = new ArrayList<>();
    }

    public void addIng(Ingredient ing){
        this.listOfIng.add(ing);
    }

    @Override
    public double getPrice(){
        double sum = 0;
        for (Ingredient i : this.listOfIng)
        {
            sum = sum + i.getPrice();
        }
        return sum;
    }

    @Override
    public String getName(){
        return this.name;
    }

    @Override
    public String toString(){
        return "Pizza("+this.name+"\' "+this.getPrice()+")";
    }
}
