package zooAnimales;
import java.util.ArrayList;

public class Anfibio extends Animal{
	private static ArrayList<Anfibio>listado = new ArrayList<>();
	public static int ranas;
	public static int salamandras;
	private String colorPiel;
	private boolean venenoso;
	
	public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso){
		super(nombre, edad, habitat, genero);
		this.colorPiel = colorPiel;
		this.venenoso = venenoso;
		listado.add(this);
		setTotalAnfibios(1);
	}
	
	public Anfibio() {
		this(null, 0, null, null, null, false);
	}
	
	public int cantidadAnfibios() {
		return listado.size();
		
	}
	
	@Override
	public String movimiento() {
		return "saltar";
	}
	
	public static Anfibio crearRana(String nombre, int edad, String genero) {
		ranas++;
		
		boolean venenoso = true;
		String colorPiel = "rojo";
		String habitat = "selva";
		
		Anfibio rana = new Anfibio(nombre, edad, habitat, genero, colorPiel, venenoso);
		listado.add(rana);
		return rana;
	}
	
	public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
		ranas++;
		
		boolean venenoso = false;
		String colorPiel = "negro y amarillo";
		String habitat = "selva";
		
		Anfibio salamandra = new Anfibio(nombre, edad, habitat, genero, colorPiel, venenoso);
		listado.add(salamandra);
		return salamandra;
	}

}
