package day11.task2;

public class Paladin extends Hero implements Healer, PhysAttack{
    private final byte healHimself = 25;
    private final byte healTeammate = 10;
    Hero paladin;
    public Paladin(){
        physAtt = 15;
        magicAtt = 0;
        physDef = 50;
        magicDef = 20;
    }
    @Override
    public void healHimself() {
        if (health + healHimself <= MAX_HEALTH){
            health += healHimself;
        }else{
            health = MAX_HEALTH;
        }
    }

    @Override
    public void healTeammate(Hero hero) {
        double palHealth = hero.getHealth() + healTeammate;
        if (palHealth <= 100){
            hero.setHealth(palHealth);
        }else{
            hero.setHealth(100);
        }
    }

    @Override
    public String toString() {
        return "Paladin{" +
                "health=" + health +
                '}';
    }


    public double getHealth() {
        return health;
    }
    public void setHealth(double health) {
        this.health = health;
    }


    public int getPhysDef() {
        return physDef;
    }


    public int getMagicDef() {
        return magicDef;
    }


}
