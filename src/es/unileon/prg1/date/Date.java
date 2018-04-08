package es.unileon.prg1.date;

public class Date {
	private int day;
	private int month;
	private int year;
	
	
	public Date(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;

	}
	//1º Comienzo "if statement" (isSameYearIf,isSameMonthIf,isSameDayIf,isSameDateIf)
	public int getYear(){
		return this.year;
	}

	boolean isSameYearIf(Date another){
		if ( this.year == another.getYear() ){
			return true;
		}
		return false;
	}

	public int getMonth(){
		return this.month;
	}

	boolean isSameMonthIf(Date another){
		if ( this.month == another.getMonth() ){
			return true;
		}
		return false;
	}
	
	public int getDay(){
		return this.day;
	}

	
	boolean isSameDayIf(Date another){
		if ( this.day == another.getDay() ){
			return true;
		}
		return false;
	}

	boolean isSameDateIf(Date another){
		if ( (this.day == another.getDay()) && (this.month == another.getMonth()) && (this.year == another.getYear()) ){
			return true;
		}
		return false;
	}
	
	//Fin "if statement" 


	//2º Comienzo  "without if stament" (isSameYear,isSameMonth,isSameDay,isSameDate)
	boolean isSameYear(Date another){
		boolean True;
			True= (this.year==another.getYear());
			return True;	
	}

	boolean isSameMonth(Date another){
		boolean True;
			True= (this.month==another.getMonth());
			return True;	
	}

	boolean isSameDay(Date another){
		boolean True;
			True= (this.day==another.getDay());
			return True;	
	}

	boolean isSameDate(Date another){
		boolean True;
			True= ((this.year==another.getYear())&&(this.month==another.getMonth()) &&(this.day==another.getDay()));
			return True;	
	}


	//Fin "without if stament"
	
	//3º Comienzo método getMonthName (imprime el nombre del mes de la fecha)

	public String getMonthName(){
		StringBuffer monthName= new StringBuffer();

		switch (this.month){
			case 1: monthName.append("Enero");
				break;
			case 2: monthName.append("Febrero");
				break;
			case 3: monthName.append("Marzo");
				break;
			case 4: monthName.append("Abril");
				break;
			case 5: monthName.append("Mayo");
				break;
			case 6: monthName.append("Junio");
				break;
			case 7: monthName.append("Julio");
				break;
			case 8: monthName.append("Agosto");
				break;
			case 9: monthName.append("Septiembre");
				break;
			case 10: monthName.append("Octubre");
				break;
			case 11: monthName.append("Noviembre");
				break;
			case 12: monthName.append("Diciembre");
				break;
		}
		return monthName.toString();
	 }
				
		// Fin método getMonthName

	public String toString(){
		return this.day + "/" + this.month + "/" + this.year;
	}

	//4º Comienzo método isDayRight (revisa si la fecha es correcta)

	boolean isDayRight(){
		if(((this.month<=12)&&(this.day<=31))&&((this.month>=1)&&(this.day>=1))){
			switch(this.month){
				case 1:
				case 3:
				case 5:
				case 7:
				case 8:
				case 12:if(this.day<=31){
						return true;
					}
					else{
						return false;
					}
									
				case 4:
				case 6:
				case 9:
				case 11:if(this.day<=30){
						return true;
					}
					else{
						return false;
					}
					
				case 2:if(this.day<=28){
						return true;
					}
					else{
						return false;
					}
					
			}
		}

				
			return false;		
		
	}

	//Fin método isDayRight

	//5º Comienzo método getSeasonName( imprime la estación a la que pertenece la fecha)
	public String getSeasonName(){
		StringBuffer seasonName= new StringBuffer();
			switch (this.month){
				case 4:
				case 5:	seasonName.append("Primavera");
					break;
				case 7:
				case 8: seasonName.append("Verano");
					break;
				case 10:
				case 11: seasonName.append("Otono");
					break;
				case 1:
				case 2: seasonName.append("Invierno");
					break;
				case 3: if(day >20){
						seasonName.append("Primavera");
					}
					else{ seasonName.append("Invierno");
					}
					break;
				case 6: if(day>20){
						seasonName.append("Verano");
					}
					else{ seasonName.append("Primavera");
					}
					break;
				case 9: if(day>22){ 
						seasonName.append("Otono");
					}
					else{ seasonName.append("Verano");
					}
					break;
				case 12: if(day>20){
						seasonName.append("Invierno");
					}
					else{ seasonName.append("Otono");
					}
					break;
			}
			return seasonName.toString();
	}
	//Fin método getSeasonName

	//6º Comienzo método getMonthsLeft (según la fecha imprime los meses restantes para acabar el año)
		public String getMonthsLeft(){
			StringBuffer monthsLeft= new StringBuffer();
			int count=0;
				for(int i=this.month;i<=12;i++){
					monthsLeft.append(getMonthName()+ "\n");
					this.month= this.month +1;
					count=count + 1;
				}
				this.month=this.month-count;
				return monthsLeft.toString();
				
		}
	//Fin método getMonthsLeft

	//7º Comienzo método randomDate (Genera una fecha aleatoria)
		public String randomDate(){
			StringBuffer dateR= new StringBuffer();
					
			dateR.append((int)Math.floor(Math.random()*(31)+1)+"/");
			dateR.append((int)Math.floor(Math.random()*(12)+1)+"/");
			dateR.append((int)Math.floor(Math.random()*(2118)+1));
			return dateR.toString();		
			}
				
	//Fin métoddo randomDate

	//8º Comienzo método getDaysLeftOfMonth(Devuelve todas las fechas restantes para acabar el mes)
		public String getDaysLeftOfMonth(){
			int count2=0;
			StringBuffer daysLeftOfMonth= new StringBuffer();
			
				do{
					
					daysLeftOfMonth.append(this.day + "/" + this.month + "/" + this.year+"\n");
					this.day= this.day + 1;	
					count2=count2+1;
				}while(isDayRight()==true);
			this.day=this.day-count2;
			return daysLeftOfMonth.toString();
		}

	//Fin método getDaysLeftOfMonth

	//9º Comienzo método getMonthsSameDate (Devuelve los meses con el mismo número de dias que el mes de la fecha)
		public	String getMonthsSameDate(){
			StringBuffer monthsSameDate = new StringBuffer();

		switch (this.month){

			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
			monthsSameDate.append("Enero Marzo Mayo Julio Agosto Octubre Diciembre");
			break;

			case 2:
			monthsSameDate.append("Febrero");
			break;

			case 4:
			case 6:
			case 9:
			case 11:
			monthsSameDate.append("Abril Junio Septiembre Noviembre");
			break;
		}

		return monthsSameDate.toString();
	}
	//Fin método getMonthsSameDate

	//10º Comienzo método getDaysPast( imprime el número del día del año según la fecha)
		public String getDaysPast(){
			int past=0;
			int _31= 31;
			int _30= 30;
			StringBuffer DaysPast = new StringBuffer();
			switch (this.month){
				case 1:DaysPast.append(_31*0 + _30*0 + this.day);
					break;
				case 2: DaysPast.append(_31*1 + _30*0 + this.day);
					break;
				case 3: DaysPast.append(_31*1 + _30*0 + 28 + this.day);
					break;
				case 4: DaysPast.append(_31*2 + _30*0 + 28 + this.day);
					break;
				case 5: DaysPast.append(_31*2 + _30*1 + 28 + this.day);
					break;
				case 6: DaysPast.append(_31*3 + _30*1 + 28 + this.day);
					break;
				case 7: DaysPast.append(_31*3 + _30*2 + 28 + this.day);
					break;
				case 8: DaysPast.append(_31*4 + _30*2 + 28 + this.day);
					break;
				case 9: DaysPast.append(_31*5 + _30*2 + 28 + this.day);
					break;
				case 10: DaysPast.append(_31*5 + _30*3 + 28 + this.day);
					break;
				case 11: DaysPast.append(_31*6 + _30*3 + 28 + this.day);
					break;
				case 12: DaysPast.append(_31*6 + _30*4 + 28 + this.day);
					break;
			}
			return DaysPast.toString();
		}
	//Fin método daysPast

	//11º Comienzo método numRandomTimesEqualDate1 (Usando do-while, cuenta el número de intentos necesarios para que al generar una fecha aleatoria coincida con la fecha dada

		public String numRandomTimesEqualDate1(){
			int times=0;
			int _dia= 0, _mes=0;
			StringBuffer numTimes= new StringBuffer();
			do{
				 _dia = (int)(Math.floor(Math.random()*(31)+1));
				 _mes = (int)(Math.floor(Math.random()*(12)+1));
				
				times= times+1;
				
				}while (this.day != _dia && this.month!= _mes);
				numTimes.append(times);
			return numTimes.toString();
		}
	//Fin método numRandomTimesEqualDate1	
	
	//12º Comienzo método numRandomTimesEqualDate2( Igual que el anterior pero usando while)
		public String numRandomTimesEqualDate2(){
			int time=0;
			int _dia=0,_mes=0;
			StringBuffer numTime= new StringBuffer();
				while(this.day !=_dia && this.month != _mes){
					_dia = (int)(Math.floor(Math.random()*(31)+1));
				 	_mes = (int)(Math.floor(Math.random()*(12)+1));
				
					time= time+1;	
				}
					numTime.append(time);
				return numTime.toString();
		}
	//Fin método numRandomTimesEqualDate2

	//13º Comienzo método getDayOfWeek (Imprime el día de la semana segun la fecha introducida, supone que todos los años comienzan en lunes)
		public String getDayOfWeek(){
			StringBuffer dayOfWeek = new StringBuffer();
				int dia=Integer.parseInt(getDaysPast());
				if(dia%7 == 1){
					dayOfWeek.append("Lunes");
				}
				else if(dia%7== 2){
					dayOfWeek.append("Martes");
				}
				else if(dia%7==3){
					dayOfWeek.append("Miercoles");
				}
				else if(dia%7==4){
					dayOfWeek.append("Jueves");
				}
				else if(dia%7==5){
					dayOfWeek.append("Viernes");
				}
		 		else if(dia%7==6){
					dayOfWeek.append("Sabado");
				}
				else if(dia%7==0){
					dayOfWeek.append("Domingo");
				}
				return dayOfWeek.toString();
		}				
				
	//Fin método getDayOfWeek
	
}

