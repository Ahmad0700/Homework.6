package com.company;

import com.sun.security.jgss.GSSUtil;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHp(1000);
        boss.setDamage(35);
        boss.weapon.setWeaponType("Gun");
        boss.weapon.setWeaponNeam("Deagle");
        boss.printlnfo();

        Skeleton skeleton = new Skeleton();
        skeleton.setHp(245);
        skeleton.setDamage(70);
        skeleton.weapon.setWeaponType("m24");
        skeleton.weapon.setWeaponNeam("автоматчичечкий");
        skeleton.printlnfo();


        Skeleton skeleton2 = new Skeleton();
        skeleton2.setHp(600);
        skeleton2.setDamage(30);
        skeleton2.weapon.setWeaponType("M416");
        skeleton2.weapon.setWeaponNeam("автоматчичечкий");
        skeleton2.printlnfo();
    }
}
