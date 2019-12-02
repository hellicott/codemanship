# codemanship
Files created during codemanship TDD training
## Reading list
Test Driven Development: By Example _by Kent Beck_

Refactoring: Improving the design of existing code _by Martin Fowler_

## Notes
#### Tests
A test should only have one reason to fail. You should never have multiple assert 
statements. If you have multiple things to assert, you should have a set up method to 
do the shared code, but then separate tests for each assert statement.
#### Refactoring
You want to get the code to green in the safest, most atomic steps. After every single
refactoring step rerun the tests to ensure each step hasn't broken anything. 

You should be using version control to ensure that you can go back to the last thing 
that worked easily.


# Exersises
## Fibonacci
__Parameterised tests__

Use JUnitParams to make parameterised tests. This avoids code duplication in tests, as well as src

Try to write in this order:
- Name test
- Write assertion
- Then work backwards
- Only create things when the test requires it
  - When creating a method, make sure it returns the wrong thing
- When you get an assertion error do the simplest thing to make the test pass
- Once the test is passing, assess whether you're happy to keep the code as it is
  - If not - refactor!
- After any refactoring 
  - Run the tests to make sure you've not broken anything

## 
