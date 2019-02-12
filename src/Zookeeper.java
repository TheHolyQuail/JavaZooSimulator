public class Zookeeper {
    String name;
    public Zookeeper(String inputedName){
        name = inputedName;
    }

    public void feedAnimals(Animal[] animals, String food){
        System.out.println(this.name + " is feeding " + food + " to " + animals.length + " of " + Animal.population + " total animals");
        for(int i  = 0; i < animals.length; i++){
            animals[i].eat(food);
        }
    }
}
