"#Workbook" 
Q 1a : Can you implement the sing() method for the bird?

Answer: No. There is no sing() method is implemented either in Animal or Bird class.
There is compile time issue. (The method sing() is undefined for the type Bird).

Q 1b :How did you optimize the code for maintainability?

Answer : As all subclasses is not required to have fly() and sing() behaviour so we move fly and sing methods from Bird class and make separate interfaces for fly() and sing().
As a result ,only the birds that are supposed to fly will implement that interface.

Q -2 : Now, we have 2 special kinds of birds: the Duck and the Chicken... Can you implement them to make their own special sound?

Answer for 2a,2b,2c: provided simulator class and unit test class for test the functionality.

Q -3 : Now how would you model a rooster?

Answer for 3a,3b,3c: provided simulator class and unit test class for test the functionality.

Q A-4d)How do you keep the parrot maintainable? What if we need another parrot lives near a Duck? Or near a phone that rings frequently?

Answer : We can keep 'Parrot' class maintainable using Composition (Has-A relationship) with abstraction(implementing interfaces).
Here the parrot has a relationship with cat,dog,rooster.

Q E: Can you share the code to count: a. how many of these animals can fly? b. how many of these animals can walk? c. how many of these animals can sing? d. how many of these animals can swim?

Answer : NOTE : Implementation done to count Animals which can fly, similarly count can be done for Animals which an swim etc.
 Test class implemented.
