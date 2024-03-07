package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Ruta;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class CalculadoraTarifasTemporadaAlta extends CalculadoraTarifas 
{
	public static final int COSTO_POR_KM=1000;
	 @Override
	    protected int calcularCostoBase(Vuelo vuelo, Cliente cliente) {
	      Ruta ruta= vuelo.getRuta();
	      int distancia= calcularDistanciaVuelo(ruta);
	      int costo= distancia* COSTO_POR_KM;
	        return costo;  
	    }

	    @Override
	    protected double calcularPorcentajeDescuento(Cliente cliente) 
	    {
	        
	        return 0.0; 
	    }
	

}

