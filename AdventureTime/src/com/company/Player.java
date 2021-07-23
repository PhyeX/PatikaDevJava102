package com.company;


import com.company.Characters.*;


import java.util.Scanner;

public class Player {

    private MainCharacter mainCharacter;
    private String username;
    Inventory inventory;

    public Player(String username) {
        this.username = username;
    }

    public void selectChar() {
        Scanner scan = new Scanner(System.in);
        MainCharacter characters[] = new MainCharacter[]{new Samurai(), new Archer(), new Knight()};
        System.out.println("Before start the game choose your character with id: ");
        for (MainCharacter character : characters) {
            System.out.println(
                    " Id : " + character.getId() +
                            " Karekter : " + character.getName() +
                            " ( Hasar : " + character.getDamage() + " ) ," +
                            " ( Sağlık : " + character.getHealth() + " ) ," +
                            " ( Para : " + character.getMoney() + " )"
            );
        }
        int selection = scan.nextInt();
        if (selection > -1 && selection < characters.length) {
            setMainCharacter(characters[selection - 1]);
        } else {
            setMainCharacter(characters[0]);
        }

        System.out.println(
                " You chose : " + mainCharacter.getName() +
                        " ( Hasar : " + mainCharacter.getDamage() + " ) ," +
                        " ( Sağlık : " + mainCharacter.getHealth() + " ) ," +
                        " ( Para : " + mainCharacter.getMoney() + " )");

        inventory = new Inventory(mainCharacter);
    }
    public String getUsername() {
        return username;
    }

    public MainCharacter getMainCharacter() {
        return mainCharacter;
    }

    public void setMainCharacter(MainCharacter mainCharacter) {
        this.mainCharacter = mainCharacter;
    }

    public Inventory getInventory() {
        return inventory;
    }

}
