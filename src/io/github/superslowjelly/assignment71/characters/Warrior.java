package io.github.superslowjelly.assignment71.characters;

public class Warrior extends Character {

    public Warrior(int level, String name) {
        super(level, name);
    }

    @Override
    public String attack() {
        return getName() + " attacked!\t Speed: " + super.getLevel() * ATTACK_SPEED + " \tPower: " + super.getLevel() * ATTACK_POWER;
    }

    private static final double ATTACK_SPEED = 1.5;

    private static final double ATTACK_POWER = 3;

}
