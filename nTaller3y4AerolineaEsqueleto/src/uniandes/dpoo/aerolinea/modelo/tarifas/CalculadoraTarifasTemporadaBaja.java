package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Ruta;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.cliente.ClienteCorporativo;


public class CalculadoraTarifasTemporadaBaja extends CalculadoraTarifas
{
	protected  static final int COSTO_POR_KM_NATURAL=600;
	protected static final int COSTO_POR_KM_CORPORATIVO=900;
	protected static final double DESCUENTO_PEQ=0.02;
	protected static final double DESCUENTO_MEDIANAS=0.1;
	protected static final double DESCUENTO_GRANDES=0.2;
	
	
	 @Override
	    protected int calcularCostoBase(Vuelo vuelo, Cliente cliente) {
	      
		 Ruta ruta= vuelo.getRuta();
	      int distancia= calcularDistanciaVuelo(ruta);
	      if (cliente.getTipoCliente()=="corporativo")
	      {
	    	   int costo= distancia*COSTO_POR_KM_CORPORATIVO;
		        return costo;  
	      }
	      else
	      {
	    	  int costo= distancia*COSTO_POR_KM_NATURAL ;
		        return costo; 
	      }
	      
	    }

	    @Override
	    protected double calcularPorcentajeDescuento(Cliente cliente) {
	        if (cliente.getTipoCliente().equals("corporativo") && cliente instanceof ClienteCorporativo) {
	            ClienteCorporativo clienteCorporativo = (ClienteCorporativo) cliente;
	            int tamanoEmpresa = clienteCorporativo.getTamanoEmpresa();

	            if (tamanoEmpresa == 3) {
	                return DESCUENTO_PEQ;
	            } else if (tamanoEmpresa == 2) {
	                return DESCUENTO_MEDIANAS;
	            } else {
	               
	                return DESCUENTO_GRANDES;
	            }
	        } else {
	            
	            return 0.0;  
	        }

	    }

}
