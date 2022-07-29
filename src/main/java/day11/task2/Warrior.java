package day11.task2;

public class Warrior extends Hero implements PhysAttack{
    public Warrior(){
        physAtt = 30;
        magicAtt = 0;
        physDef = 80;
        magicDef = 0;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "health=" + health +
                '}';
    }

    @Override
    public double getHealth() {
        return health;
    }

    @Override
    public int getPhysDef() {
        return physDef;
    }

    @Override
    public int getMagicDef() {
        return magicDef;
    }


}
