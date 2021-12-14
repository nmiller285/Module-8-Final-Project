package Classes;

public abstract class Ingredient {
    public static double marinara;
    public static double alfredo;
    public static double mozorella;
    public static double provolone;
    public static int thinCrust, deepDish;

    public abstract int setCrust(int a);

    public abstract double setSauce(int s);

    public abstract double setCheese(int c);

}
