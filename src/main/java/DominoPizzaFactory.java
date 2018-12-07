public class DominoPizzaFactory extends PizzaFactory {
    int stocks[];
    private static DominoPizzaFactory theFactory = null;

    private DominoPizzaFactory(){
        stocks = new int[4];

    }

    @Override
    public Pizza createPizza(String name)
    {
        switch(name)
        {
            case ("Margherita"): return new MargheritaDomino();
            default: return null;
        }
    }
}
