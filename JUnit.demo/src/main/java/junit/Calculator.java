package junit;

public class Calculator {
	
	CalculatorService service;
	Calculator(	CalculatorService service)
	{
		this.service=service;
	}
	public int perform(int i,int j)
	{
		return service.add(2, 3)*i;
	}

}
