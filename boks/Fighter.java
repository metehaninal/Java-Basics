package boks;

public class Fighter {
    String name;
    int damage;
    int health;
    int weight;
    double dodge;
    
    public Fighter(String name,int damage,int health,int weight,double dodge) {
        this.name = name;
        this.damage = damage;
        this.health = health;
        this.weight = weight;
        if(this.dodge >=0 && this.dodge <= 100){
            this.dodge = dodge;
        }else{
            this.dodge = 0;
        }
        
    }
    public int hit(Fighter foe) {
        System.out.println("------------");
        System.out.println(this.name + " => " + foe.name + " " +  this.damage + " hasar vurdu.");

        if (foe.dodge()) {
            System.out.println(foe.name + " gelen hasari savurdu.");
            return foe.health;
        }

        if (foe.health - this.damage < 0)
            return 0;

        return foe.health - this.damage;
    }

    public boolean dodge() {
        double randomValue = Math.random() * 100;  //0.0 to 99.9
        return randomValue <= this.dodge;
    }
}
