public class Monster {
    // Atributes
    private String name;
    private String weapon;
    private int healthPoints;
    private int attack;
    private int defence;
    // Constructor
    Monster(){
        setName("");
        setWeapon("");
        setHealthPoints(0);
        setAttack(0);
        setDefence(0);
    }

    // Getters,
    public String getName(){
        return name;
    }
    public String getWeapon(){
        return weapon;
    }
    public int getHealthPoints(){
        return healthPoints;
    }
    public int getAttack(){
        return attack;
    }
    public int getDefence(){
        return defence;
    }

    // Setters
    public void setName(String _name){
        name = _name;
    }
    public void setWeapon(String _weapon){
        weapon = _weapon;
    }
    public void setHealthPoints(int _hp){
        healthPoints = _hp;
    }
    public void setAttack(int _attack){
        attack = _attack;
    }
    public void setDefence(int _defence){
        defence = _defence;
    }

    // Print function
    public void print(){
        System.out.println(getName() + "  |  " + getWeapon() + "  |  " + getHealthPoints() +
                "  |  " + getAttack() + "  |  " + getDefence());
    }
}
