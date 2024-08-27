package iuh.fit.se;



import javax.imageio.plugins.tiff.GeoTIFFTagSet;

public class HinhChuNhat {
	double dai;
	double rong;
	public HinhChuNhat(double dai, double rong) {
		super();
		this.dai = dai;
		this.rong = rong;
	}
	public HinhChuNhat() {
		// TODO Auto-generated constructor stub
	}
	public double getDai() {
		return dai;
	}
	public void setDai(double dai) {
		this.dai = dai;
	}
	public double getRong() {
		return rong;
	}
	public void setRong(double rong) {
		this.rong = rong;
	}
	public double getArae() {
		return dai*rong;
	}
	public double getPer() {
		return (dai+rong)*2;
	}
	@Override
	public String toString() {
		String str ="";
		str+=str.format("%-15.5f %-15.5f %-15.5f %-15.5f", getDai(),getRong(),getArae(),getPer());
		return str;
	}
	
}
