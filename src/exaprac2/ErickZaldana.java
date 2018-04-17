
package exaprac2;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

/**
 * Nombre de la clase: ErickZaldana
 * Version: 1.0
 * Fecha: 17-04-2018
 * CopyRight: ErickZc
 * @author ErickZc
 */
public class ErickZaldana {
    public static void main(String[] args){
        DecimalFormat df = new DecimalFormat("#,###.##");
        int cantidad;
        int j = 0;
        int cont = 0;
        int pet = 0;
        
        
        
        String acum = "";
        int aprobado = 0;
        int reprobado = 0;
        int bandera = 0;
        int alumno = 0;
        
         while(j == bandera){
             pet = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero según su peticion: \n1) Agregar Notas\n2) Calcular Promedio\n3) Salir"));
             
             if(pet == 1)
             {
   
                 alumno = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de alumnos: "));
                 
                 String[] nombre = new String[alumno];
                 double nota1[] = new double[alumno];
                 double nota2[] = new double[alumno];
                 double nota3[] = new double[alumno];
                 double promedio[] = new double[alumno];
                 int[] edad = new int[alumno];
                 String[] estado = new String[alumno];
                 
                 for(int i = 0; i< alumno; i++)
                 {
                    nombre[i] = JOptionPane.showInputDialog("Ingrese el nombre del alumno " + (i +1));
                    nota1[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota 1"));
                    nota2[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota 2" ));
                    nota3[i] = Double.parseDouble(JOptionPane.showInputDialog("Ingrese la nota 3" ));
                    edad[i] = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su edad"));
                    promedio[i] = (nota1[i] * 0.35) + (nota2[i] * 0.35) + (nota2[i] * 0.30);
                 
                    if(promedio[i] < 7)
                    {
                        estado[i] = "Reprobado";
                        reprobado++;
                    }
                    else if(promedio[i] >= 7 || promedio[i] <= 10)
                    {
                        estado[i] = "Aprobado";
                        aprobado++;
                    }
                    else{
                        estado[i] = "Hubo un error al escribir tus notas :(";
                    }
                 
                    acum = acum + "Datos del Alumno " + (i+1) + "\n\n"
                    + "Nombre: " + nombre[i]
                    + "\nNota 1: " + df.format(nota1[i])
                    + "\nNota 2: " + df.format(nota2[i])
                    + "\nNota 3: " + df.format(nota3[i])
                    + "\nPromedio Final: " + df.format(promedio[i])
                    + "\nEstado: " + estado[i] + "\n"
                    ;
                 }
                 
                 
             }
             else if(pet == 2)
             {
                 JOptionPane.showMessageDialog(null, "Datos Generales: \n"
                 + acum
                 + "\n\nDatos de estadistica: "
                 + "\nAprobados: " + aprobado
                 + "\nReprobados: " + reprobado
                 );
             }
             else if(pet == 3)
             {
                 bandera = 1;
             }
             else{
                 
             }
         }
        
    }
}
