import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> Hewan = new ArrayList<String>(Arrays.asList("Sapi", "Kelinci", "Kambing", "Unta", "Domba"));

        ArrayList<String> DeleteHewan = new ArrayList<String>(Arrays.asList("Kelinci", "Kambing", "Unta"));
        
        System.out.print("Animal names:");
        for (String print : Hewan) {
            System.out.print(print+ ",");
        }
        
        Hewan.removeAll(DeleteHewan);

        System.out.print("\nAnimals after removing: ");
        for (String print : Hewan) {
            System.out.print(print + ",");
        }
    }
}
