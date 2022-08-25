
class Animal {
    // protected:
    protected String name;;
    // public:
    public Animal() {}
    public Animal(String  tname) {
	name = tname;
    }
    public void speak() {}
    public void song() {
        System.out.println(name + "'s Song ");
	speak();
        System.out.println("la la la la");
	speak();
        System.out.println("la la la la");
	speak();
        System.out.println("=====================");
    }
}
class Cat extends  Animal {
    //  public:
    public Cat() {}
    public Cat(String tname) {
        super(tname);
    }
    public void speak() {
	System.out.println("Meow... Meow...");
    }
}
class Dog extends Animal {
    // public:
    public Dog() {}
    public Dog(String tname) {
       super(tname); 
    }
    public void speak() {
        System.out.println("Bow... Bow...");
    }
}
class Cow extends Animal {
    // public:
    public Cow() {}
    public Cow(String tname) {
        super(tname);
    }
    public void speak() {
	System.out.println("Moo... Moo...");
    }
}
class AnimalApp {
    public static void main(String args[]) {
	Animal ani[] = new Animal[4];
	ani[0] = new Cat("Micky the Cat");
	ani[1] = new Dog("Rover the Dog");
	ani[2] = new Cow("Roo the Cow");
	ani[3] = new Animal("No name");
	for (int r=0;r<4; r++)
	    ani[r].song();

    }	
}
