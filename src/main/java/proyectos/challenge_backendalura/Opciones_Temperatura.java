
package proyectos.challenge_backendalura;

import javax.swing.JOptionPane;

public class Opciones_Temperatura {
        Temperatura temperatura = new Temperatura();
	
    public void ConvertirTemperatura(double Minput) {
        String opcion = (JOptionPane.showInputDialog(null, "Elije una opción para convertir", "Temperatura", JOptionPane.PLAIN_MESSAGE, null, new Object[] {"Grados Celcius a Grados Farenheit", "Grados Celcius a Kelvin", "Grados Farenheit a Grados Celcius","Kelvin a Grados Celcius","Kelvin a Grados Farenheit"}, "Seleccion")).toString();
        switch(opcion) {
            case "Grados Celcius a Grados Farenheit" -> temperatura.ConvertirCelciusAFarenheit(Minput);
            case "Grados Celcius a Kelvin" -> temperatura.ConvertirCelciusAKelvin(Minput);
            case "Grados Farenheit a Grados Celcius" -> temperatura.ConvertirFarenheitACelcius(Minput);
            case "Kelvin a Grados Celcius" -> temperatura.ConvertirKelvinACelcius(Minput);
            case "Kelvin a Grados Farenheit" -> temperatura.ConvertirKelvinAFarenheit(Minput);
        }
    }
}
