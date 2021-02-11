package io.github.superslowjelly.inclass71;

import io.github.superslowjelly.inclass71.characters.Archer;
import io.github.superslowjelly.inclass71.characters.Character;
import io.github.superslowjelly.inclass71.characters.Warrior;
import io.github.superslowjelly.inclass71.characters.Wizard;

//import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

/*        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your character name: ");

        String mainName = scanner.nextLine();

        System.out.print("Please enter your character level: ");

        int mainLevel = scanner.nextInt();

        System.out.print("What type of character would you like to be? ");

        String mainCharacterType = scanner.nextLine();

        Character mainCharacter;
        if (mainCharacterType.contains("wizard"))
            mainCharacter = new Wizard(mainLevel, mainName);
        else if (mainCharacterType.contains("warrior"))
            mainCharacter = new Warrior(mainLevel, mainName);
        else if (mainCharacterType.contains("archer"))
            mainCharacter = new Archer(mainLevel, mainName);
        else
            mainCharacter = new Wizard(mainLevel, mainName);*/

        Character[] characters = new Character[] {
                new Warrior(12, "Gus"),
                new Warrior(100, "Frank"),
                new Wizard(1, "Twig"),
                new Wizard(75, "Nate"),
                new Archer(20, "Robin"),
                new Archer(60, "Hood")
        };

        StringBuilder output = new StringBuilder();

        for (Character character : characters) output.append(character.attack()).append('\n');

        System.out.print(output);

        characters[2].setLevel(2);

        System.out.print("\n" + characters[2].getName() + " levelled up! New level: " + characters[2].getLevel());

//        System.out.print("\n" + mainCharacter.attack());

    }

}
