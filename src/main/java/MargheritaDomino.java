public class MargheritaDomino extends Pizza {
    public MargheritaDomino(){
        super("Margherita");
        addIng(new Pate());
        addIng(new SauceTomate());
        addIng(new Fromage());
    }
}
