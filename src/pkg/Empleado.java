package pkg;

public class Empleado {
	
	private float salarioBase;
	public enum TipoEmpleado{vendedor, encargado,};
	
	public float calculoNominaBruta(TipoEmpleado tipo, float ventasMes, float horasExtra) {
		salarioBase=-1;
		
		if(tipo == Empleado.TipoEmpleado.vendedor) {
			salarioBase = 2000;
		}else if (tipo == Empleado.TipoEmpleado.encargado){
			salarioBase = 2500;
		}

		if(ventasMes >= 1500) {
			salarioBase = salarioBase + 200;
		}else if (ventasMes >= 1000){
			salarioBase = salarioBase + 100;
		}

		for(int i = 0; i < horasExtra; i++) {
			salarioBase += 30;
		}

		return salarioBase;
	}// hacer comprobacion encargado vendedor otro, calculo de ventas  >=1500 1100 o return -1 y  luego horas extras >=0 o return -1;
	
	public float calculoNominaNeta(float nominaBruta) {
		float retencion;
		if(nominaBruta >2100 && nominaBruta<2500 ) {
			retencion= (float) 0.15;
		}else if(nominaBruta>= 2500) {
			retencion = (float) 0.18;
		}else {
			retencion=0;
		}
		return nominaBruta*(1-retencion);
	} // PRUEBAS <2100 2100-2500 >2500 O NEGATIVO
	//TOTAL 13 TEST
	
}
