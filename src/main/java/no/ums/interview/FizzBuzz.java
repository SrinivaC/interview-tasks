package no.ums.interview;

import static java.util.stream.Collectors.joining;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * FizzBuzz generator.
 *
 * @author StÃ¥le Undheim <su@ums.no>
 */
public interface FizzBuzz {

    /**
     * Given an intStream, return a stream of strings following the FizzBuzz rules.
     *
     * Any number divisible by 3 should be replaced by Fizz.
     * Any number divisible by 5 should be replaced by Buzz.
     * Any number divisible by 15 should be replaced by FizzBuzz.
     * All other numbers as is.
     *
     * @param intStream source stream
     * @return FizzBuzzStream
     */
    static Stream<String> toFizzBuzzStream(IntStream intStream) {
    	return intStream
        .boxed()
        .map(x -> (x%3==0? "Fizz": "") + (x%5==0? "Buzz": "")+ ((x%3!=0)&&(x%5!=0)? x: ""));
    }


    
}
