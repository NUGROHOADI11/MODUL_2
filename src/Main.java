import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> Hewan = new ArrayList<String>(Arrays.asList("Sapi", "Kelinci", "Kambing", "Unta", "Domba"));

        ArrayList<String> DeleteHewan = new ArrayList<String>(Arrays.asList("Kelinci", "Kambing", "Unta"));

        System.out.println(Hewan);
        System.out.println(DeleteHewan);
        Hewan.removeAll(DeleteHewan);
        System.out.println(Hewan);
    }
}
