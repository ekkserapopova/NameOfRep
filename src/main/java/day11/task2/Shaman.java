package day11.task2;

public class Shaman extends Hero implements Healer, PhysAttack, MagicAttack{
    private final byte healHimself = 50;
    private final byte healTeammate = 30;
    Hero shaman;
    public Shaman(){
        physAtt = 10;
        magicAtt = 15;
        physDef = 20;
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
        double shamanHealth = hero.getHealth() + healTeammate;
        if (shamanHealth <= MAX_HEALTH){
            hero.setHealth(shamanHealth);
        }else{
            hero.setHealth(MAX_HEALTH);
        }
    }
    @Override
    public void magicalAttack(Hero hero) {
        double shamanHealth = hero.getHealth() - (magicAtt - hero.getMagicDef()*0.01*magicDef);
        if (shamanHealth >= MIN_HEALTH){
            hero.setHealth(shamanHealth);
        }else{
            hero.setHealth(MIN_HEALTH);
        }
    }

    @Override
    public String toString() {
        return "Shaman{" +
                "health=" + health +
                '}';
    }

    @Override
    public double getHealth() {
        return health;
    }

    @Override
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
