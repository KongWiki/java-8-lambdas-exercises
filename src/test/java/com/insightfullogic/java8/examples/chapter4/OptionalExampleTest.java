package com.insightfullogic.java8.examples.chapter4;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import org.junit.Test;

import java.util.Optional;

import static org.junit.Assert.*;

public class OptionalExampleTest {

    @Test
    public void examples() {
        // BEGIN value_creation
        Optional<String> a = Optional.of("a");
        assertEquals("a", a.get());
        // END value_creation

        // BEGIN is_present
        Optional emptyOptional = Optional.empty();
        Optional alsoEmpty = Optional.ofNullable(null);

        assertFalse(emptyOptional.isPresent());

        Optional empty = Optional.empty();
        System.out.println(empty.isPresent());
        Optional emptyTwo = Optional.ofNullable(null);

        // a is defined above
        assertTrue(a.isPresent());
        // END is_present

        // BEGIN orElse
        assertEquals("b", emptyOptional.orElse("b"));
        assertEquals("c", emptyOptional.orElseGet(() -> "c"));
        // END orElse
    }

    @Test
    public void test() {
        Set<Integer> numbers = new HashSet<>(Arrays.asList(4, 3, 2, 1, 0));
        List<Integer> collect = numbers.stream().collect(Collectors.toList());
        assertEquals(Arrays.asList(4, 3, 2, 1, 0), collect);
    }

}
