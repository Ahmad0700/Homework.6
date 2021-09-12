package com.company;

public class Skeleton extends Boss{
    private int numberOfArrows;

    public int getNumberOfArrows() {
        return numberOfArrows;
    }

    public void setNumberOfArrows(int numberOfArrows) {
        this.numberOfArrows = numberOfArrows;
    }

    @Override
    public void printlnfo() {
        super.printlnfo();
        System.out.println(getHp()+ "\n" + getDamage()+ "\n" + weapon.getWeaponNeam()+"\n" + weapon.getWeaponType());
    }
}