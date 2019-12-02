# codemanship
Files created during codemanship TDD training

## Exersises
### Fibonacci
#### Technical Skills
- parameterised tests
  - Use JUnitParams to make parameterised tests. This avoids code duplication in tests, as well as src

#### Notes
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
