package com.tinkerpop.blueprints.pgm.impls;

import com.tinkerpop.blueprints.BaseTest;

import java.util.Arrays;
import java.util.List;

/**
 * @author Marko A. Rodriguez (http://markorodriguez.com)
 */
public class MultiIterableTest extends BaseTest {

    public void testBasicIterable() {
        MultiIterable<Integer> itty = new MultiIterable<Integer>((List) Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5), Arrays.asList(6, 7, 8)));
        int counter = 0;
        for (int i : itty) {
            counter++;
            assertEquals(counter, i);
        }
        assertEquals(counter, 8);
    }
}
