public class PizzaHutFactory extends PizzaFactory {
    int stocks[];
    private static DominoPizzaFactory theFactory = null;

    private PizzaHutFactory(){
        stocks = new int[4];

    }

    @Override
    public Pizza createPizza(String name)
    {
        switch(name)
        {
            case ("Margherita"): return new MargheritaHut();
            default: return null;
        }
    }
}
