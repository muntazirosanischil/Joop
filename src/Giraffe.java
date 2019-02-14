public class Giraffe extends Animal{
    public Giraffe(String name){
        super("leaves", name);
    }

    public void sleep() {
        System.out.println(this.name + " sleeps for 8 hours");
    }

    public void eat(String food){
        if(food.equals(favoriteFood)){
            System.out.println(this.name + " eats " + food);
            System.out.println("YUM!!! " + this.name + " wants more " + food + "!");
            sleep();
        }else{
            System.out.println("YUCK!!! " + this.name + " will not eat " + food);
        }
    }
}
