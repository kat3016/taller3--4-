package uniandes.dpoo.aerolinea.modelo.tarifas;

import uniandes.dpoo.aerolinea.modelo.Aeropuerto;
import uniandes.dpoo.aerolinea.modelo.Ruta;
import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public abstract class CalculadoraTarifas 
{
	public static  double IMPUESTO= 0.28;

	public   int calcularTarifa(Vuelo vuelo, Cliente cliente)
	{
																												
		int costoBase=calcularCostoBase( vuelo,  cliente);
		double descuento =calcularPorcentajeDescuento( cliente);
		int  impuesto= calcularValorImpuestos(costoBase);
		double resultado= (costoBase+  impuesto) - (costoBase*descuento);
		
		return (int) resultado;
		
	}
	protected int calcularCostoBase(Vuelo vuelo, Cliente cliente) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	protected double calcularPorcentajeDescuento( Cliente cliente) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public int calcularDistanciaVuelo( Ruta ruta)
	{
		Aeropuerto origen= ruta.origen;
		Aeropuerto destino= ruta.destino;
		int distancia= Aeropuerto.calcularDistancia(origen, destino);
		return distancia;
		
	
	}
	
	protected static int calcularValorImpuestos(int costoBase)
	{
		double resultado=costoBase * IMPUESTO;
		return (int)  resultado ;
	}
	
	

}
