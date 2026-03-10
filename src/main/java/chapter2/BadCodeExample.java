package main.java.chapter2;

import java.util.ArrayList;
import java.util.List;

public class BadCodeExample {

    int d; // elapsed time in days

    public List<int[]> getThem() {
        List<int[]> list1 = new ArrayList<>();
        for (int[] x : theList)
            if (x[0] == 4)
                list1.add(x);
        return list1;
    }
}
