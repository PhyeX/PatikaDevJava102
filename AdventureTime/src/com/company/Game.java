package com.company;

import com.company.Characters.MainCharacter;
import com.company.Places.Location;
import com.company.Places.SafePlaces.SafeHouse;
import com.company.Places.SafePlaces.ToolStore;

import java.util.Scanner;


public class Game {
    Player player;
    Location location;

    public void start(){
        Scanner scan = new Scanner(System.in);
        System.out.println("=== Welcome to adventure time! ===");

        System.out.print("Enter a username : ");
        String username = scan.next();
        player = new Player(username);
        System.out.println("Welcome the game " + player.getUsername());
        System.out.println("Everything is real here!");
        player.selectChar();
        MainCharacter mainCharacter = player.getMainCharacter();
        Inventory inventory = player.getInventory();
        int maxHealth = mainCharacter.getHealth();
        location = new SafeHouse(player,maxHealth);
        while (mainCharacter.getHealth() > 0 ) {
            blanks();
            System.out.println("Now there is some options what can you do");
            System.out.println("Options <Press number>");
            System.out.println("Here you are player " + location.name);
            System.out.println("Your Health : ( "+mainCharacter.getHealth()+" )");
            System.out.println("1-Go To Shelter ( You can restore your health! ) ");
            System.out.println("2-Go to Shop ");
            System.out.println("3-Go for Mine ( You can encounter with Snakes! ) ");
            System.out.println("4-Go for Forest ( You can encounter with Vampires! ) ");
            System.out.println("5-Go for River ( You can encounter with Bears! )");
            System.out.println("6-Go for Cave ( You can encounter with Zombies! ) ");
            blanks();
            int selection = scan.nextInt();
            switch (selection){
                case 1 :
                    location = new SafeHouse(player,maxHealth);
                    location.onLocation();
                    System.out.println("You have restored your power and feel awesome!");
                    break;
                case 2 :
                    location = new ToolStore(player);
                    location.onLocation();
                case 3 :

                case 4 :

                case 5 :

                case 6 :

            }
            blanks();

            if(inventory.gatheredAllCompenents()){
                System.out.println(" You have collected all the items");
                break;
            }
        }
    }



    public void blanks(){
        System.out.println("====== ****** ======");
    }


}
