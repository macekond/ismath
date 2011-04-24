package cz.cvut.fel.malekji3.task3;

/*
class Homework3
{
    public static void main(String[] args)
    {
        Complex c = new Complex1(1.0D, 2.0D);
        Complex d = new Complex2(3.0D, 4.0D);
        if (Math.abs(c.plus(d).getReal() - 4.0D) > 0.1D) throw new RuntimeException("Chyba pri scitani");
        if (Math.abs(c.plus(d).getImaginary() - 6.0D) > 0.1D) throw new RuntimeException("Chyba pri scitani");
        if (Math.abs(c.times(d).getReal() + 5.0D) > 0.1D) throw new RuntimeException("Chyba pri nasobeni");
        if (Math.abs(c.times(d).getImaginary() - 10.0D) > 0.1D) throw new RuntimeException("Chyba pri nasobeni");
    }
}
*/

interface Complex {
    public double getReal(); // vrati realnou slozku tohoto cisla
    public double getImaginary(); // vrati komplexni slozku tohoto cisla
    public double getAbsoluteValue(); // vrati vzdalenost tohoto cisla od pocatku
    public double getArgument(); // vrati uhel tohoto cisla
    public Complex plus(Complex other); // vrati soucet tohoto cisla a parametru
    public Complex times(Complex other); // vrati soucin tohoto cisla a parametru
}

class Complex1 implements Complex
{
    double real;
    double imaginary;

    public Complex1(double real, double imaginary)
    {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal()
    {
        return this.real;
    }

    public double getImaginary()
    {
        return this.imaginary;
    }

    public double getAbsoluteValue()
    {
        return Math.sqrt(this.real * this.real + this.imaginary * this.imaginary);
    }

    public double getArgument()
    {
        return Math.acos(this.real / this.getAbsoluteValue());
    }

    public Complex plus(Complex other)
    {
        return new Complex1(this.real + other.getReal(), this.imaginary + other.getImaginary());
    }

    public Complex times(Complex other)
    {
        return new Complex1(this.real * other.getReal() - this.imaginary * other.getImaginary(), this.real * other.getImaginary() + this.imaginary * other.getReal());
    }
}

class Complex2 implements Complex
{
    double absoluteValue;
    double argument;

    public Complex2(double real, double imaginary)
    {
        this.absoluteValue = Math.sqrt(real * real + imaginary * imaginary);
        this.argument = Math.acos(real / this.absoluteValue);
    }

    public double getReal()
    {
        return Math.cos(this.getArgument()) * this.getAbsoluteValue();
    }

    public double getImaginary()
    {
        return Math.sin(this.getArgument()) * this.getAbsoluteValue();
    }

    public double getAbsoluteValue()
    {
        return this.absoluteValue;
    }

    public double getArgument()
    {
        return this.argument;
    }

    public Complex plus(Complex other)
    {
        return new Complex1(this.getReal() + other.getReal(), this.getImaginary() + other.getImaginary());
    }

    public Complex times(Complex other)
    {
        return new Complex1(this.getReal() * other.getReal() - this.getImaginary() * other.getImaginary(), this.getReal() * other.getImaginary() + this.getImaginary() * other.getReal());
    }
}
