import java.util.Arrays;

public class ReferenceTrap {
    public static void main(String[] args) {
        String[] staffLastYear = { "Tommy", "Joel", "Ellie" };
        String[] staffThisYear = staffLastYear.clone();

        // for (int i = 0; i < staffLastYear.length; ++i) {
        // staffThisYear[i] = staffLastYear[i];
        // }

        staffThisYear[1] = "Abby";

        System.out.println(Arrays.toString(staffLastYear));
        System.out.println(Arrays.toString(staffThisYear));

    }
}
