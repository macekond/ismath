package cz.cvut.fel.taranpe1.task3;

interface Complex {
    public double getReal(); // vrati realnou slozku tohoto cisla
    public double getImaginary(); // vrati komplexni slozku tohoto cisla
    public double getAbsoluteValue(); // vrati vzdalenost tohoto cisla od pocatku
    public double getArgument(); // vrati uhel tohoto cisla
    public Complex plus(Complex other); // vrati soucet tohoto cisla a parametru
    public Complex times(Complex other); // vrati soucin tohoto cisla a parametru
}



/*******************************************************************************
 * Instance t��dy Complex1 p�edstavuj� cisla v algebraickem tvaru
 *
 * @author    Petr
 * @version   1.00.000
 */
class Complex1 implements Complex {
    // realna slozka

    private double real;
    // imaginarni slozka
    private double img;

    public Complex1(double real, double img) {
        this.real = real;
        this.img = img;
    }

    // vraci real
    public double getReal() {
        return real;
    }

    // vraci img
    public double getImaginary() {
        return img;
    }

    // absolutni hodnota
    public double getAbsoluteValue() {
        return Math.sqrt((real * real) + (img * img));
    }
    // uhel

    public double getArgument() {
        double cislo = Math.atan(img/real); 
        // 0
        if (real == 1 && img == 0) {
            return 0;
        }

        // I.
        if (real > 0 && img > 0) {
            return cislo;
        }

        // PI/2
        if (real == 0 && img == 1) {
            return Math.PI/2;
        }

        // II.
        if (real < 0 && img > 0) {
            return (Math.PI/2)+cislo;
        }

        // PI
        if (real == -1 && img == 0) {
            return Math.PI;
        }

        // III.
        if (real < 0 && img < 0) {
            return (Math.PI)+cislo;
        }

        // 3PI/2
        if (real == 0 && img == -1) {
            return ((3/2)*Math.PI);
        }

        // IV.
        return ((3/2)*Math.PI)+cislo;

    }

    // scitani
    public Complex plus(Complex other) {
        return new Complex1(real + other.getReal(), img + other.getImaginary());
    }

    // nasobeni
    public Complex times(Complex other) {
        return new Complex1((real * other.getReal()) - (img * other.getImaginary()), (real * other.getImaginary()) + (img * other.getReal()));
    }
}


/*******************************************************************************
 * Instance t��dy Complex2 p�edstavuj� cisla v goniometrickem tvaru
 *
 * @author    Petr
 * @version   1.00.000
 */
class Complex2 implements Complex {
    private double abs;
    private double argument;


    public Complex2(double real, double img) {
        argument = new Complex1(real, img).getArgument();
        abs = new Complex1(real, img).getAbsoluteValue();
    }

    // vraci real
    public double getReal() {
        return abs*Math.cos(argument);
    }

    // vraci img
    public double getImaginary() {
        return abs*Math.sin(argument);
    }

    // absolutni hodnota
    public double getAbsoluteValue() {
        return abs;
    }
    
    // uhel
    public double getArgument() {
        return argument;
    }

    // scitani
    public Complex plus(Complex other) {
        return new Complex2(getReal()+other.getReal(), getImaginary()+other.getImaginary());
    }

    // nasobeni
    public Complex times(Complex other) {
        return new Complex2((getReal() * other.getReal()) - (getImaginary() * other.getImaginary()), (getReal() * other.getImaginary()) + (getImaginary() * other.getReal()));
    }
}


public class Homework3{
	public Homework3(){}
}
