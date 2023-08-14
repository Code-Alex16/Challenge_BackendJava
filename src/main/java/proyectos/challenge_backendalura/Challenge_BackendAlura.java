/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package proyectos.challenge_backendalura;

import javax.swing.JOptionPane;

/**
 *
 * @author Alexander
 */
public class Challenge_BackendAlura {

    public static void main(String[] args) {
        Opciones_Moneda monedas = new Opciones_Moneda();
        Opciones_Temperatura temperatura = new Opciones_Temperatura();
             
        Ingreso : while(true) {
        	
            String opciones = (JOptionPane.showInputDialog(null, "Seleccione una opción de conversión ", "Menu", JOptionPane.QUESTION_MESSAGE, null, new Object[] {"Conversor de Moneda", "Conversor de Temperatura","Cerrar"}, "Seleccion")).toString();
            switch(opciones) {
        	case "Conversor de Moneda" -> {
                    String dato = JOptionPane.showInputDialog("Ingresa la cantidad de dinero que deseas convertir: ");
                    if(ValidarNumero(dato) == true) {
                        double valor = Double.parseDouble(dato);
                        monedas.ConvertirMonedas(valor);
                        
                        int respuesta=JOptionPane.showConfirmDialog(null,"¿Deseas realizar otra conversión?");
                        if (JOptionPane.OK_OPTION == respuesta){
                            System.out.println("Selecciona opción Afirmativa");
                        }else{
                            JOptionPane.showMessageDialog(null, "Programa terminado");
                            break Ingreso;
                        }
                    } else {
                        break;               
                    }
                }	

        	case "Conversor de Temperatura" -> {
                    String input = JOptionPane.showInputDialog("Ingresa el valor de la temperatura que deseas convertir ");
                    if(ValidarNumero(input) == true) {
                        double Minput = Double.parseDouble(input);
                        temperatura.ConvertirTemperatura(Minput);
                        
                        int respuesta = 0;
                        respuesta = JOptionPane.showConfirmDialog(null, "¿Desea continuar?");
                        if((respuesta == 0) && (ValidarNumero(input) == true)) {
                        } else {
                            JOptionPane.showMessageDialog(null, "Programa terminado");
                            break Ingreso;
                        }
                        
                    } else {
                        break;
                    }  
                }
                
                case "Cerrar" -> {
                    break Ingreso;
                }
        }                
    }
               
  }
    public static boolean ValidarNumero(String input) {
        try {
            double x = Double.parseDouble(input);
            if(x >= 0 || x < 0);
                return true;
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Error Numeros Invalidos" +e.getMessage());
            return false;
        }
    }
}

