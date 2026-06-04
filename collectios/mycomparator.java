package collectios;

import java.util.Comparator;

public class mycomparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        employee emp1 = (employee) o1;
       employee emp2 = (employee) o2;
        if (emp1.getEid() > emp2.getEid())
            return 1;
        else if (emp1.getEid() < emp2.getEid())
            return -1;
        else
        return 0;
    }
}
