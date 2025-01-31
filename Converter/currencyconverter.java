package Converter;

public class currencyconverter {

    double ER = 0;
	public currencyconverter(double CurrentExchange)
	{
		ER = CurrentExchange;
	}
	
	public double DollarToCedis(double Dollar)
	{
		double Cedis=0;
		Cedis = ER * Cedis;
		return Cedis;
	}

	public double EuroToCedis(double Euro)
	{
		double Cedis =0;
		Cedis = Cedis * ER;
		return Cedis;
	}
	//
	public double YenToCedis(double Yen)
	{
		double Cedis=0;
		Cedis = Cedis/ER;
		return Cedis;
	}

	public double CedisToDollar(double Cedis)
	{
		double Dollar=0;
		Dollar= Cedis * ER;
		return Dollar;
	}
	//
	public double CedisToEuro(double Cedis)
	{
		double Euro=0;
		Euro = Cedis * ER;
		return Euro;
	}

	public double CedisToYen(double Cedis)
	{
		double Yen=0;
		Yen= Cedis * ER;
		return Yen;
	}
}
