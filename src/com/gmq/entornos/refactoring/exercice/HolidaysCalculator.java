package com.gmq.entornos.refactoring.exercice;

/**
 * Calcula los días de vacaciones de un empleado. De un empleado nos interesa
 * conocer su nombre y el número de hijos que tiene. Los días de vacaciones para
 * todos los empleados, por defecto, son 22. Si el año es bisiesto, tendrán un
 * día más de vacaciones. Si tienen hijos, se añadirán tantos días de vacaciones
 * como hijos tenga.
 *
 * Por ejemplo, tenemos al empleado Juan con 2 hijos. Para el año 2020, tendrá
 * 25 días de vacaciones También tenemos a la empleada Carmen sin hijos. Para el
 * año 2020, tendrá 23 días de vacaciones Dada la siguiente clase:
 * 
 * 1.- Lee el código y crea los tests de junit necesarios 1.1.- Sigue las
 * indicaciones de la asignatura buscando la máxima cobertura posible
 * 
 * 2.- Realiza las correcciones que veas necesarias para mejorar la calidad del
 * código. 2.1.- Añade un comentario en el código explicando el cambio que has
 * realizado
 * 
 * @author Raul.Camarero  @see Evaluate
 */
public class HolidaysCalculator {
	// AQUI HE PUESTO COMO PRIVADOS LOS ATRIBUTOS Y HE QUITADO LINEAS EN BLANCO QUE
	// SOBRABAN
	private int numberOfChildren;
	private String name;

	public HolidaysCalculator(int numOfDays) {
		this.numberOfChildren = numOfDays;
	}
	
	public HolidaysCalculator(String name) {
		this.name = name;
		this.numberOfChildren = 0;
	}

	public HolidaysCalculator(String name, int numOfDays) {
		this.name = name;
		this.numberOfChildren = numOfDays;
	}
 
	public int getNumberOfChildren() {
		return numberOfChildren;
	}

	public String getName() { 
		return name;
	} 
	//AQUI HE METIDO POR PARAMETRO EL NUMERO DE NIÑOS
	public int calculateHolidaysDays(int year, int numberOfChildren) {
		// AQUI HE IGUALADO A 22 LOS DIAS DE VACACIONES YA QUE DE BASE TIENE TODOS 22
		int holidays = 22;
		// AQUI HE REDUCIDO A UN MISMO IF LOS 2 QUE HABIA PUESTO QUE HAN DE CUMPLIRSE
		// LAS 2 PARTES PARA QUE SEA BISIESTO
		if (year % 4 == 0 && year % 400 == 0) {
			holidays++;
		}
		// AQUI HE QUITADO LOS OTROS IFs PUESTO QUE CON QUE SEA MAYOR QUE 0, LE SUMARÁN
		// UN DIA DE VACACIONES POR NIÑO
		if (numberOfChildren > 0) {
			holidays += this.numberOfChildren; 
		}
		return holidays;
	}
}
