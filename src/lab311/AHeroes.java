package lab311;

import java.util.Objects;

abstract class AHeroes implements IHeroes{
    protected String name;
    protected Conditions condition;

    @Override
    public int hashCode() {

        return Objects.hash(name);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AHeroes aHero = (AHeroes) o;
        return Objects.equals(name, aHero.name);
    }

    @Override
    public String toString(){

        return "Human{" + "name = '" + name + '}';
    }

    public String getName() {

        return this.name = name;
    }

    public Conditions setCondition(Conditions condit) {

        return this.condition = condit;
    }




}
