package day11.task2;

public class Magician extends Hero implements PhysAttack, MagicAttack{
    public Magician(){
        physAtt = 5;
        magicAtt = 20;
        physDef = 0;
        magicDef = 80;
    }

    @Override
    public void magicalAttack(Hero hero) {
        if (hero.getHealth() >= (magicAtt - hero.getMagicDef()*0.01*magicAtt)){
            hero.setHealth(hero.getHealth() - (magicAtt - hero.getMagicDef()*0.01*magicAtt));
        }else{
            hero.setHealth(0);
        }
    }

    @Override
    public String toString() {
        return "Magician{" +
                "health=" + health +
                '}';
    }

    @Override
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
