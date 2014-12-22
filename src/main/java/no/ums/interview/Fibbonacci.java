package no.ums.interview;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.LongStream;

/**
 * Tools to generate fibbonacci numbers.
 *
 * @author StÃ¥le Undheim <su@ums.no>
 */
public interface Fibbonacci {

    /**
     * Creates a stream of Fibonacci numbers.
     *
     * This should be an infinite stream starting at 1, 1, 2, 3, 5 and so on.
     *
     * Accessing numbers beyond {@link Long#MAX_VALUE} will result in random overflow variables being returned.
     *
     * @return a stream of fibonacci numbers
     */

    static LongStream stream() {
    	LongStream fib = LongStream.generate(new FibMaker());
    	return fib;
    }

    static LongStream evenFibbonacciNumbers() {
        return stream().filter((l) -> (l)%2 == 0);
    }

}
