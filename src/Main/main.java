package Main;

public class main {

	public static void main(String[] args) {
		BMI bmical = new BMI(100.0,178.0);
		bmical.BMIZakresPod();
		bmical.BMIZakresRoz();

	}
	

}
class BMI
{
	private double waga;
	private double wzrost;
	public BMI(double waga ,double wzrost)
	{
		this.waga = waga;
		this.wzrost = wzrost/100;
	}
	public double BMICalculator()
	{
		 return this.waga/(this.wzrost*this.wzrost);
	}
	public void BMIZakresPod()
	{
		if (18.5>BMICalculator())
		{
			System.out.println("Niedowaga");
		}
		else if (18.5<BMICalculator() && 24.99 >BMICalculator())
		{
			System.out.println("wartosc prawidlowa");
		}
		else// if (BMICalculator()>25)
		{
			System.out.println("nadwaga");
		}
	}
	public void BMIZakresRoz()
	{
		if (16>BMICalculator())
		{
			System.out.println("Wyglodzenie");
		}
		else if (16<BMICalculator() && BMICalculator()<16.99)
		{
			System.out.println("wychudzenie");
		}
		else if (17<BMICalculator() && BMICalculator()<18.49)
		{
			System.out.println("niedowaga");
		}
		else if (18.5<BMICalculator() && BMICalculator()<24.99)
		{
			System.out.println("wartosc prawidlowa");
		}
		else if (25<BMICalculator() && BMICalculator()<29.99)
		{
			System.out.println("nadwaga");
		}
		else if (30<BMICalculator() && BMICalculator()<34.99)
		{
			System.out.println("I stopien otylosci");
		}
		else if (30<BMICalculator() && BMICalculator()<34.99)
		{
			System.out.println("II stopien otylosci");
		}
		else 
		{
			System.out.println("III stopien otylosci");
		}
		
	}
}
