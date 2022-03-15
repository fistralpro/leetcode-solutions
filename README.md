# Solutions to https://leetcode.com/problemset/all/
## Solution - and tests

In each class java file you will find the problem and a solution - there will be a corresponding unit test.  
You cannot build this as an application - hence no manifest and entry point.  

## Compile
Not applicable

## Run tests
We are using JUnit5 with junit-jupiter and maven-surefire-plugin  
Run all tests:
```
mvn test
```  
Run individual test
```
mvn -Dtest=TwoSumTest#twoSum_two_numbers_in_nums_sum_to_target_returns_indices test
```


## Data structure questions:  
_twoSum.java_

__twoSum.java__  
Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.  
You may assume that each input would have exactly one solution, and you may not use the same element twice.  
You can return the answer in any order.

<br />
<br />
<i>Unit testing guidance from Roy Osherove "The art of Unit Testing"</i>





