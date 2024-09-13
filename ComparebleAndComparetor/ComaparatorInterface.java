import java.util.Comparator;

public  class ComaparatorInterface implements Comparator<Emp> {

    @Override
    public int compare(Emp o1, Emp o2) {
        return o2.getId() - o1.getId();
    }
    
}
