package Converter;

public class timeconverter {
    public double HrToMin(double Hours)
	{
		double Minutes = 0;
		Minutes = Hours*60;
		return Minutes;
	}
	public double MinToHour(double Minutes )
	{
		double Hours= 0;
		Hours= Minutes /60;
		return Hours;
	}
	//
	public double HrToSec(double Hours)
	{
		double Seconds= 0;
		Seconds= Hours*3600;
		return Seconds;
	}
	public double SecToHour(double Seconds )
	{
		double Hours= 0;
		Hours= Seconds /3600;
		return Hours;
	}

}
