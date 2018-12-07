import java.util.ArrayList;

public class CarbonaraDomino extends Pizza {
    public CarbonaraDomino()
    {
        super("Carbonara");
        addIng(new Pate());
        addIng(new CremeBlanche());
        addIng(new Fromage());
        addIng(new Jambon());
    }
}
