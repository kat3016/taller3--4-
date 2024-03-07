package uniandes.dpoo.aerolinea.modelo.cliente;

import java.util.List;

import java.util.HashMap;
import java.util.Map;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;
import uniandes.dpoo.aerolinea.modelo.tarifas.CalculadoraTarifas;

public abstract class Cliente {

	public List<Tiquete> tiquetesUsados;
	public List<Tiquete> tiquetesSinUsar;
	
	public Cliente()
	{
		
	}
	public abstract java.lang.String getTipoCliente();
	

	public abstract java.lang.String getIdentificador();
	
	
	public void agregarTiquete​(Tiquete tiquete)
	{
		tiquetesSinUsar.add(tiquete);
	}
	public int calcularValorTotalTiquetes()
	{
	    int total = 0;

	    for (Tiquete tiquete : this.tiquetesUsados) {
	        Vuelo vuelo = tiquete.getVuelo();
	        int tarifa =CalculadoraTarifas.calcularTarifa(vuelo, this);
	        total += tarifa;
	    }

	    for (Tiquete tiquete1 : this.tiquetesSinUsar) {
	        Vuelo vuelo = tiquete1.getVuelo();
	        int tarifa = CalculadoraTarifas.calcularTarifa(vuelo, this) ;
	        total += tarifa;
	    }

	    return total;
	}	
	
	
	
	public void  usarTiquetes(Vuelo vuelo)
	{ 
		Map<String, Tiquete> mapaTiquetes = vuelo.getTiquetes();
        for (Tiquete tiquete : mapaTiquetes.values()) {
            if (tiquete.getCliente().equals(this))
            {
                tiquete.marcarComoUsado();
                tiquetesSinUsar.remove(tiquete);
                tiquetesUsados.add(tiquete);
            }
        }
    }
	


}



