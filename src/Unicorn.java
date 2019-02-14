public class Unicorn extends Animal {
    public Unicorn(String name){
        super("marshmallows", name);
    }

    public void sleep() {
        System.out.println(this.name + " sleeps in a cloud");
    }
}
