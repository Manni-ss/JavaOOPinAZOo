public class Bee extends Animal{

    public Bee(String name){
        super(name, "pollen");
    }
    public void eat(String food) {

        if(food.equals(favoriteFood)){
            System.out.println(this.name + " eats " + food);
            System.out.println("YUM! " + this.name + " wants more " + food);

        } else {
            System.out.println("YUCKY! " + this.name + " will not eat " + food);

        }
        sleep();
    }
    public void sleep(){
        System.out.println(name + " never sleeps");
    }

}
