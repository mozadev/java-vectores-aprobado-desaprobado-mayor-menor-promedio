
package prueba10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Prueba10 {

    public static void main(String[] args) {
        int x,opc,q;
        x=Integer.parseInt(JOptionPane.showInputDialog("Digite la cantidad de estudiantes: "));
        int vec[]=new int[x];
        do{
            opc=Integer.parseInt(JOptionPane.showInputDialog("\t..:MENU:.."+
                    "\n1. Ingreso de código"+
                    "\n2. Nota mayor"+
                    "\n3. Nota menor"+
                    "\n4. Promedio de notas"+
                    "\n5. Cantidad de aprobados"+
                    "\n6. Cantidad de desaprobados"+
                    "\n7. Mostrar notas"+
                    "\n8. Finalizar"+
                    "\n\nDigite una opcion: "));
            switch(opc){
                case 1: 
                    for(int i=0;i<x;i++){
                       vec[i]=Integer.parseInt(JOptionPane.showInputDialog((i+1)+". Digite un codigo: ")); 
                    }   
                    break;
                case 2:
                    int mayor=0;
                    for(int i=0;i<x;i++){
                        if(vec[i]>mayor){
                            mayor=vec[i];
                        }
                    }
                    JOptionPane.showMessageDialog(null,"La nota mayor es: "+mayor);
                    break;
                case 3:
                    int menor=999;
                    for(int i=0;i<x;i++){
                        if(vec[i]<menor){
                            menor=vec[i];
                        }
                    }
                    JOptionPane.showMessageDialog(null,"La nota menor es: "+menor);
                    break;
                case 4:
                    int sum=0,prom=0;
                    for(int i=0;i<x;i++){
                        sum+=vec[i];
                    }
                    prom=sum/x;
                    JOptionPane.showMessageDialog(null,"El promedio es: "+prom);
                case 5:
                    int apro=0;
                    for(int i=0;i<x;i++){
                        if(vec[i]>=11){
                            apro++;
                        }
                    }
                    JOptionPane.showMessageDialog(null,"Cantidad de aprobados: "+apro);
                case 6:  
                    int desapro=0;
                    for(int i=0;i<x;i++){
                        if(vec[i]<11){
                            desapro++;
                        }
                    }
                    JOptionPane.showMessageDialog(null,"Cantidad de desaprobados: "+desapro);
                case 7:
                    String cadena="";
                    for(int i=0;i<x;i++){
                        cadena+=(i+1)+". "+vec[i]+"\n";
                    }
                    JOptionPane.showMessageDialog(null,"\tNOTAS\n"+cadena);
                    break;
                case 8:
                    JOptionPane.showMessageDialog(null,"\tGRACIAS POR USAR EL MENÚ");break;
            }
        }while(opc!=8);

    }
    
}