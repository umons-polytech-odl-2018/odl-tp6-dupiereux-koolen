public class ProsciuttoDomino extends Pizza {
    public ProsciuttoDomino(){
        super("Prosciutto");
        addIng(new Pate());
        addIng(new SauceTomate());
        addIng(new Fromage());
        addIng(new Jambon());
    }
}
