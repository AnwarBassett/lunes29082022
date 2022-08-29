package ejerciciouno;
import java.util.Scanner;
public class CalculoDeSalarioNeto {
	
	final static double IR=15.6, INSSPATRONAL=22.5, SINDICATO=1,INSS=7, ANTIGUEDAD=15;
	public static void main(String[] args) {
		Scanner Lec=new Scanner(System.in);
		int Antiguedad;
		double ir, inssPatronal, montoAntiguedad, IngresoBruto, inss, sindicato;
		double montoInss, montoIr, montoSindicato, montoInssPatronal;
	    double IngresoTotal, totalDeducciones, ingresoNeto;
	    
	    System.out.println("Ingreso Bruto (basico)");
		IngresoBruto=Lec.nextDouble();
		System.out.println("Ingrese su Antiguedad");
		Antiguedad=Lec.nextInt();
		
		montoAntiguedad=IngresoBruto*ANTIGUEDAD/100;
		montoSindicato=IngresoBruto*SINDICATO/100;
		IngresoTotal=IngresoBruto+montoAntiguedad;
		montoInss=IngresoTotal*INSS/100;
		montoIr=IngresoTotal*IR/100;
		totalDeducciones=montoInss+montoIr+montoSindicato;
		montoInssPatronal=IngresoTotal*INSSPATRONAL/100;
		ingresoNeto=IngresoTotal-totalDeducciones;
		
		System.out.println("--------Tasas--------");
		System.out.println("Inss="+INSS+"%");
		System.out.println("Ir="+IR+"%");
		System.out.println("Sindicado="+SINDICATO+"%");
		System.out.println("Antiguedad="+ANTIGUEDAD+"%");
		System.out.println("Inss Patronal="+INSSPATRONAL+"%");
		System.out.println("--------Ingresos del Empleado--------");
		System.out.println("Ingreso Bruto (Basico)=C$"+IngresoBruto);
		System.out.println("Antiguedad=C$"+montoAntiguedad);
		System.out.println("Ingreso Total=C$"+IngresoTotal);
		System.out.println("--------Deducciones del Empleado--------");
		System.out.println("---Deducciones sobre el ingreso bruto---");
		System.out.println("Monto del Sindicato=C$"+montoSindicato);
		System.out.println("---Deducciones sobre el ingreso total---");
		System.out.println("Monto del Inss=C$"+montoInss);
		System.out.println("Monto del Ir=C$"+montoIr);
		System.out.println("Total Deducciones=C$"+totalDeducciones);
		System.out.println("--------Deducciones del Empleador--------");
		System.out.println("Monto del Inss Patronal=C$"+montoInssPatronal);
		System.out.println("--------Total a Pagar--------");
		System.out.println("Ingreso Neto=C$"+ingresoNeto);
		
		
		

      Lec.close();
	}
}
