package com.knubisoft.tasks.algorithm.pascaltriangle;

import java.util.List;

public interface PascalsTriangle {

    /**
     *  Triangle of pascal:
     *
     *  1
     *  1 1
     *  1 2 1
     *  1 3 3 1
     *  1 4 6 4 1
     *  etc
     *
     *  Input can be negative or 0 - return empty list
     *  Input can be 10.000 - optimize your algorithm
     *
     *  @return correct list with number for such line
     */
    List<Integer> calculateLineOfPascalsTriangle(int lineNumber);

}
