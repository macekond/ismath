package cz.cvut.fel.jezdirad.task3;


interface Complex {

	public double getReal(); // vrati realnou slozku tohoto cisla


	public double getImaginary(); // vrati komplexni slozku tohoto cisla


	public double getAbsoluteValue(); // vrati vzdalenost tohoto cisla od pocatku


	public double getArgument(); // vrati uhel tohoto cisla


	public Complex plus(Complex other); // vrati soucet tohoto cisla a parametru


	public Complex times(Complex other); // vrati soucin tohoto cisla a parametru
}


/**
 * First Complex class implementation, represented by real and imaginary part
 * @author Radek Ježdík
 */
class Complex1 implements Complex {

	final private double r;

	final private double i;


	/**
	 * Creates new instance of Complex1 class
	 * @param real Real part
	 * @param imag Imaginary part
	 */
	public Complex1(double real, double imag) {
		r = real;
		i = imag;
	}


	public double getReal() {
		return r;
	}


	public double getImaginary() {
		return i;
	}


	public double getAbsoluteValue() {
		return Math.sqrt(r * r + i * i);
	}


	public double getArgument() {
		double length = getAbsoluteValue();
		if(length == 0) {
			return 0;
		}
		return Math.acos(r / length);
	}


	public Complex plus(Complex other) {
		return new Complex1(r + other.getReal(), i + other.getImaginary());
	}


	public Complex times(Complex other) {
		double or = other.getReal();
		double oi = other.getImaginary();
		return new Complex1(r * or - i * oi, r * oi + i * or);
	}

}


/**
 * Second Complex class implementation, represented by absolute value and angle
 * @author Radek Ježdík
 */
class Complex2 implements Complex {

	final private double absValue;

	final private double angle;


	/**
	 * Creates new instance of Complex2 class
	 * @param real Real part
	 * @param imag Imaginary part
	 */
	public Complex2(double real, double imag) {
		absValue = Math.sqrt(real * real + imag * imag);
		if(absValue == 0) {
			angle = 0;
		} else {
			angle = Math.acos(real / absValue);
		}
	}


	public double getReal() {
		return Math.cos(angle) * getAbsoluteValue();
	}


	public double getImaginary() {
		return Math.sin(angle) * getAbsoluteValue();
	}


	public double getAbsoluteValue() {
		return absValue;
	}


	public double getArgument() {
		return angle;
	}


	public Complex plus(Complex other) {
		return new Complex2(other.getReal() + getReal(), other.getImaginary() + getImaginary());
	}


	public Complex times(Complex other) {
		double r = getReal();
		double i = getImaginary();
		double or = other.getReal();
		double oi = other.getImaginary();
		return new Complex2(r * or - i * oi, r * oi + i * or);
	}

}
