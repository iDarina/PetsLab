package Main;

public class PetsLab {
    String name;
// конструктор
    public PetsLab(String petName){
        this.name = petName;
    }

    public String makeSound(){
        return "Pets make sounds";
    }
}
