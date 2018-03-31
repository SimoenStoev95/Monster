public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World");
        Monster monster = new Monster();
        Monster human = new Monster();
        // monster attributes
        monster.setName("Raptail");
        monster.setWeapon("Poison");
        monster.setHealthPoints(100);
        monster.setAttack(70);
        monster.setDefence(55);
        // human attributes
        human.setName("Baltazar");
        human.setWeapon("Sword");
        human.setHealthPoints(70);
        human.setAttack(110);
        human.setDefence(40);

        // Battle
        boolean flag = true;
        double i = Math.ceil(Math.random());
        System.out.println(human.getName() + " and " + monster.getName() + " health points before the fight.");
        System.out.println(human.getName() + ": " + human.getHealthPoints() + "; " + monster.getName() + ": "
                + monster.getHealthPoints());
        System.out.println("Start fight!!!");
        System.out.println();
        while(flag){
            if(i % 3 == 0){
                human.ultimateAttack(20, monster);
                System.out.println(human.getName() + " hit ultimate attack on " + monster.getName());
                System.out.println(human.getName() + ": " + human.getHealthPoints() + "; " + monster.getName() + ": "
                        + monster.getHealthPoints());
            }
            else if (i % 8 == 0){
                monster.ultimateAttack(20, human);
                System.out.println(monster.getName() + " hit ultimate attack on " + human.getName());
                System.out.println(human.getName() + ": " + human.getHealthPoints() + "; " + monster.getName() + ": "
                        + monster.getHealthPoints());
            }
            else if (i % 2 == 0){
                human.hit(monster);
                System.out.println(human.getName() + " hit " + monster.getName());
                System.out.println(human.getName() + ": " + human.getHealthPoints() + "; " + monster.getName() + ": "
                        + monster.getHealthPoints());
            }
            else{
                monster.hit(human);
                System.out.println(monster.getName() + " hit " + human.getName());
                System.out.println(human.getName() + ": " + human.getHealthPoints() + "; " + monster.getName() + ": "
                        + monster.getHealthPoints());
            }
            if (monster.isAlive() && !human.isAlive()){
                System.out.println(monster.getName() + " is the winner!");
                System.out.println(human.getName() + ": " + human.getHealthPoints() + "; " + monster.getName() + ": "
                        + monster.getHealthPoints());
                flag = false;
            }
            else if(human.isAlive() && !monster.isAlive()){
                System.out.println(human.getName() + " is the winner!");
                System.out.println(human.getName() + ": " + human.getHealthPoints() + "; " + monster.getName() + ": "
                        + monster.getHealthPoints());
                flag = false;
            }
            else if( !(human.isAlive() || monster.isAlive()) ){
                System.out.println(monster.getName() + " and " + human.getName() + " are both dead!");
                System.out.println(human.getName() + ": " + human.getHealthPoints() + "; " + monster.getName() + ": "
                        + monster.getHealthPoints());
                flag = false;
            }
            double random = Math.ceil(Math.random());
            i += random;
        }
    }
}
