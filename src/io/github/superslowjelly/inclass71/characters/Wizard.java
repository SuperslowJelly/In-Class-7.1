package io.github.superslowjelly.inclass71.characters;

public class Wizard extends Character {

    public Wizard(int level, String name) {
        super(level, name);
    }

    @Override
    public String attack() {
        return getName() + " attacked!\t Speed: " + super.getLevel() * ATTACK_SPEED + " \tPower: " + super.getLevel() * ATTACK_POWER;
    }

    private static final double ATTACK_SPEED = 1;

    private static final double ATTACK_POWER = 3;

}
