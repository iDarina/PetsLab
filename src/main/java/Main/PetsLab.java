package Main;

public class PetsLab implements Comparable<PetsLab> {
    private String name;

    // конструктор
    public PetsLab(String petName) {
        this.name = petName;
    }

    public String makeSound() {
        return "Pets make sounds";
    }

    public String getName() {
        return name;
    }



    @Override
    public int compareTo(PetsLab pet) {
        //Compare by name
        int nameComparison = this.name.compareTo(pet.name);

        //If names are equal compare by class name
        if (nameComparison == 0){
            return this.getClass().getSimpleName().compareTo(pet.getClass().getSimpleName());
        } else {
            return nameComparison;
        }
    }

}
