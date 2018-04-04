package es.unileon.prg1.date;

public class MainDate {

	public static void main(String[] args) {
		Date today, tomorrow;
		today = new Date(10, 2, 2019);
		tomorrow = new Date(28, 2, 2018);

		if(today.isDayRight() && tomorrow.isDayRight() == true){

		System.out.println(today + " isSameYear " + tomorrow + "? " + today.isSameYearIf(tomorrow));

		System.out.println(today + " isSameMonth " + tomorrow + "? " + today.isSameMonthIf(tomorrow));

		System.out.println(today + " isSameDay " + tomorrow + "? " + today.isSameDayIf(tomorrow));

		System.out.println(today + " isSameDate " + tomorrow + "? " + today.isSameDayIf(tomorrow));

		System.out.println(today+ " tiene el mes " +today.getMonthName());
		System.out.println(tomorrow+ " tiene el mes "+tomorrow.getMonthName());

		System.out.println(today+ " esta en la estacion: "+today.getSeasonName());
		System.out.println(tomorrow+ " esta en la estacion: "+tomorrow.getSeasonName());

		System.out.println("Desde " +today+ " quedan estos meses para acabar el anyo:\n" +today.getMonthsLeft()); 

		}

		else{
		System.out.println("Fecha incorrecta");
		}
		
		System.out.println("Fecha aleatoria, advertencia, puede no ser correcta: "+today.randomDate());

		System.out.println("Para acabar el mes desde "+today+" quedan estas fechas:\n" +today.getDaysLeftOfMonth());

		System.out.println("Meses con los mismos dias que "+today.getMonthName()+" :\n"+today.getMonthsSameDate());

		System.out.println(today+" es el dia numero "+today.getDaysPast());
		
		System.out.println("Numero de intentos para acertar la fecha "+today+" :\n"+today.numRandomTimesEqualDate1());

		System.out.println("Si el anyo comienza en lunes, el "+today+" es " +today.getDayOfWeek());
	}
		
}
