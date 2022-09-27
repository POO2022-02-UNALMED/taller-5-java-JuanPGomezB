package zooAnimales;
import java.util.ArrayList;

public class Anfibio extends Animal{
	private static ArrayList<Anfibio>listado = new ArrayList<>();
	public static int ranas;
	public static int salamandras;
	private String ColorPiel;
	private boolean venenoso;
	
	public Anfibio(String nombre, int edad, String habitat, String genero, String ColorPiel, boolean venenoso){
		super(nombre, edad, habitat, genero);
		this.ColorPiel = ColorPiel;
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
		String ColorPiel = "rojo";
		String habitat = "selva";
		
		Anfibio rana = new Anfibio(nombre, edad, habitat, genero, ColorPiel, venenoso);
		listado.add(rana);
		return rana;
	}
	
	public static Anfibio crearSalamandra(String nombre, int edad, String genero) {
		salamandras++;
		
		boolean venenoso = false;
		String ColorPiel = "negro y amarillo";
		String habitat = "selva";
		
		Anfibio salamandra = new Anfibio(nombre, edad, habitat, genero, ColorPiel, venenoso);
		listado.add(salamandra);
		return salamandra;
	}
	
	public String getColorPiel() {
		return ColorPiel;
	}
	
	public void setColorPiel(String ColorPiel) {
		this.ColorPiel = ColorPiel;
	}
	
	public boolean isVenenoso() {
		return venenoso;
	}
	
	public boolean getVenenoso() {
		return venenoso;
	}

	public void setVenenoso(boolean venenoso) {
		this.venenoso = venenoso;
	}

}
