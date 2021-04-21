/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trimestresdelaño60326;

import java.util.Scanner;

/**
 *
 * @author Jun
 */
public class TrimestresDelAño60326 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
        int MesDelAño;
        String Mes = null;
        String Trimestre = null;
        Scanner MesEscaneado = new Scanner (System.in);
        System.out.println("Introduzca un mes del 1 al 12 para saber en que trimestre se encuentra");
        MesDelAño = MesEscaneado.nextInt();
        
        if (MesDelAño > 0 && MesDelAño <= 12){
        switch (MesDelAño){
            case 1:
                Mes = "Enero";
                Trimestre = "Primer Trimestre";
                break;
            case 2:
                Mes = "Febrero";
                Trimestre = "Primer Trimestre";
                break;
            case 3:
                Mes = "Marzo";
                Trimestre = "Primer Trimestre";
                break;
            case 4:
                Mes = "Abril";
                Trimestre = "Segundo Trimestre";
                break;
            case 5:
                Mes = "Mayo";
                Trimestre = "Segundo Trimestre";
                break;
            case 6:
                Mes = "Junio";
                Trimestre = "Segundo Trimestre";
                break;
            case 7:
                Mes = "Julio";
                Trimestre = "Tercer Trimestre";
                break;
            case 8:
                Mes = "Agosto";
                Trimestre = "Tercer Trimestre";
                break;
            case 9:
                Mes = "Septiembre";
                Trimestre = "Tercer Trimestre";
                break;
            case 10:
                Mes = "Octubre";
                Trimestre = "Cuarto Trimestre";
                break;
            case 11:
                Mes = "Noviembre";
                Trimestre = "Cuarto Trimestre";
                break;
            case 12:
                Mes = "Diciembre";
                Trimestre = "Cuarto Trimestre";
                break;
            default:
                break;            
        }
        System.out.println("El mes seleccionado: " + Mes + ", está en el " + Trimestre);
        } else {
        System.out.println("Verifique que el numero sea entre 1 a 12");           
        }
    }    
    
}
