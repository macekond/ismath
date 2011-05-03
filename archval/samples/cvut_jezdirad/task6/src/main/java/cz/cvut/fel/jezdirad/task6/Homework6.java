package cz.cvut.fel.jezdirad.task6;


interface AI { /* neznamy kod */ }
class AI1 implements AI { /* neznamy kod */ }
class AI2 implements AI { /* neznamy kod */ }
class AI3 implements AI { /* neznamy kod */ }


interface Mechanics { /* neznamy kod */ }
class Mechanics1 implements Mechanics { /* neznamy kod */ }
class Mechanics2 implements Mechanics { /* neznamy kod */ }
class Mechanics3 implements Mechanics { /* neznamy kod */ }


interface Sensors { /* neznamy kod */ }
class Sensors1 implements Sensors { /* neznamy kod */ }
class Sensors2 implements Sensors { /* neznamy kod */ }
class Sensors3 implements Sensors { /* neznamy kod */ }


class Unit {

	Unit(AI a, Mechanics m, Sensors s) {
	}
	/* dalsi metody */

}


interface Builder {

	Unit buildUnit();

}


class Builder1 implements Builder {

	public Unit buildUnit() {
		return new Unit(new AI1(), new Mechanics2(), new Sensors2());
	}

}


class Builder2 implements Builder {

	public Unit buildUnit() {
		return new Unit(new AI3(), new Mechanics3(), new Sensors2());
	}

}


class Builder3 implements Builder {

	public Unit buildUnit() {
		return new Unit(new AI1(), new Mechanics3(), new Sensors2());
	}

}
