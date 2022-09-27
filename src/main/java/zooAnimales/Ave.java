package zooAnimales;
import java.util.ArrayList;

public class Ave extends Animal{
	private static ArrayList<Ave>listado = new ArrayList<>();
	public static int halcones;
	public static int aguilas;
	private String colorPlumas;
	
	
	public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas){
		super(nombre, edad, habitat, genero);
		this.colorPlumas = colorPlumas;
		listado.add(this);
		setTotalAves(1);
	}
	
	public Ave() {
		this(null, 0, null, null, null);
		
	}
	
	public int cantidadAves() {
		return listado.size();
		
	}
	@Override
	public String movimiento() {
		return "volar";
	}
	
	public static Ave crearHalcon(String nombre, int edad, String genero) {
		halcones++;
		
		String colorPlumas = "cafe glorioso";
		String habitat = "montanas";
		
		Ave halcon = new Ave(nombre, edad, habitat, genero, colorPlumas);
		listado.add(halcon);
		return halcon;
	}
	
	public static Ave crearAguila(String nombre, int edad, String genero) {
		aguilas++;
		
		String colorPlumas = "blanco y amarillo";
		String habitat = "montanas";
		
		Ave aguila = new Ave(nombre, edad, habitat, genero, colorPlumas);
		listado.add(aguila);
		return aguila;
	}
	
	public String getcolorPlumas() {
		return colorPlumas;
	}
	
	public void setPatas(String colorPlumas) {
		this.colorPlumas = colorPlumas;
	}
	
	
}
