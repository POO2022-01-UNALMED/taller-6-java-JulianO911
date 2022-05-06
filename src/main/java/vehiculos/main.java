package vehiculos;

public class main {

	public static void main(String[] args) {
		Pais p1 = new Pais("Francia");
		Pais p2 = new Pais("EEUU");
		Pais p3 = new Pais("Japon");
		Pais p4 = new Pais("Alemania");
		
		Fabricante f1 = new Fabricante("Renault",p1);
		Fabricante f2 = new Fabricante("BMW",p4);
		Fabricante f3 = new Fabricante("Mercedez Bens",p4);
		Fabricante f4 = new Fabricante("Volkswagen",p4);
		Fabricante f5 = new Fabricante("Chevrolet",p2);
		Fabricante f6 = new Fabricante("Toyota",p3);
		
		Automovil a1 = new Automovil("HDSAJD","Logan",26,1,f1,4);
		Camioneta a2 = new Camioneta("sadsa",5,"nose",4,1,f2,true);
		Camioneta a3 = new Camioneta("ssss",4,"nose2",4,1,f3,true);
		Camion a4 = new Camion("sacd","nose3",32,1,f4,1);
		Automovil a5 = new Automovil("sssss","Clio",26,1,f1,3);
		Automovil a6 = new Automovil("a","Clio",26,1,f1,3);
		Automovil a7 = new Automovil("1","NOSE4",26,1,f2,3);
		
		System.out.println(Pais.paisMasVendedor().getNombre());
		System.out.println(Fabricante.fabricaMayorVentas().getNombre());
		

	}

}
