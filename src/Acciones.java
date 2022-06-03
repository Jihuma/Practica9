class Acciones{
    public static void ordenAcciones(int robot, int accion, boolean exito,int i){
        String name="", tarea="";
        i++;

        switch (robot) {
            case 1 -> name = "Chef";
            case 2 -> name = "Mini 2";
            case 3 -> name = "Mini 3";
        }

        switch (accion) {
            case 1 -> tarea = ": Preparar ingrediente.";
            case 2 -> tarea = ": Cocinar.";
            case 3 -> tarea = ": Servir la comida.";
        }
        System.out.println("\nAccion: "+ i +
                "\nRobot "+ name + " " + tarea);

        if(exito) System.out.println("La tarea se realizo con exito.");
        else System.out.println("--¡Error! La tarea no se pudo completar--");

    }
}