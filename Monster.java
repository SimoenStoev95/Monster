 public class Monster {
     // Atributes
     private String name;
     private String weapon;
     private int healthPoints;
     private int attack;
     private int defence;
     private int healCounter = 3;

     // Constructor
     Monster() {
         setName("");
         setWeapon("");
         setHealthPoints(0);
         setAttack(0);
         setDefence(0);
     }

     // Getters,
     public final String getName() {
         return name;
     }

     public final String getWeapon() {
         return weapon;
     }

     public final int getHealthPoints() {
         return healthPoints;
     }

     public final int getAttack() {
         return attack;
     }

     public final int getDefence() {
         return defence;
     }

     // Setters
     public void setName(String _name) {
         name = _name;
     }

     public void setWeapon(String _weapon) {
         weapon = _weapon;
     }

     public void setHealthPoints(int _hp) {
         healthPoints = _hp;
     }

     public void setAttack(int _attack) {
         attack = _attack;
     }

     public void setDefence(int _defence) {
         defence = _defence;
     }

     // Print function
     public final void print() {
         System.out.println(getName() + "  |  " + getWeapon() + "  |  " + getHealthPoints() +
                 "  |  " + getAttack() + "  |  " + getDefence());
     }

     // Is monster alive function
     public final boolean isAlive(){
         return getHealthPoints() > 0;
     }

     // Ultimate attack
     public void ultimateAttack(int damage, Monster creature){
         if(isAlive()){
             int formula = (creature.getDefence() / 2) + damage;
             creature.setHealthPoints(creature.getHealthPoints() - formula);
         }
         else{
             System.out.println("Ultimate attack. The creature is gone");
         }
     }

     // Hit function
     public void hit(Monster creature){
         if(creature.isAlive()){
             int damage = getAttack() - creature.getDefence();
             if (damage > 0) {
                 creature.setHealthPoints(creature.getHealthPoints() - damage);
             }
         }
         else{
             System.out.println("Cannot hit " + creature.getName() + " because it does't have any health points!");
         }
     }

     // Heal function
     public final void heal(){
         if(healCounter > 0){
             setHealthPoints(getHealthPoints() + 20);
             healCounter--;
         }
         else{
             System.out.println("Cannot heal " + this.getName());
         }
     }
 }