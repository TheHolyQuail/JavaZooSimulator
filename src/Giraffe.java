public class Giraffe extends Animal {
    public Giraffe(String inputName) {
        super(inputName, "leaves");
    }
    public void eat(String food) {
        System.out.println(this.name + " eats " + food);
        if (food == favoriteFood) {
            System.out.println("YUM!!! " + this.name + " wants more " + food);
            this.sleep();
        }else{
            System.out.println("YUCK!!! " + this.name + " will not eat " + food);
        }
    }
}

