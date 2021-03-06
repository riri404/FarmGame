package executor.animal;

import executor.Location;

public class Chicken extends Animal {

    public Chicken() {
        super();
    }

    public Chicken(Location location, int hungry, boolean sick, boolean clean) {
        super(location, hungry, sick, clean);
    }

    @Override
    public String speak() {
        return "The chicken clucks!";
    }

    @Override
    public String returnStatus() {
        return "The chicken is at the " + getLocation().getName() + ". It is "
                + ((isHungry()) ? "hungry, " : "full, ")
                + ((isSick()) ? "sick, " : "healthy, ")
                + ((isClean()) ? "and clean." : "and filthy.");
    }

    public String picture() {
        return "     __//" +
                "\n    /.__.\\" +
                "\n    \\ \\/ /" +
                "\n '__/    \\" +
                "\n  \\-      )" +
                "\n   \\_____/" +
                "\n_____|_|____" +
                "\n     \" \"";

    }

}