package pkg;

public class Empleado {
	public enum TipoEmpleado{Vendedor,Encargado};
	
	float salarioBase = 0;
	float primas = 0;
	float Extras = 0;
	
	public float calculoNominaBruta(TipoEmpleado tipo, float ventasMes, float horasExtras) {
		
		if(tipo==TipoEmpleado.Vendedor) {
			salarioBase=2000;
		}else if(tipo==TipoEmpleado.Encargado) {
			salarioBase=2500;
		}
		
		if(ventasMes>=1500) {
			primas=200;
		}else if(ventasMes>=1000){
			primas=100;
		}
		
		Extras = horasExtras*30;
		
		return salarioBase+primas+Extras;
		
		
	}
}
