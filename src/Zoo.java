public class Zoo {

    String favoriteFood = "Bacon";

    public void sleep(String name) {
        System.out.println(name + " sleeps for 8 hours");
    }
    public void eat(String name, String food){
        System.out.println(name + " eats " + food);
        if(food.equals(favoriteFood)){
            System.out.println("YUM! " + name + " wants more food");
        } else {
            sleep(name);
        }
    }

}
