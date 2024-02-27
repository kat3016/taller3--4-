package uniandes.dpoo.aerolinea.tiquetes;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;

public class Tiquete 
{
	private String codigo;
	private int tarifa;
	private boolean usado;
	public Vuelo vuelo;
	public Cliente cliente;
	public Tiquete(String codigo, Vuelo vuelo2, Cliente cliente2, int tarifa2) {
		super();
		this.codigo = codigo;
		this.tarifa =tarifa2;
		this.vuelo =  vuelo2;
		this.cliente = cliente2  ;
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
		
	}
	public boolean esUsado()
	{
		return true;
	}
	
	

}
