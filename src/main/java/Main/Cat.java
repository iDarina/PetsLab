package Main;

public class Cat extends PetsLab{

    public Cat(String petName){
        super(petName);
    }

    @Override
    public String makeSound(){
        return "Meow-meow";
    }
}
