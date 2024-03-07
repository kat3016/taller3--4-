package uniandes.dpoo.aerolinea.modelo;
import uniandes.dpoo.aerolinea.exceptions.VueloSobrevendidoException;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

import uniandes.dpoo.aerolinea.modelo.tarifas.CalculadoraTarifas;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Vuelo {
	
	private java.lang.String fecha;
	private Ruta ruta;
	private Avion avion;
	private java.util.Map<java.lang.String ,Tiquete> tiquetes;
	
	public Vuelo(Ruta ruta, java.lang.String fecha, Avion avion)
	
	{
		this.fecha =fecha;
		this.ruta= ruta;
		this.avion=avion;
		
				
	}

	public Ruta getRuta() 
	{
		
		return this.getRuta();
	}

	public java.lang.String getFecha() 
	{
		
		return this.getFecha();
	}
	public Avion getAvion()
	{
		return this.getAvion();
	}

	
	
	public java.util.Map<java.lang.String, Tiquete> getTiquetes() {
		return tiquetes;
	}

	
	
	@Override
	public boolean equals(Object obj) {
	    return super.equals(obj);
	}
	public int verderTiquetes(Cliente cliente, CalculadoraTarifas calculadora, int cantidad) throws VueloSobrevendidoException
	{
		Avion avion=this.avion;
		int capacidad= avion.getCapacidad();
		int cantidadTiquetesVendidos= this.tiquetes.size();
		int tiquetesDisponibles= capacidad- cantidadTiquetesVendidos;
		if (cantidad<=  tiquetesDisponibles)
		{
			int tarifa = calculadora.calcularTarifa(this, cliente);
			int total= tarifa*cantidad;
			return total;
		}
		else
		{
			 throw new VueloSobrevendidoException(this);
		}
		
		
	}
	
	
	


}
