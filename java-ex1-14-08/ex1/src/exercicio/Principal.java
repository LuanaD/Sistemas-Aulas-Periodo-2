package exercicio;

import exercicio2.Hora;

/*public class Principal {
		public static void main(String[]args){
			Data d= new Data();
			d.dia=40;
			d.mes=40;
			d.ano=-40;
			System.out.println(d);
	}
}*/

public class Principal {
		public static void main(String[]args){
			Data d= new Data();
			d.setDia(25);
			d.setMes(11);
			d.setAno(1999);
			System.out.println(d);
			Hora h= new Hora();
			h.sethora(11);
			h.setminuto(35);
			h.setsegundo(26);
			System.out.println(h);		
}
}



