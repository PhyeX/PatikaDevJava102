package com.company;

import com.company.Characters.MainCharacter;

public class Inventory {
     boolean water;
     boolean food;
     boolean firewood;
     String weaponName;
     String armorName;
     int weaponDamage;
     int armorDefence;

     public Inventory(MainCharacter mainCharacter) {
          this.water = false;
          this.food = false;
          this.firewood = false;
          this.weaponName = "Fist";
          this.armorName = "Tunic";
          this.weaponDamage = mainCharacter.getDamage();
          this.armorDefence = 0;
     }

     public boolean gatheredAllCompenents(){

          return water && food && firewood;
     }
     public boolean isWater() {
          return water;
     }

     public void setWater(boolean water) {
          this.water = water;
     }

     public boolean isFood() {
          return food;
     }

     public void setFood(boolean food) {
          this.food = food;
     }

     public boolean isFirewood() {
          return firewood;
     }

     public void setFirewood(boolean firewood) {
          this.firewood = firewood;
     }

     public String getWeaponName() {
          return weaponName;
     }

     public void setWeaponName(String weaponName) {
          this.weaponName = weaponName;
     }

     public String getArmorName() {
          return armorName;
     }

     public void setArmorName(String armorName) {
          this.armorName = armorName;
     }

     public int getWeaponDamage() {
          return weaponDamage;
     }

     public void setWeaponDamage(int weaponDamage) {
          this.weaponDamage = weaponDamage;
     }

     public int getArmorDefence() {
          return armorDefence;
     }

     public void setArmorDefence(int armorDefence) {
          this.armorDefence = armorDefence;
     }
}
