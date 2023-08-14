
package proyectos.challenge_backendalura;

import java.util.HashMap;
import javax.swing.JOptionPane;

public class Opciones_Moneda {
    Moneda monedas = new Moneda();
    	
    public void ConvertirMonedas(double Valor) {
        
        HashMap<String, Double> Tasa = new HashMap<>();
        Tasa.put("euro", 0.91);
        Tasa.put("libras esterlinas", 0.79);
        Tasa.put("yen japones", 144.93);
        Tasa.put("won surcoreano", 1332.81);
        
    	String UserOpcion = (JOptionPane.showInputDialog(null, 
    			"Elije la moneda a la que deseas convertir tu dinero ", "Monedas", 
    			JOptionPane.PLAIN_MESSAGE, null, new Object[] 
    			{"De Dólar a Euro", "De Dólar a Libras","De Dólar a Yen","De Dólar a Won Coreano","De Euro a Dólar", "De Libras a Dólar","De Yen a Dólar","De Won Coreano a Dólar"}, 
    			"Seleccion")).toString();
        switch(UserOpcion) {
            case "De Dólar a Euro" -> monedas.Dolar_a_Euros(Valor,Tasa.get("euro"));
            case "De Dólar a Libras" -> monedas.Dolar_a_Libra(Valor,Tasa.get("libras esterlinas"));
            case "De Dólar a Yen" -> monedas.Dolar_a_Yen(Valor,Tasa.get("yen japones"));
            case "De Dólar a Won Coreano" -> monedas.Dolar_a_Won(Valor,Tasa.get("won surcoreano"));
            case "De Euro a Dólar" -> monedas.Euro_A_Dolar(Valor,Tasa.get("euro"));
            case "De Libras a Dólar" -> monedas.Libra_A_Dolar(Valor,Tasa.get("libras esterlinas"));
            case "De Yen a Dólar" -> monedas.Yen_A_Dolar(Valor,Tasa.get("yen japones"));
            case "De Won Coreano a Dólar" -> monedas.Won_A_Dolar(Valor,Tasa.get("won surcoreano"));
        }      
    }   
}
