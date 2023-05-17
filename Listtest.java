import java.util.ArrayList;

class ListOfAnimals{
    public ArrayList<String> createList(){
    ArrayList<String> animals=new ArrayList<>();
    animals.add("dog");
    animals.add("cat");
    return animals;
    }
    
}
public class Listtest{
public static void main(String args[]) {
    ListOfAnimals loOfAn=new ListOfAnimals();
    ArrayList<String> animals=loOfAn.createList();
    for(String animal:animals){
        System.out.println(animal);
    }
    
}
}
 