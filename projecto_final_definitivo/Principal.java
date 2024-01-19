
package com.mycompany.projecto_final_definitivo;
import java.util.*;
import javax.swing.*;
import java.security.*; 

public class Principal {

   
    public static void main(String[] args) {
       MENU();
    }
    private static void MENU(){
         Scanner sc = new Scanner (System.in);
        int op;
        
        do{
            String option = JOptionPane.showInputDialog(null, ""
                    + "**************BIENVENIDO*****************\n"
                    + "Selecciona una de las siguientes opciones\n"
                    + "1. Reservaciones de Vuelo\n"
                    + "2. Dibujo especial\n"
                    + "3.Informacion\n"
                    + "4. Salir\n"
                    + "5. Sorprendeme");
            op = Integer.parseInt(option);
            
            switch (op){
                case 1:
                    Reservaciones();
                    break;
                case 2:
                    dibujito();
                    break;
                case 3:
                    String opcase3 = JOptionPane.showInputDialog(null, "Programa hecho por:\n"
                            + "Ricardo Hernandez Saldaña\n"
                            + "Samuel Alberto Ruelas Garcia\n"
                            + "Desea volver al menu principal?(si/no)");
                    if ("no".equals(opcase3)){
                        JOptionPane.showMessageDialog(null, "Saliendo...");
                        System.exit(0);
                    }
                    break;
                case 4:
                    op=4;
                    JOptionPane.showMessageDialog(null, "Saliendo..."); 
                    break;
                case 5:
                    sorpresa();
                    break;
            }
        }while (op!=4);
        System.exit (0);
    }
    private static void Reservaciones(){   
        JOptionPane.showMessageDialog(null, ".:CATÁLOGO DE VUELOS:.\n"
                + "|  DESTINO  |  COSTO POR PERSONA  |  TIPO DE AVIÓN  |\n"
                + "|    Orlando   |              $10,000.00              |          Chico           |\n"
                + "| Los Cabos |              $4,000.00                |        Mediano         |\n"
                + "|     Japón     |              $15,000.00              |          Grande         |");
        String destino = JOptionPane.showInputDialog(null, "Digite el destino al cual desea viajar: ");
        
        switch (destino) {
            case "Orlando":
            case "orlando":
                orlando();
                break;
            case "Los Cabos":
            case "Los cabos":
            case "los Cabos":
            case "los cabos":
                los_cabos();
                break;
            case "Japón":
            case "Japon":
            case "japón":
            case "japon":
                japon();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Digite un destino válido.\n"
                        + "Redireccionando...");
                break;
        }
        String reset = JOptionPane.showInputDialog(null, "¿Desea volver al menú principal?");
        if(reset.equals("No") || reset.equals("no")){
            System.exit (0);
        }
    }
    
    private static void orlando(){
        int[][] Ac = new int[4][6];
        int fi,co,col,fil,TP = 0,contA = 0;
        String Res;
        
        for(int f = 0; f < 4; f++){ //Rellenado por defecto de los asientos
                    for(int c = 0; c < 6; c++){
                        Ac[f][c] = 0;
                    }
                }
                for(int i = 0; i < 4; i++){ //Randomizando los asientos ocupados del avión (4)
                    SecureRandom Rand = new SecureRandom();
                  
                    fi = Rand.nextInt(3+1);
                    System.out.println(fi);
                    co = Rand.nextInt(5+1);
                    System.out.println(co);
        
                    Ac[fi][co] = 1;
                }
                
                JOptionPane.showMessageDialog(null, ".:Asientos disponibles:.\n"
                        + "Ocupado = 1\n"
                        + "Disponible = 0\n"
                        + "| " + Ac[0][0] + " | " + Ac[0][1] + " | " + Ac[0][2] + " | " + Ac[0][3] + " | " + Ac[0][4] + " | " + Ac[0][5] + " |\n"
                        + "| " + Ac[1][0] + " | " + Ac[1][1] + " | " + Ac[1][2] + " | " + Ac[1][3] + " | " + Ac[1][4] + " | " + Ac[1][5] + " |\n"
                        + "| " + Ac[2][0] + " | " + Ac[2][1] + " | " + Ac[2][2] + " | " + Ac[2][3] + " | " + Ac[2][4] + " | " + Ac[2][5] + " |\n"
                        + "| " + Ac[3][0] + " | " + Ac[3][1] + " | " + Ac[3][2] + " | " + Ac[3][3] + " | " + Ac[3][4] + " | " + Ac[3][5] + " |\n");
                
                do{
                    String fila = JOptionPane.showInputDialog(null, "Digite la fila en la que desea reservar su asiento: \n"
                        + "| " + Ac[0][0] + " | " + Ac[0][1] + " | " + Ac[0][2] + " | " + Ac[0][3] + " | " + Ac[0][4] + " | " + Ac[0][5] + " |\n"
                        + "| " + Ac[1][0] + " | " + Ac[1][1] + " | " + Ac[1][2] + " | " + Ac[1][3] + " | " + Ac[1][4] + " | " + Ac[1][5] + " |\n"
                        + "| " + Ac[2][0] + " | " + Ac[2][1] + " | " + Ac[2][2] + " | " + Ac[2][3] + " | " + Ac[2][4] + " | " + Ac[2][5] + " |\n"
                        + "| " + Ac[3][0] + " | " + Ac[3][1] + " | " + Ac[3][2] + " | " + Ac[3][3] + " | " + Ac[3][4] + " | " + Ac[3][5] + " |\n");
                    String columna = JOptionPane.showInputDialog(null, "Digite la columna en la que desea reservar su asiento: \n"
                        + "| " + Ac[0][0] + " | " + Ac[0][1] + " | " + Ac[0][2] + " | " + Ac[0][3] + " | " + Ac[0][4] + " | " + Ac[0][5] + " |\n"
                        + "| " + Ac[1][0] + " | " + Ac[1][1] + " | " + Ac[1][2] + " | " + Ac[1][3] + " | " + Ac[1][4] + " | " + Ac[1][5] + " |\n"
                        + "| " + Ac[2][0] + " | " + Ac[2][1] + " | " + Ac[2][2] + " | " + Ac[2][3] + " | " + Ac[2][4] + " | " + Ac[2][5] + " |\n"
                        + "| " + Ac[3][0] + " | " + Ac[3][1] + " | " + Ac[3][2] + " | " + Ac[3][3] + " | " + Ac[3][4] + " | " + Ac[3][5] + " |\n");
                    fil = Integer.parseInt(fila);
                    col = Integer.parseInt(columna);
                    
                    if(Ac[fil][col] == 1){
                        JOptionPane.showMessageDialog(null, "El asiento ya se encuentra ocupado. \n"
                                + "Por favor, seleccione otro...");
                    }else{
                        JOptionPane.showMessageDialog(null, "Asiento apartado con éxito.");
                        contA++;
                        Ac[fil][col] = 1;
                        if(fil == 0 || fil == 3){
                            TP += 10200;
                        }else{
                            TP += 10100;
                        }
                    }
                
                    Res = JOptionPane.showInputDialog(null, "¿Desea comprar más asientos?");
                    
                }while(Res.equals("Si") || Res.equals("si"));
                
                JOptionPane.showMessageDialog(null, contA + " asientos han sido comprados con éxito.\n"
                        + "Usted pagará MXN $" + TP + ".00");
    }
    
    private static void los_cabos(){
        int[][] Am = new int[5][5];
        int fi,co,col,fil,contA = 0,TP = 0;
        String Res;
        
        for(int f = 0; f < 5; f++){ //Rellenado por defecto de los asientos
                    for(int c = 0; c < 5; c++){
                        Am[f][c] = 0;
                    }
                }
                for(int i = 0; i < 5; i++){ //Randomizando los asientos ocupados del avión (4)
                    SecureRandom Rand = new SecureRandom();
        
                    fi = Rand.nextInt(4+1);
                    System.out.println(fi);
                    co = Rand.nextInt(4+1);
                    System.out.println(co);
        
                    Am[fi][co] = 1;
                }
                
                JOptionPane.showMessageDialog(null, ".:Asientos disponibles:.\n"
                        + "Ocupado = 1\n"
                        + "Disponible = 0\n"
                        + "| " + Am[0][0] + " | " + Am[0][1] + " | " + Am[0][2] + " | " + Am[0][3] + " | " + Am[0][4] + " |\n"
                        + "| " + Am[1][0] + " | " + Am[1][1] + " | " + Am[1][2] + " | " + Am[1][3] + " | " + Am[1][4] + " |\n"
                        + "| " + Am[2][0] + " | " + Am[2][1] + " | " + Am[2][2] + " | " + Am[2][3] + " | " + Am[2][4] + " |\n"
                        + "| " + Am[3][0] + " | " + Am[3][1] + " | " + Am[3][2] + " | " + Am[3][3] + " | " + Am[3][4] + " |\n"
                        + "| " + Am[4][0] + " | " + Am[4][1] + " | " + Am[4][2] + " | " + Am[4][3] + " | " + Am[4][4] + " |\n");
                do{
                    String fila = JOptionPane.showInputDialog(null, "Digite la fila en la que desea reservar su asiento: \n"
                        + "| " + Am[0][0] + " | " + Am[0][1] + " | " + Am[0][2] + " | " + Am[0][3] + " | " + Am[0][4] + " |\n"
                        + "| " + Am[1][0] + " | " + Am[1][1] + " | " + Am[1][2] + " | " + Am[1][3] + " | " + Am[1][4] + " |\n"
                        + "| " + Am[2][0] + " | " + Am[2][1] + " | " + Am[2][2] + " | " + Am[2][3] + " | " + Am[2][4] + " |\n"
                        + "| " + Am[3][0] + " | " + Am[3][1] + " | " + Am[3][2] + " | " + Am[3][3] + " | " + Am[3][4] + " |\n"
                        + "| " + Am[4][0] + " | " + Am[4][1] + " | " + Am[4][2] + " | " + Am[4][3] + " | " + Am[4][4] + " |\n");
                    String columna = JOptionPane.showInputDialog(null, "Digite la columna en la que desea reservar su asiento: \n"
                        + "| " + Am[0][0] + " | " + Am[0][1] + " | " + Am[0][2] + " | " + Am[0][3] + " | " + Am[0][4] + " |\n"
                        + "| " + Am[1][0] + " | " + Am[1][1] + " | " + Am[1][2] + " | " + Am[1][3] + " | " + Am[1][4] + " |\n"
                        + "| " + Am[2][0] + " | " + Am[2][1] + " | " + Am[2][2] + " | " + Am[2][3] + " | " + Am[2][4] + " |\n"
                        + "| " + Am[3][0] + " | " + Am[3][1] + " | " + Am[3][2] + " | " + Am[3][3] + " | " + Am[3][4] + " |\n"
                        + "| " + Am[4][0] + " | " + Am[4][1] + " | " + Am[4][2] + " | " + Am[4][3] + " | " + Am[4][4] + " |\n");
                    fil = Integer.parseInt(fila);
                    col = Integer.parseInt(columna);
                    
                    if(Am[fil][col] == 1){
                        JOptionPane.showMessageDialog(null, "El asiento ya se encuentra ocupado. \n"
                                + "Por favor, seleccione otro...");
                    }else{
                        JOptionPane.showMessageDialog(null, "Asiento apartado con éxito.");
                        contA++;
                        Am[fil][col] = 1;
                        if(fil == 0 || fil == 3){
                            TP += 4200;
                        }else{
                            TP += 4100;
                        }
                    }
                
                    Res = JOptionPane.showInputDialog(null, "¿Desea comprar más asientos?");
                    
                }while(Res.equals("Si") || Res.equals("si"));
                
                JOptionPane.showMessageDialog(null, contA + " asientos han sido comprados con éxito.\n"
                        + "Usted pagará MXN $" + TP + ".00");
    }
    
    private static void japon(){
        int[][] Ag = new int[6][7];
        int fi,co,fil,col,contA = 0,TP = 0;
        String Res;
        
        for(int f = 0; f < 6; f++){ //Rellenado por defecto de los asientos
                    for(int c = 0; c < 7; c++){
                        Ag[f][c] = 0;
                    }
                }
                for(int i = 0; i < 10; i++){ //Randomizando los asientos ocupados del avión (4)
                    SecureRandom Rand = new SecureRandom();
        
                    fi = Rand.nextInt(5+1);
                    System.out.println(fi);
                    co = Rand.nextInt(6+1);
                    System.out.println(co);
        
                    Ag[fi][co] = 1;
                }
                
                JOptionPane.showMessageDialog(null, ".:Asientos disponibles:.\n"
                        + "Ocupado = 1\n"
                        + "Disponible = 0\n"
                        + "| " + Ag[0][0] + " | " + Ag[0][1] + " | " + Ag[0][2] + " | " + Ag[0][3] + " | " + Ag[0][4] + " | " + Ag[0][5] + " | " + Ag[0][6] + " |\n"
                        + "| " + Ag[1][0] + " | " + Ag[1][1] + " | " + Ag[1][2] + " | " + Ag[1][3] + " | " + Ag[1][4] + " | " + Ag[1][5] + " | " + Ag[1][6] + " |\n"
                        + "| " + Ag[2][0] + " | " + Ag[2][1] + " | " + Ag[2][2] + " | " + Ag[2][3] + " | " + Ag[2][4] + " | " + Ag[2][5] + " | " + Ag[2][6] + " |\n"
                        + "| " + Ag[3][0] + " | " + Ag[3][1] + " | " + Ag[3][2] + " | " + Ag[3][3] + " | " + Ag[3][4] + " | " + Ag[3][5] + " | " + Ag[3][6] + " |\n"
                        + "| " + Ag[4][0] + " | " + Ag[4][1] + " | " + Ag[4][2] + " | " + Ag[4][3] + " | " + Ag[4][4] + " | " + Ag[4][5] + " | " + Ag[4][6] + " |\n"
                        + "| " + Ag[5][0] + " | " + Ag[5][1] + " | " + Ag[5][2] + " | " + Ag[5][3] + " | " + Ag[5][4] + " | " + Ag[5][5] + " | " + Ag[5][6] + " |\n");
               do{
                    String fila = JOptionPane.showInputDialog(null, "Digite la fila en la que desea reservar su asiento: \n"
                        + "| " + Ag[0][0] + " | " + Ag[0][1] + " | " + Ag[0][2] + " | " + Ag[0][3] + " | " + Ag[0][4] + " | " + Ag[0][5] + " | " + Ag[0][6] + " |\n"
                        + "| " + Ag[1][0] + " | " + Ag[1][1] + " | " + Ag[1][2] + " | " + Ag[1][3] + " | " + Ag[1][4] + " | " + Ag[1][5] + " | " + Ag[1][6] + " |\n"
                        + "| " + Ag[2][0] + " | " + Ag[2][1] + " | " + Ag[2][2] + " | " + Ag[2][3] + " | " + Ag[2][4] + " | " + Ag[2][5] + " | " + Ag[2][6] + " |\n"
                        + "| " + Ag[3][0] + " | " + Ag[3][1] + " | " + Ag[3][2] + " | " + Ag[3][3] + " | " + Ag[3][4] + " | " + Ag[3][5] + " | " + Ag[3][6] + " |\n"
                        + "| " + Ag[4][0] + " | " + Ag[4][1] + " | " + Ag[4][2] + " | " + Ag[4][3] + " | " + Ag[4][4] + " | " + Ag[4][5] + " | " + Ag[4][6] + " |\n"
                        + "| " + Ag[5][0] + " | " + Ag[5][1] + " | " + Ag[5][2] + " | " + Ag[5][3] + " | " + Ag[5][4] + " | " + Ag[5][5] + " | " + Ag[5][6] + " |\n");
                    String columna = JOptionPane.showInputDialog(null, "Digite la columna en la que desea reservar su asiento: \n"
                        + "| " + Ag[0][0] + " | " + Ag[0][1] + " | " + Ag[0][2] + " | " + Ag[0][3] + " | " + Ag[0][4] + " | " + Ag[0][5] + " | " + Ag[0][6] + " |\n"
                        + "| " + Ag[1][0] + " | " + Ag[1][1] + " | " + Ag[1][2] + " | " + Ag[1][3] + " | " + Ag[1][4] + " | " + Ag[1][5] + " | " + Ag[1][6] + " |\n"
                        + "| " + Ag[2][0] + " | " + Ag[2][1] + " | " + Ag[2][2] + " | " + Ag[2][3] + " | " + Ag[2][4] + " | " + Ag[2][5] + " | " + Ag[2][6] + " |\n"
                        + "| " + Ag[3][0] + " | " + Ag[3][1] + " | " + Ag[3][2] + " | " + Ag[3][3] + " | " + Ag[3][4] + " | " + Ag[3][5] + " | " + Ag[3][6] + " |\n"
                        + "| " + Ag[4][0] + " | " + Ag[4][1] + " | " + Ag[4][2] + " | " + Ag[4][3] + " | " + Ag[4][4] + " | " + Ag[4][5] + " | " + Ag[4][6] + " |\n"
                        + "| " + Ag[5][0] + " | " + Ag[5][1] + " | " + Ag[5][2] + " | " + Ag[5][3] + " | " + Ag[5][4] + " | " + Ag[5][5] + " | " + Ag[5][6] + " |\n");
                    fil = Integer.parseInt(fila);
                    col = Integer.parseInt(columna);
                    
                    if(Ag[fil][col] == 1){
                        JOptionPane.showMessageDialog(null, "El asiento ya se encuentra ocupado. \n"
                                + "Por favor, seleccione otro...");
                    }else{
                        JOptionPane.showMessageDialog(null, "Asiento apartado con éxito.");
                        contA++;
                        Ag[fil][col] = 1;
                        if(fil == 0 || fil == 3){
                            TP += 15200;
                        }else{
                            TP += 15100;
                        }
                    }
                
                    Res = JOptionPane.showInputDialog(null, "¿Desea comprar más asientos?");
                    
                }while(Res.equals("Si") || Res.equals("si"));
                
                JOptionPane.showMessageDialog(null, contA + " asientos han sido comprados con éxito.\n"
                        + "Usted pagará MXN $" + TP + ".00"); 
    }
    
    private static void sorpresa(){
        int op2, n1,n2;
        String numero1, numero2;
        
        String option2 =JOptionPane.showInputDialog(null, ""
                            + "Calculadora Aritmetica basica\n"
                            + "Seleccione una opcion\n"
                            + "1. Suma\n"
                            + "2. Resta\n"
                            + "3. Multiplicacion\n"
                            + "4. Division\n"
                            + "5. Salir al menu principal\n"
                            + "6. Salir del programa\n");
                    op2 = Integer.parseInt(option2);
                    switch (op2)
                    {
                        case 1:
                            JOptionPane.showMessageDialog(null, "Suma\n"
                                    + "Ingrese dos numeros que quiera sumar");
                            numero1= JOptionPane.showInputDialog(null, "Ingrese el primer numero:");  
                            n1=Integer.parseInt(numero1);
                            numero2= JOptionPane.showInputDialog(null, "Ingrese el segundo numero:");  
                            n2=Integer.parseInt(numero2);
                            JOptionPane.showMessageDialog(null, "Resultado de la suma:\n"+sumar(n1,n2));
                            String opcase5 = JOptionPane.showInputDialog(null, ""
                                    + "Desea volver al menu principal?(si/no)");
                            if ("no".equals(opcase5))
                            {
                                JOptionPane.showMessageDialog(null, "Saliendo...");
                                System.exit(0);
                        
                            }
                            break;
                        case 2:
                            JOptionPane.showMessageDialog(null, "Resta\n"
                                    + "Ingrese dos numeros que quiera restar");
                            numero1= JOptionPane.showInputDialog(null, "Ingrese el primer numero:");  
                            n1=Integer.parseInt(numero1);
                            numero2= JOptionPane.showInputDialog(null, "Ingrese el segundo numero:");  
                            n2=Integer.parseInt(numero2);
                            JOptionPane.showMessageDialog(null, "Resultado de la resta:\n"+restar(n1,n2));
                            opcase5 = JOptionPane.showInputDialog(null, ""
                                    + "Desea volver al menu principal?(si/no)");
                            if ("no".equals(opcase5))
                            {
                                JOptionPane.showMessageDialog(null, "Saliendo...");
                                System.exit(0);
                        
                            }
                            break;
                        case 3: 
                            JOptionPane.showMessageDialog(null, "Multiplicacion\n"
                                    + "Ingrese dos numeros que quiera multiplicar");
                            numero1= JOptionPane.showInputDialog(null, "Ingrese el primer numero:");  
                            n1=Integer.parseInt(numero1);
                            numero2= JOptionPane.showInputDialog(null, "Ingrese el segundo numero:");  
                            n2=Integer.parseInt(numero2);
                            JOptionPane.showMessageDialog(null, "Resultado de la multiplicacion:\n"+multiplicar(n1,n2));
                            opcase5 = JOptionPane.showInputDialog(null, ""
                                    + "Desea volver al menu principal?(si/no)");
                            if ("no".equals(opcase5))
                            {
                                JOptionPane.showMessageDialog(null, "Saliendo...");
                                System.exit(0);
                        
                            }
                            break;
                        case 4:
                            JOptionPane.showMessageDialog(null, "Division\n"
                                    + "Ingrese dos numeros que quiera dividir");
                            numero1= JOptionPane.showInputDialog(null, "Ingrese el primer numero:");  
                            n1=Integer.parseInt(numero1);
                            numero2= JOptionPane.showInputDialog(null, "Ingrese el segundo numero:");  
                            n2=Integer.parseInt(numero2);
                            JOptionPane.showMessageDialog(null, "Resultado de la division:\n"+dividir(n1,n2));
                            opcase5 = JOptionPane.showInputDialog(null, ""
                                    + "Desea volver al menu principal?(si/no)");
                            if ("no".equals(opcase5))
                            {
                                JOptionPane.showMessageDialog(null, "Saliendo...");
                                System.exit(0);
                        
                            }
                            break;
                        case 5:
                            break;
                        case 6:
                            JOptionPane.showMessageDialog(null, "Saliendo...");
                            System.exit(0);
                            break;
                           
                    }
    }
    
    public static int sumar (int n1,int n2){
        int resultado;
        resultado = n1+n2;
        return resultado;
    }  
    public static int restar (int n1,int n2){
        int resultado;
        resultado = n1-n2;
        return resultado;   
    }
    public static int multiplicar (int n1,int n2){
        int resultado;
        resultado = n1*n2;
        return resultado;
    }
    public static int dividir (int n1,int n2){
        int resultado;
        resultado = n1/n2;
        return resultado;
    }
    
    public static void dibujito(){
        opr O1 = new opr();
        int counter;
        
        O1.pr1 = JOptionPane.showInputDialog(null, "1. ¿Estudias ingeniería?");
        O1.pr2 = JOptionPane.showInputDialog(null, "2. ¿Te gusta la tecnología?");
        O1.pr3 = JOptionPane.showInputDialog(null, "3. ¿Pasaste todas tus materias?");
        O1.pr4 = JOptionPane.showInputDialog(null, "4. ¿Tienes iniciativa propia?");
        
        counter = O1.OP(O1.pr1,O1.pr2,O1.pr3,O1.pr4);
        
        switch (counter) {
            case 4:
                JOptionPane.showMessageDialog(null, "¡¡Felicidades, eres SUPER!!");
                break;
            case 3:
                JOptionPane.showMessageDialog(null, "Desplegando matriz en consola...");
                MTRX();
                break;
            default:
                JOptionPane.showMessageDialog(null, "Vuelva a intentarlo...");
                break;
        }
    }
    
    public static void MTRX(){
        String blanc = " ";
        String[][] mtx = new String[5][5];
        
        for(int f = 0; f < 5; f++){
            for(int c = 0; c < 5; c++){
                if((f == 0 || f == 1) && (c == 0 || c == 2 || c == 4)){
                    mtx[f][c] = blanc;
                }
                if(f == 0 && c == 1 || c == 3){
                    mtx[f][c] = "^";
                }
                if(f == 1 && (c == 1 || c == 3)){
                    mtx[f][c] = "X";
                }
                if(f == 2 && c != 2){
                    mtx[f][c] = blanc;
                }
                if(f == 3 || (f == 2 && c == 2)){
                    mtx[f][c] = "X";
                }
                if(f == 4){
                    mtx[f][c] = blanc;
                }
            }
        }
        
        for(int f = 0; f < 5; f++){
            for(int c = 0; c < 5; c++){
                System.out.print(mtx[f][c]);
            }
            System.out.println("");
        }
    }
    
}
