import java.util.ArrayList;
import java.util.List;

public class MagazineLibrary {
    private List<Magazine> magazines;

    public MagazineLibrary() {
        this.magazines = new ArrayList<>();
    }

    public Magazine getMagazine(int index) {
        return new Magazine(this.magazines.get(index));
    }

    public void setMagazine(int index, Magazine magazine) {
        this.magazines.set(index, new Magazine(magazine));
    }

    public void addMagazine(Magazine magazine) {
        magazines.add(new Magazine(magazine));
    }
}
