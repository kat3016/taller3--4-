package uniandes.dpoo.aerolinea.modelo.cliente;

import java.util.List;

import uniandes.dpoo.aerolinea.modelo.Vuelo;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;

public abstract class Cliente {
	public List<Tiquete> tiquetesSinUsar;
	public List<Tiquete> tiquetesUsados;
	
	public Cliente()
	{
		
	}
	public String getTipoCliente()
	{
		// TODO Auto-generated method stub
				return null;
	}

	public String getIdentificador() {
		// TODO Auto-generated method stub
		return null;
	}
	public  void agregarTiquete (Tiquete tiquete)
	{
		
	}
	public int calcularValorTotalTiquetes()
	{
		return -1;
		
	}
	public void  usarTiquetes(Vuelo vuelo)
	{
		
	}

}
