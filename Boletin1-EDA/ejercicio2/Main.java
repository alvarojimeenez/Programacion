package common.collections.ejercicio2;

public class Main {

	public static void main(String[] args) {
		
		Alumno rafa = new Alumno("Rafael", "123456");
		Alumno fran = new Alumno("Fran", "568479");
		Alumno alvaro = new Alumno("Alvaro", "125478");
		Alumno alejandro = new Alumno("Alejandro", "365987");
		
		Equipo brenes = new Equipo("Brenes FC");
		Equipo lora = new Equipo("Lora FC");
		Equipo<Integer> tocina = new Equipo("Tocina FC"); // Probando Equipo con clase generica, en este caso la clase Integer.
		Equipo<Alumno> sevilla = new Equipo<>("Sevilla"); // Probando Equipo con clase generica, en este caso la clase Alumno.
		
		try {
			brenes.addAlumno(alejandro);
			brenes.addAlumno(rafa);
			lora.addAlumno(fran);
			tocina.addAlumno(alvaro);
			tocina.addAlumno(fran);
		} catch (EquipoException e1) {
			e1.printStackTrace();
		}
		
		
		System.out.println(brenes);
		System.out.println(lora);
		System.out.println(tocina);
		
		try {
			brenes.deleteAlumno(alejandro);
		} catch (EquipoException e) {
			e.printStackTrace();
		}
		System.out.println("----Mostrar personas equipo-------");
		System.out.println(brenes.mostrarPersonasEquipo());
		
		System.out.println("---------Unión equipos--------");
		System.out.println(tocina.unionEquipoA(lora));
		System.out.println(sevilla.unionEquipoA(brenes));
		
		System.out.println("--------------");
		System.out.println(tocina.perteneceEquipo(fran));
		System.out.println(tocina.perteneceEquipo(rafa));
		
		
		
		
	}

}
