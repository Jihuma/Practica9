abstract class Robot{
    String name;
    int battery;

    public Robot(String name, int battery){
        this.name = name;
        this.battery = battery;
    }

    public abstract boolean preparar(int ing,int r);

    public abstract boolean cocinar(int r);

    public abstract boolean servir(int r);
}

