package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class CalculadoraTarifasTemporadaBaja extends CalculadoraTarifas
{
	protected int COSTO_POR_KM_NATURAL=600;
	protected int COSTO_POR_KM_CORPORATIVO=900;
	protected double DESCUENTO_MEDIANAS=0.1;
	protected double DESCUENTO_GRANDES=0.2;
	
	 @Override
	    protected int calcularCostoBase(Vuelo vuelo, Cliente cliente) {
	      
	        return 0;  
	    }

	    @Override
	    protected double calcularPorcentajeDescuento(Cliente cliente) 
	    {
	        
	        return 0.0; 
	    }
	
	
	

}