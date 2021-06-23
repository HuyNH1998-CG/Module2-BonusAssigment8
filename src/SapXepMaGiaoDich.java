import java.util.Comparator;

public class SapXepMaGiaoDich implements Comparator<GiaoDich> {
    @Override
    public int compare(GiaoDich o1, GiaoDich o2) {
        return o1.getMaGiaoDich().compareTo(o2.getMaGiaoDich());
    }

}
