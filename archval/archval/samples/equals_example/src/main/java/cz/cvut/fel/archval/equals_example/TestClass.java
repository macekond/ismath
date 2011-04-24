package cz.cvut.fel.archval.equals_example;

import java.io.Serializable;

public class TestClass implements Serializable {

    int num;

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj == null) || (obj.getClass() != this.getClass())) {
            return false;
        }
        TestClass test = (TestClass) obj;
        return num == test.num;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 61 * hash + this.num;
        return hash;
    }
}
