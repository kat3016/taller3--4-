package uniandes.dpoo.aerolinea.tiquetes;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class Tiquete 
{
	private java.lang.String codigo;
	private int tarifa;
	private boolean usado;
	public Vuelo vuelo;
	public Cliente cliente;
	
	
	public Tiquete(java.lang.String  codigo, Vuelo vuelo, Cliente cliente, int tarifa) 
	{
		
		this.codigo = codigo;
		this.tarifa =tarifa;
		this.vuelo =  vuelo;
		this.cliente = cliente;
	}
	public String getCodigo() {
		return codigo;
	}
	public int getTarifa() {
		return tarifa;
	}
	public Vuelo getVuelo() {
		return vuelo;
	}
	public Cliente getCliente() {
		return cliente;
	}
	
	
	
	public void marcarComoUsado()
	{
		if(usado==true)
		{
			usado=false;
		}
	}
	
	
	public boolean esUsado()
	{
		if(usado==true)
		{
			return true;
		}
		else
		{
		return false;
		}
	}
	
	

}
