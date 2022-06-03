class Chef extends Robot implements Battery{

    public Chef(String name, int battery){
        super(name,battery);
    }

    public boolean preparar(int ingrediente,int r){
        System.out.println("Se preparo con exito el ingrediente: "+ ingrediente);
        return true;
    }

    public boolean cocinar(int r){
        System.out.println("Se cocino con exito.");
        return true;
    }

    public boolean servir(int r){
        System.out.println("Se sirvio con exito la comida.");
        return true;
    }

    public boolean batteryFull(){
        if(battery>0) return true;
        else return false;
    }

    public void checkBattery(boolean bat){
        if(bat) System.out.println(name +" tiene "+ battery + "% de carga, esta listo para usarse.");
        else System.out.println(name +" tiene bateria con carga suficiente para usarse");
    }
}