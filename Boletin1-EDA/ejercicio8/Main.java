package common.collections.ejercicio8;

public class Main {

	public static void main(String[] args) {
		Alumno alvaro = new Alumno("Alvaro", "458986R", 14,'H', "Sevilla");
		Alumno fran = new Alumno("Fran", "12345H", 29,'H', "Sevilla");
		Alumno alejandro = new Alumno("Alejandro", "7845463T", 17,'H', "Cadiz");
		Alumno cristina = new Alumno("Cristina", "452896Q", 25,'M', "Madrid");
		Alumno marta = new Alumno("Marta", "145233S", 21,'M', "Granada");
		Alumno maria = new Alumno("Maria", "46451C", 17,'M', "Granada");
		
		Equipo p = new Equipo<>("Brenes FC");
		Equipo p2 = new Equipo<>("Brenes Femenino FC");
		
		try {
			p.addAlumno(alvaro);
			p.addAlumno(fran);
			p.addAlumno(alejandro);
			p.addAlumno(cristina);
			p2.addAlumno(marta);
			p2.addAlumno(maria);
		} catch (EquipoException e) {
			e.printStackTrace();
		}
		//a
		System.out.println(p.listaJugadoresSexoMasculinoMayorEdad());
		//c
		System.out.println(p2.numeroJugadoresSexoFemeninoMayorEdad());
		//b
		System.out.println(p2.esFemeninoElEquipo());
		System.out.println(p.esFemeninoElEquipo());
		//d
		System.out.println(p2.edadMayor());
		//e
		System.out.println(p.devolverDniHombresMenores());
		//f
		System.out.println(p2.listaNombreJugadoras());
		//g
		System.out.println(p.hayJugadoraMayorDeEdad());
		//h 
		System.out.println(p.numeroCiudadesDiferentes());
	}
}
