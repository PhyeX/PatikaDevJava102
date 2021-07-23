package com.company.Places.SafePlaces;


import com.company.Armors.Armor;
import com.company.Armors.HeavyArmor;
import com.company.Armors.LightArmor;
import com.company.Armors.MediumArmor;
import com.company.Inventory;
import com.company.Places.NormalLoc;
import com.company.Player;
import com.company.Weapon.Gun;
import com.company.Weapon.Rifle;
import com.company.Weapon.Sword;
import com.company.Weapon.Weapon;

import java.nio.file.Watchable;
import java.util.Scanner;

public class ToolStore extends NormalLoc {
    Scanner scan = new Scanner(System.in);
    public ToolStore(Player player) {
        super(player);
    }

    @Override
    public boolean onLocation() {

       int selection;

        do {
            System.out.println("Welcome to the Shop ! <Press Key>");
            System.out.println("1-For Armors");
            System.out.println("2-For Weapons");
            System.out.println("3-For Exit");
            selection = scan.nextInt();
            switch (selection) {
                case 1:
                    getArmors();
                    break;
                case 2:
                    getWeapons();
                    break;
            }
            System.out.println("You have entered an wrong number ! ");
            selection = scan.nextInt();
        }while(selection != 3);


        return true;
    }

    public void getArmors() {
        Armor[] armors = new Armor[]{new LightArmor(), new MediumArmor(), new HeavyArmor()};
        System.out.println(" Here is some armors you can buy ! Enter Id you want buy , if  you want Exit you can press <4>");
        for (Armor armor : armors) {
            System.out.println("Id : " + armor.getId() + " , Block : " + armor.getBlock() + " , Cost : " + armor.getCost());
        }
        System.out.println();
        int selection = scan.nextInt();
        while (selection != 4) {
            int money = player.getMainCharacter().getMoney();
            if( selection >= 1 && selection <= 3){
                Armor armor = armors[selection-1];
                int cost = armor.getCost();
                if( money < cost ){
                    System.out.println("You dont have enough money buddy !");
                }else{
                    player.getInventory().setArmorDefence(armor.getBlock());
                    String armorName = selection == 1 ? "Light Armor " : selection == 2 ? "Medium Armor" : "Heavy Armor";
                    player.getInventory().setArmorName(armorName);
                    money -= cost;
                }
            }else{
                System.out.println("You have entered an wrong number ! ");
            }
            player.getMainCharacter().setMoney(money);
            selection = scan.nextInt();
        }
    }

    public void getWeapons(){
        Weapon [] weapons  = new Weapon []{ new Gun() , new Rifle() , new Sword() };

        System.out.println(" Here is some weapons you can buy ! Enter Id you want buy , if  you want Exit you can press <4>");
        for (Weapon weapon : weapons) {
            System.out.println("Id : " + weapon.getId() + " , Damage : " + weapon.getDamage() + " , Cost : " + weapon.getMoney() );
        }
        int selection = scan.nextInt();
        while (selection != 4) {
            int money = player.getMainCharacter().getMoney();
            if( selection >= 1 && selection <= 3){
                Weapon weapon = weapons[selection-1];
                int cost = weapon.getMoney();
                if( money < cost ){
                    System.out.println("You dont have enough money buddy !");
                }else{
                    player.getInventory().setWeaponDamage(weapon.getDamage());
                    String weaponName = selection == 1 ? "Gun" : selection == 2 ? "Rifle" : "Sword";
                    player.getInventory().setWeaponName(weaponName);
                    money -= cost;
                }
            }else{
                System.out.println("You have entered an wrong number ! ");
            }
            player.getMainCharacter().setMoney(money);
            selection = scan.nextInt();
        }
    }



}
