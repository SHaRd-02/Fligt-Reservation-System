
package com.mycompany.projecto_final_definitivo;


public class opr extends DATA {
    
    int OP(String a,String b,String c,String d){
        int cont = 0;
        
        if(a.equals("si") || a.equals("Si")){
            cont += 1;
        }
        if(b.equals("si") || b.equals("Si")){
            cont += 1;
        }
        if(c.equals("si") || c.equals("Si")){
            cont += 1;
        }
        if(d.equals("si") || d.equals("Si")){
            cont += 1;
        }
        return cont;
    }
    
}
