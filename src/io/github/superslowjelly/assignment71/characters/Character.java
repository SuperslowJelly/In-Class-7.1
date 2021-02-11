package io.github.superslowjelly.assignment71.characters;

public abstract class Character {

    public Character(int level, String name) {
        NAME = name;
        this.level = level;
    }

    protected int level;

    public double getLevel() {
        return level;
    }

    protected final String NAME;

    public String getName() {
        return NAME;
    }

    public abstract String attack();

    public void setLevel(int level) {
        this.level = level;
    }

}
