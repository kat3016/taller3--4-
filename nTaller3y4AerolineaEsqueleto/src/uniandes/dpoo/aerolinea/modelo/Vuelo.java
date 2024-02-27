package uniandes.dpoo.aerolinea.modelo;
import uniandes.dpoo.aerolinea.modelo.cliente.Cliente;
import uniandes.dpoo.aerolinea.modelo.tarifas.CalculadoraTarifas;
import uniandes.dpoo.aerolinea.tiquetes.Tiquete;
import java.util.Collection;
import java.util.HashMap;
public class Vuelo {
	
	private String fecha;
	private Ruta ruta;
	private Avion avion;
	private HashMap<String, Tiquete> tiquetes;
	
	public Vuelo(Ruta ruta, String fecha, Avion avion)
	
	{
		this.fecha =fecha;
		this.ruta= ruta;
		this.avion=avion;
		this.tiquetes= new HashMap<String, Tiquete>();
				
	}

	public Ruta getRuta() 
	{
		
		return this.getRuta();
	}

	public String getFecha() 
	{
		
		return this.getFecha();
	}
	public Avion getAvion()
	{
		return this.getAvion();
	}

	public HashMap<String, Tiquete> getTiquetes() {
		return tiquetes;
	}
	
	public int verderTiquetes(Cliente cliente, CalculadoraTarifas calculadora, int cantidad)
	{
		return -1;
	}
	
	public boolean equals(Object obj)
	{
		return true;
	}
	
	
		
	
	
	


}
