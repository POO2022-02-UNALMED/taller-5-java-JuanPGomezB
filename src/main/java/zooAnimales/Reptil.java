package zooAnimales;
import java.util.ArrayList;

public class Reptil extends Animal {
	private static ArrayList<Reptil>listado = new ArrayList<>();
	public static int iguanas;
	public static int serpientes;
	private String colorEscamas;
	private int largoCola;
	
	public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola){
		super(nombre, edad, habitat, genero);
		this.colorEscamas = colorEscamas;
		this.largoCola = largoCola;
		listado.add(this);
		setTotalReptiles(1);
	}
	
	public Reptil() {
		this(null, 0, null, null, null, 0);
		
	}
	
	public int cantidadReptiles() {
		return listado.size();
		
	}
	
	@Override
	public String movimiento() {
		return "reptar";
	}
	
	public static Reptil crearIguana(String nombre, int edad, String genero) {
		iguanas++;
		
		int largoCola = 3;
		String colorEscamas = "verde";
		String habitat = "humedal";
		
		Reptil iguana = new Reptil(nombre, edad, habitat, genero, colorEscamas, largoCola);
		listado.add(iguana);
		return iguana;
	}
	
	public static Reptil crearSerpiente(String nombre, int edad, String genero) {
		serpientes++;
		
		int largoCola = 1;
		String colorEscamas = "blanco";
		String habitat = "jungla";
		
		Reptil serpiente = new Reptil(nombre, edad, habitat, genero, colorEscamas, largoCola);
		listado.add(serpiente);
		return serpiente;
	}
	
	public String getColorEscamas() {
		return colorEscamas;
	}
	
	public void setColorEscamas(String colorEscamas) {
		this.colorEscamas = colorEscamas;
	}
	
	public int getLargoCola() {
		return largoCola;
	}
	
	public void setLargoCola(int largoCola) {
		this.largoCola = largoCola;
	}
}
