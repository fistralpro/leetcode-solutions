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



##Working on this Repo
__get the code__ (default branch is main)
```
git clone git@github.com:fistralpro/leetcode-solutions.git
cd leetcode-solutions
```  
or, __update current code__
```
cd leetcode-solutions
git checkout main
git pull
```

__create a feature branch and push it back for visibility__ (example branch feature/add-two-numbers)
```
git branch feature/add-two-numbers
git push origin feature/add-two-numbers
```

__do some code and commit your changes locally__ (we'll add all new files with .)
```
git add .
git commit -m "my description of work done"
```

__push your changes to the remote__
```
git push origin feature/add-two-numbers
```

On successful testing they will be merged to main and then main tagged.  The branch will then be deleted.
It is recommended you then pull down that change and delete your local branch.  
__see which branches have been deleted__
```
git fetch -p
```
__now lets delete our feature/add-two-numbers branch that is still local__
```
git branch -d feature/add-two-numbers
```

