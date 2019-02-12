public class Bee extends Animal {
    public Bee(String inputName) {
        super(inputName, "pollen");
    }
    public void eat(String food) {

        if (food == favoriteFood) {
            System.out.println(this.name + " eats " + food);
            System.out.println("YUM!!! " + this.name + " wants more " + food);
            this.sleep();
        }else{
            System.out.println("YUCK!!! " + this.name + " will not eat " + food);
        }
    }
    public void sleep(){
        System.out.println(this.name + " never sleeps");
    }
}
