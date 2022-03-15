package com.mmurray;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class TwoSumTest {

    int[] goodTestArray = {5,4,3,2,1};
    int[] emptyArray = new int[]{};

    @Test
    @DisplayName("Adding two different numbers make target")
    void twoSum_two_numbers_in_nums_sum_to_target_returns_indices() {
        int[] sortedResult = TwoSum.twoSum(goodTestArray, 3);
        Arrays.sort(sortedResult);
        assertArrayEquals( new int[] {3,4}, sortedResult);
    }

    @Test
    @DisplayName("No two different numbers make target")
    void twoSum_two_numbers_in_nums_do_not_sum_to_target_returns_empty_array() {
        int[] sortedResult = TwoSum.twoSum(goodTestArray, 11);
        assertArrayEquals(emptyArray, sortedResult);
    }

    @Test
    @DisplayName("same number twice doesn't make target")
    void twoSum_use_number_in_array_twice_to_make_target_returns_empty_array() {
        int[] sortedResult = TwoSum.twoSum(goodTestArray, 10);
        assertArrayEquals(emptyArray, sortedResult);
    }

    @Test
    @DisplayName("array is null or empty  doesn't make target") // no throw in the
    void twoSum_null_array_to_make_target_returns_empty_array() {
        int[] sortedResult = TwoSum.twoSum(emptyArray, 10);
        assertArrayEquals(emptyArray, sortedResult);
    }

    @Test
    @DisplayName("single item in array doesn't make target")
    void twoSum_single_item_array_to_make_target_returns_empty_array() {
        int[] sortedResult = TwoSum.twoSum(new int[] {5}, 5);
        assertArrayEquals(emptyArray, sortedResult);
    }
}