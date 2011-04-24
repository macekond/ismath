package cz.cvut.fel.watzkdav.task3;
 
interface Complex {
    public double getReal(); // vrati realnou slozku tohoto cisla
    public double getImaginary(); // vrati komplexni slozku tohoto cisla
    public double getAbsoluteValue(); // vrati vzdalenost tohoto cisla od pocatku
    public double getArgument(); // vrati uhel tohoto cisla
    public Complex plus(Complex other); // vrati soucet tohoto cisla a parametru
    public Complex times(Complex other); // vrati soucin tohoto cisla a parametru
}

// algebraicky tvar
class Complex1 implements Complex {
	private double real;
	private double imag;

	public Complex1(double r, double i) {
		real = r;
		imag = i;
	}

	public Complex plus(Complex other) {
		return new Complex1(this.getReal()+other.getReal(),
				    this.getImaginary()+other.getImaginary());
	}

	public Complex times(Complex other) {
		return new Complex1(this.getReal()*other.getReal()-this.getImaginary()*other.getImaginary(),
				    this.getReal()*other.getImaginary()+this.getImaginary()*other.getReal());
	}

	public double getReal() {
		return real;
	}

	public double getImaginary() {
		return imag;
	}

	public double getAbsoluteValue() {
		return Math.sqrt(real*real + imag*imag);
	}

	public double getArgument() {
		return Math.acos(real/getAbsoluteValue());
	}
}

// goniometricky tvar
class Complex2 implements Complex {
	private double abs;
	private double arg;

	public Complex2(double real, double imag) {
		abs = Math.sqrt(real*real + imag*imag);
		arg = Math.acos(real/abs);
	}

	public Complex plus(Complex other) {
		return new Complex2(this.getAbsoluteValue() * Math.cos(this.getArgument()) + other.getAbsoluteValue() * Math.cos(other.getArgument()),
				    this.getAbsoluteValue() * Math.sin(this.getArgument()) + other.getAbsoluteValue() * Math.sin(other.getArgument()));
	}

	public Complex times(Complex other) {
		return new Complex2(this.getAbsoluteValue()*other.getAbsoluteValue()*Math.cos(this.getArgument()+other.getArgument()),
				    this.getAbsoluteValue()*other.getAbsoluteValue()*Math.sin(this.getArgument()+other.getArgument()));
	}


	public double getAbsoluteValue() {
		return abs;
	}

	public double getArgument() {
		return arg;
	}

	public double getReal() {
		return abs*Math.cos(arg);
	}

	public double getImaginary() {
		return abs*Math.sin(arg);
	}

}
