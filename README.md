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

### Design
Most important things in software design...
1. __It works.__ If it doesn't work then there's no point in it being there
2. __Clearly communicates its intent.__ You shouldn't have to read anything other than 
the code to know what it is for. Write code for the problem - use language appropriate 
to the problem you are solving. E.g. In a train seat reservation service use names like
`Passenger` rather than `User`, `Seat` rather than `Place`, `reserve()` rather than 
`allocate()`. Use the words already in the requirements - you should be able to read it 
like a sentence, it should tell a story.
3. __Low in duplication.__ When you see something duplicated for the 3rd time, it 
should be extracted out into it's own reusable code. **D**on't **R**epeat **Y**ourself 
unless repeating yourself makes the code a lot easier to understand.
4. __Simple as possible.__ Don't write anything before it's required **Y**ou 
**A**in't **G**onna **N**eed **I**t
5. __Single responsibility.__ They do one job and make anything else _somebody else's problem_
6. __Tell don't ask.__ _Feature envy_ is when a method in one class has an unhealthy use of 
features in another class. It implies this method is in the wrong place.
    ```
    class CarpetQuote:
    method CalcAreaOfCarpet(){
        room.getWidth * room.getLength;
    }
    ```
    should instead be
    ```
    class CarpetQuote:
    method CalcAreaOfCarpet(){
        room.CalcAreaOfRoom();
    }
    ```
    This is a good example of _Somebody else's Problem_ instead of _Feature Envy_. Another 
    advantage of doing this means that now you can have a room of a different shape. It no 
    longer matters to `CarpetQuote` it's all `Room`'s problem.
    As soon as you change your code, it is like Schrodinger's code. It both passes and 
    fails all tests. The only way you can know is by running the tests again. 
7. __Swappable dependencies.__ A class that uses another object shouldn't care about 
implementation of that object. Dependency injection allows this and allows mocking too.
8. __Client specific interfaces.__ This allows you to only expose to a client the parts that
they care about. It allows you to hide things that don't need to be seen by a client so they 
are not affected by changes to things they are not using.


# Exersises
## Fibonacci

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

## Rock paper scissors
Write a rock paper scissors game but whenever the codes are red, you must make them green within a 60 second timer.
If at the end of the timer the codes do not pass, you must revert to your previous commit when it was green

- write a test that fails
- get test to pass
- refactor
- move on to next test
- avoid repeated tests by parameterising
- only create methods, classes, parameters when you need to
- get back to working code as quickly as possible

## Humpty Dumpty
Try to write humpty dumpty as code. It should be easily readable. It should actually do 
something

## Stock Manager
__Buy CD__
1. /payment accepted and CD in stock
2. /payment rejected
3. /not in stock
4. /neither

__Search for CD__
1. In catalogue
2. Not in catalogue

__Receieve CDs__
1. Already in catalogue
2. Add to catalogue
3. Multiple titles

__Review CD__
1. Rating
2. Leave text review