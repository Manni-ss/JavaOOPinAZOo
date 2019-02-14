public class Runner {
    public static void main(String[] args) {

        Zoo z = new Zoo();
        z.eat("Tigger", "meat");
        z.eat("Tigger", "bacon");
        Tiger tigger = new Tiger("Tigger");
        tigger.eat("meat");
        tigger.eat("kibble");
        Bear pooh = new Bear("Pooh");
        pooh.eat("fish");
        pooh.eat("meat");
        Unicorn rarity = new Unicorn("Rarity");
        rarity.eat("fish");
        Giraffe gemma = new Giraffe("Gemma");
        gemma.eat("fish");
        gemma.eat("leaves");
        Bee buzz = new Bee("Buzz");
        buzz.eat("pollen");
        Animal[] animals={tigger, pooh, rarity, gemma, buzz};
        Zookeeper zoebot = new Zookeeper("zoebot");
        zoebot.feedAnimals(animals, "rice");

    }

}
