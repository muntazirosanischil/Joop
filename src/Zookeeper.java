public class Zookeeper {
    String name;

    public Zookeeper(String name) {
        this.name = name;
    }

    public void feedAnimals(Animal[] hungryAnimals, String food){
        System.out.println(name + " is feeding " + food + " to " + hungryAnimals.length + " of " + Animal.population + " total animals.");
        for(int i = 0; i < hungryAnimals.length; i++){
            hungryAnimals[i].eat(food);
        }
    }

}
