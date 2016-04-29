package personagem;

import java.sql.Date;

public final class Data {
	private int day, month, year;
	
	public Data(int dia, int mes,int ano) {
		this.year = ano;
        this.month = mes;
        this.day = checkday(dia);
	}
	public int getDay(){
		return this.day;
	}
	public int getMonth(){
		return this.month;
    }
	public int getYear(){
		return this.year;
    }
	public void setDay(int dia){
		this.day = checkday(dia);
    }
	public void setMonth(int mes){
		 this.month =(mes>0 && mes<13) ? mes : 1; 
    }
	public void setYear(int ano){
		this.year =(ano>1899) ? ano : 1900;
    }
	private int checkday(int dia){
		final int diasPorMes [ ] = {0,31,28,31,30,31,30,31,31,30,31,30,31};
	    if (dia >0 && dia <= diasPorMes[this.month])
	        return dia;
	    if (this.month == 2 && dia == 29 && (this.year%400==0 || (this.year%4 == 0 && this.year %100 != 0)))
	        return dia;
	    return 1;
	}
	public static int[] DataAtual(){
		
		int datas[] = new int[3];
		String tempData;
		
		Date date = new Date(System.currentTimeMillis());
		
		tempData= date.toString();
		
		datas[0] = Integer.parseInt(tempData.substring(0,4));
		datas[1] = Integer.parseInt(tempData.substring(5,7));
		datas[1] = Integer.parseInt(tempData.substring(8,10));
		
		System.out.println(datas[0]+datas[1]+datas[2]);
		
		return datas;
	}
}
