public class Iguana extends Animal{
    /**
     * A constructor that takes in a name.
     *@param name Name of the animal.
     */
    public Iguana(String name){
       super(name);
    }

    /**
     * a method that prints out the sound an Iguana makes.
     */
    public void sound(){
       System.out.println(this.name + " Hissssssses");
    }

    /**
     * a method that prints out what an Iguana does for fun.
     */
    public void play(){
       System.out.println(this.name + " swims in the water.");
    }

    /**
     * a method that prints out what an Iguana eats.
     * @override eat() method from Animal class.
     */
    public void eat(){
       System.out.println(this.name + " eats some fruits and foilage.");
    }
}
class Driver {
    public static void main(String[] args) {
        System.out.println();
        Iguana iguana = new Iguana("Iguana");
        iguana.sound();
        iguana.play();
        iguana.eat();
    }
}