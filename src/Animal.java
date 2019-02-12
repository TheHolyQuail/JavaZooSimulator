public class Animal {
    public String name;
    public String favoriteFood;
    static int population;

    public Animal(String inputName, String food) {
        name = inputName;
        favoriteFood = food;
        population ++;
    }

    public void sleep(){
        System.out.println(this.name + " sleeps for 8 hours");
    }
    public void eat(String food) {
        System.out.println(this.name + " eats " + food);
        if (food == favoriteFood) {
            System.out.println("YUM!!! " + this.name + " wants more " + food);
        }else{
            this.sleep();
        }
    }
    public static void main(String[] args) {
        //make and run a main method
        Animal animal = new Animal("Tigger", "gruel");
        animal.eat("meat");
        animal.eat("kibble");

    }

}
