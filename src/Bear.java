public class Bear extends Animal {
//    public String name;
//    public String favoriteFood;

    public Bear(String inputName) {
        super(inputName, "fish");
    }
    public void sleep(){
        System.out.println(this.name + " hibernates for 4 months");
    }
//    public void eat(String food) {
//        System.out.println(this.name + " eats " + food);
//        if (food == favoriteFood) {
//            System.out.println("YUM!!! " + this.name + " wants more " + food);
//        }else{
//            this.sleep();
//        }
//    }
//    public static void main(String[] args) {
//        //make and run a main method
//        Tiger tigger = new Tiger("Tigger");
//        tigger.eat("meat");
//        tigger.eat("kibble");
//        Bear bear = new Bear("Pooh");
//        bear.eat("meat");
//        bear.eat("kibble");
//
//    }

}
