/* Hacer un programa que calcule e imprima el salario semanal de un empleado 
 * a partir de sus horas semanales trabajadas y de su salario por hora
 */
package salario_semanal;

import java.util.Scanner;
        
public class Salario_semanal {

    public static void main(String[] args) {
        Scanner entrada =  new Scanner (System.in);
        // variable: salario_por_hora
        // variable: horas_semanales
        // suma1: horas_por_día
        // suma2: suma_de_dias
        // impresión: resultado
        
        int salario_por_hora, horas_trabajadas, multi;
        
        // guardamos las 2 sumas
        System.out.println("Digite salario por hora: ");
        salario_por_hora = entrada.nextInt();
        
        System.out.println("Digite horas trabajadas: ");
        horas_trabajadas= entrada.nextInt(); 
        
        multi= salario_por_hora * horas_trabajadas; 
        
        System.out.println("El salario semanal es: "+multi);
    }
    
}
