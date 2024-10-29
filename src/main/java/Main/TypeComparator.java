package Main;

import java.util.Comparator;

public class TypeComparator implements Comparator<PetsLab> {
    @Override
    public int compare(PetsLab o1, PetsLab o2) {
        int typeComparison = o1.getClass().getSimpleName().compareTo(o2.getClass().getSimpleName());

        if (typeComparison == 0){
            return o1.getName().compareTo(o2.getName());
        }else{
            return typeComparison;
        }
    }
}
