public class Zoo {
    public static String favoriteFood = "bacon";

    public static void main(String[] args){


        Animal[] animals = new Animal[5];

        Tiger tigger = new Tiger("Tigger");
        animals[0] = tigger;
//        tigger.eat("meat");
        Bear bear = new Bear("Pooh");
        animals[1] = bear;
//        bear.eat("fish");
//        bear.eat("meat");
        Unicorn unicorn = new Unicorn("rarity");
        animals[2] = unicorn;
//        unicorn.eat("marshmallows");
//        unicorn.eat("kibble");
        Giraffe giraffe = new Giraffe("Gemma");
        animals[3] = giraffe;
//        giraffe.eat("meat");
//        giraffe.eat("leaves");
        Bee bee = new Bee("Stinger");
        animals[4] = bee;
//        bee.eat("ice cream");
//        bee.eat("pollen");
        Zookeeper zookeeper = new Zookeeper("Zoebot");

        zookeeper.feedAnimals(animals,"pad tai");
    }
//    public static void sleep(String name){
//        System.out.println(name + " sleeps for 8 hours");
//    }
//    public static void eat(String name, String food) {
//        System.out.println(name + " eats " + food);
//        if (food == favoriteFood) {
//            System.out.println("YUM!!! " + name + " wants more " + food);
//        }else{
//            sleep(name);
//        }
//    }
}
