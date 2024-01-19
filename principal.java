
package com.mycompany.examen_parcial_3;
import java.util.*;

public class principal {

  
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int n,op=0,alumnum=1,calinum=1,alumnum2=1, aprobado=0,reprobado=0;
        String op2;
        double promedio=0,c1,c2,c3;
        System.out.println("Cuantos alumnos son?");
        n = sc.nextInt();
        String nombres []= new String [n];
        String apellidos []= new String [n];
        
        System.out.println("Ingrese los nombres:");
        
        
            for (int i=0;i<n;i++)
            {
                System.out.println("Ingrese el nombre del almuno "+alumnum);
                nombres[i]= sc.next();
                alumnum++;
                if (alumnum >n)
                {
                    alumnum=1;
                }
            }
        System.out.println("Ingrese los apellidos:");
        
            for (int i=0;i<n;i++)
            {
                System.out.println("Ingrese el apellido del almuno "+alumnum);
                apellidos[i]= sc.next();
               
                
                alumnum++;
                if (alumnum >n)
                {
                    alumnum=1;
                }
            }
            
        System.out.println("Ingrese las calificaciones en escala del 1-10");
        double calificaciones []=new double [n];
        
        for (int i=0;i<n;i++)
        {

                System.out.println("Ingrese la calificacion 1 de "+nombres[i]+" "+apellidos[i]);
                c1 = sc.nextDouble();
                System.out.println("Ingrese la calificacion 2 de "+nombres[i]+" "+apellidos[i]);
                c2 = sc.nextDouble();
                System.out.println("Ingrese la calificacion 3 de "+nombres[i]+" "+apellidos[i]);
                c3 = sc.nextDouble();
                promedio = (c1+c2+c3)/3;
                calificaciones [i] = promedio;
                if (promedio <6)
                {
                    reprobado=reprobado+1;
                }
                else if(promedio >=6)
                {
                    aprobado++;
                }
                promedio =0;
                

        }
        
            do
            {
            System.out.println("1. Despleagar reporte");
            System.out.println("2. Desplegar totales");
            System.out.println("3. Informacion");
            System.out.println("4. Salir");
            System.out.println("Seleccion su opcion (1-4)");
            op =sc.nextInt();
            
            switch (op)
                
            {
                case 1: 
                    System.out.println("Despliegue de reporte");
                    System.out.println("****Reporte de alumnos y promedios****");
                    for (int i=0;i<n;i++)
                    {
                        System.out.println((i+1)+"."+nombres[i]+" "+apellidos[i]+", Promedio: "+calificaciones[i]);
                    }
                    System.out.println("Desea regresar al menu principal?(si/no)");
                    op2=sc.next();
                    if ("no".equals(op2))
                    {
                        System.exit(0);
                    }
                    break;
                case 2:
                    System.out.println("Despliegue de totales");
                    System.out.println("************************");
                    System.out.println("Reporte final de alumnos");
                    System.out.println("************************");
                    System.out.println("Total de aprobados: "+aprobado);
                    System.out.println("Total de reprobados: "+reprobado);
                    System.out.println("Desea regresar al menu principal?(si/no)");
                    op2=sc.next();
                    if ("no".equals(op2))
                    {
                        System.exit(0);
                    }
                    break;
                case 3:
                    System.out.println("Informacion");
                    System.out.println("Programa hecho por Ricardo H.S");
                    System.out.println("Desea regresar al menu principal?(si/no)");
                    op2=sc.next();
                    if ("no".equals(op2))
                    {
                        System.exit(0);
                    }
                    break;
                case 4:
                    System.exit(0);
                    break;
            }
        } while (op!=4);
    }
    
}
