package day11.task2;

public abstract class Hero implements PhysAttack{
    double health;
    byte physAtt;
    byte magicAtt;
    byte physDef;
    byte magicDef;
    final byte MAX_HEALTH = 100;
    final byte MIN_HEALTH = 0;
    public Hero(){
        health = 100;
    }

    public void setHealth(double health) {
        this.health = health;
    }

    public double getHealth() {
        return health;
    }

    public int getPhysDef() {
        return physDef;
    }

    public int getMagicDef() {
        return magicDef;
    }
    public void physicalAttack(Hero hero) {
        double herosHealth = hero.getHealth() - (physAtt - hero.getPhysDef()*0.01*physAtt);
        if (herosHealth >= MIN_HEALTH){
            hero.setHealth(herosHealth);
        }else{
            hero.setHealth(0);
        }
    }
}
