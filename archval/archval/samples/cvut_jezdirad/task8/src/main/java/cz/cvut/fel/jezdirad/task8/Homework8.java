package cz.cvut.fel.jezdirad.task8;


interface Number {

	Number plus(Number n);


	Number plusReal(Real r);


	Number plusComplex(Complex c);

}


class Real implements Number {

	int value;


	public Real(int v) {
		value = v;
	}


	public Number plus(Number n) {
		return n.plusReal(this);
	}


	public Number plusReal(Real r) {
		return new Real(value + r.value);
	}


	public Number plusComplex(Complex c) {
		return new Complex(value + c.re, c.im);
	}

}


class Complex implements Number {

	int re, im;


	public Complex(int r, int i) {
		re = r;
		im = i;
	}


	public Number plus(Number n) {
		return n.plusComplex(this);
	}


	public Number plusReal(Real r) {
		return new Complex(re + r.value, im);
	}


	public Number plusComplex(Complex c) {
		return new Complex(re + c.re, im + c.im);

	}

}


class NumberDecorator implements Number {

	Number num;


	public NumberDecorator(Number n) {
		num = n;
	}


	public Number plus(Number n) {
		return n.plus(this);
	}


	public Number plusReal(Real r) {
		return num.plusReal(r);
	}


	public Number plusComplex(Complex c) {
		return num.plusComplex(c);
	}

}
