## Prime Factor Kata in Java by Robert C. Martin
http://butunclebob.com/ArticleS.UncleBob.ThePrimeFactorsKata

### Divided into seven Test steps

#### Requirements
- create new Maven-Java project in IntelliJ named PrimeFactors
- groupId is de.michael.kata
- create a package named primeFactors

#### Test One
- write a class named PrimeFactors
- create the generate method that takes an integer argument and returns the list of prime factors in numerical sequence
- create a unit test named PrimeFactorsTest based on jUnit 3 with massterclass junit.framework.TestCase
- write unit test for the outcome of "generate(1)"
- as we expect to have a list of rime factors, write a test method list returning a List of integers

#### Test Two
- write unit test for the outcome of "generate(2)"
- allow test method list() to have none or multiple arguments (use "int... ints")
- in list() add a for loop
- in generate define the variable "primes" as ArrayList<Integer> and add 2. 

#### Test Three
- write unit test for the outcome of "generate(3)"
- in generate replace the adding of 2 by "n" 

#### Test Four
- write unit test for the outcome of "generate(4)"
- add an if(n%2==0) statement and add 2 to primes and apply 'n /= 2" 

#### Test Five
- write unit test for the outcome of "generate(6)"
- no further changes needed

#### Test Six
- write unit test for the outcome of "generate(8)"
- as the number 8 has multiple time 2 as prime factor it is necessary to replace if(n%2==0) by while(n%2==0)
- as we are using three times the number 2, replace it with "int candidate = 2;"

#### Test Seven
- write unit test for the outcome of "generate(9)"
- in method generate
  - take second if(n>1) clause out of the first. we can't delete it completely as it is necessary to have it for the former tests
  - take declaration of candidate out of the loops
  - realize that there can be more than one occurrences of prime factors like two and three and so on
  - that is why the first if(n>1) needs to be replaced by while(n>1) together with candidate++

##### Refactoring
- Now that we have a while(n>1) loop we do not need the other if(n>1) clause.
- Replace inner while loop with a for loop using "n%candidate==0" as condition and "n/=candidate" as iterator
- Replace other while loop with a for loop using "int candidate=2" as initialization, "n>1" as condition and "candidate++" as iterator.