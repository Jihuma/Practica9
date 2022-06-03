class Mini extends Robot implements Battery{

    public Mini(String name, int battery){
        super(name,battery);
    }

    public boolean preparar(int ingrediente,int r){
        if(r==2){
            System.out.println("Se prepraro con exito el ingrediente.");
            return true;
        }
        else{
            System.out.println("Robot "+ r +" no es  capaz de preparar el ingrediente.");
            return false;
        }
    }

    public boolean cocinar(int r){
        if(r==3){
            System.out.println("Se cocino con exito.");
            return true;
        }
        else{
            System.out.println("Robot "+ r +" no es capaz de cocinar.");
            return false;
        }
    }

    public boolean servir(int r){
        System.out.println("Robot " + r +" no capaz de servir la comida.");
        return false;
    }

    public boolean batteryFull(){
        if(battery>0)
            return true;
        else
            return false;
    }

    public void checkBattery(boolean bat){
        if(bat) System.out.println(name +" tiene bateria con "+ battery + "% de carga, esta listo para usarse.");
        else System.out.println(name +" no tiene bateria con carga sufiente para usarse.");
    }
}