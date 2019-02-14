public class Animal {

    String favoriteFood;
    String name;

    public Animal(String favoriteFood, String name) {
        this.favoriteFood = favoriteFood;
        this.name = name;
    }

    public void sleep() {
        System.out.println(this.name + " sleeps for 8 hours");
    }

    public void eat(String food){
        System.out.println(this.name + " eats " + food);
        if(food.equals(favoriteFood)){
            System.out.println("YUM!!! " + this.name + " wants more " + food + "!");
        }else{
            sleep();
        }
    }
}
