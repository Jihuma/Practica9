import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        int num, c = 1, ingrediente = 1, i, comida;
        int[] robot = new int[25];
        int[] accion = new int[25];
        boolean f = true, bat, comidaCompletada = true;
        boolean[] exito = new boolean[25];

        Robot [] robotArray = new Robot [5];
        robotArray[0] = new Chef("Magnum Opus",100);
        robotArray[1] = new Mini("Mini robot 1",100);
        robotArray[2] = new Mini("Mini robot 2",100);
        robotArray[3] = new Mini("Mini robot 3",100);
        robotArray[4] = new Mini("Mini robot 4",100);
        Scanner sc= new Scanner(System.in);

        System.out.println();
        bat = ((Chef) robotArray[0] ).batteryFull();
        ((Chef) robotArray[0] ).checkBattery(bat);
        bat = ((Mini) robotArray[1] ).batteryFull();
        ((Mini) robotArray[1] ).checkBattery(bat);
        bat = ((Mini) robotArray[2] ).batteryFull();
        ((Mini) robotArray[2] ).checkBattery(bat);
        bat = ((Mini) robotArray[3] ).batteryFull();
        ((Mini) robotArray[3] ).checkBattery(bat);
        bat = ((Mini) robotArray[4] ).batteryFull();
        ((Mini) robotArray[4] ).checkBattery(bat);

        System.out.print("""
                    Menu
                    1. Desayuno
                    2. Comida
                    3. Cena
                    Ingresa un numero: """);
        comida = sc.nextInt();

        do{
            if(comida == 1) {
                System.out.print("Elegiste desayuno\n");
                if(comida == 2)
                    System.out.print("Elegiste comida\n");
                if(comida == 3)
                    System.out.print("Elegiste cena\n");
            }


            System.out.print(
                    "\nAccion: "+ c +
                            "\nElija el robot que desea usar:"+
                            "\n1. Magnum Opus"+
                            "\n2. Mini Robot 1 (2 Cuchillos)"+
                            "\n3. Mini Robot 2 (Solo desayunos)"+
                            "\n4. Mini Robot 3 (Solo comidas)"+
                            "\n5. Mini Robot 4 (Solo cenas)"+
                            "\n\nIngresa numero: ");
            robot[c-1] = sc.nextInt();


            System.out.print("\nAccion a realizar con el robot:"+
                    "\n1. Preparar ingrediente: "+
                    "\n2. Cocinar ingredientes:" +
                    "\n3. Servir"+
                    "\n\nIngresa numero: ");
            accion[c-1] = sc.nextInt();
            num = accion[c-1];

            switch(num){
                case 1: if(robot[c-1]==1){ exito[c-1]=robotArray[robot[c-1]-1].preparar(ingrediente,robot[c-1]);
                    ingrediente++;
                }
                else{
                    if(robot[c-1]==2 || robot[c-1]==3){ exito[c-1]=robotArray[robot[c-1]-1].preparar(ingrediente,robot[c-1]);
                        if(exito[c - 1]) ingrediente++;
                    }
                    else {System.out.println("Robot no existente"); c--;}
                }
                    break;
                case 2:if(robot[c-1]==1) exito[c-1]=robotArray[robot[c-1]-1].cocinar(robot[c-1]);
                else{
                    if(robot[c-1]==2 || robot[c-1]==3) exito[c-1]=robotArray[robot[c-1]-1].cocinar(robot[c-1]);
                    else{ System.out.println("Robot no existente"); c--; }
                }
                    break;
                case 3:	if(robot[c-1]==1){ exito[c-1]=robotArray[robot[c-1]-1].servir(robot[c-1]);
                    f=false;
                }
                else{
                    if(robot[c-1]==2 || robot[c-1]==3){ exito[c-1]=robotArray[robot[c-1]-1].servir(robot[c-1]);
                        f=false;
                    }
                    else {System.out.println("Robot no existente"); c--;}
                }
                    break;
                default: System.out.println("\n--Ingresa una de las opciones--\n");
                    c--;
            }
            c++;
        }while(f);

        System.out.println("");
        for(i=0;i<c-1;i++) {Acciones.ordenAcciones(robot[i],accion[i],exito[i],i);
            if(i>0){
                comidaCompletada=exito[i];
                if(comidaCompletada){
                    if(accion[i]<accion[i-1]) comidaCompletada=false;
                }
            }
        }

        if(comidaCompletada) System.out.println("\n ¡Hurra! El plato estaba delicioso.");
        else System.out.println("\n ¡Una disculpa! Al parecer hubo fallas técnicas en la cocina" +
                "\nSe debe (1)preparar ingredientes -> (2) cocinar -> (3) servir");

    }
}