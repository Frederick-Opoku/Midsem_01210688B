package Converter;

public class distanceconverter {
    public double MeterToKM(double Meters)
	{
		double KM=0;
		KM = Meters / 1000;
		return KM;
	}
	public double KMToMeter(double KM)
	{
		double Meters=0;
		Meters = KM * 1000;
		return Meters;
	}
	public double MileToKM(double Miles)
	{
		double KM = 0;
		KM = Miles / 0.621371;
		return KM;
	}
	public double KMToMile(double KM)
	{
		double Miles = 0;
		Miles = KM * 0.621371;
		return Miles;
	}
}
