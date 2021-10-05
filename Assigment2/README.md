### BowlingGame is a Java Projekt (intellij)

### StringUtility is a C# Projekt (Visual Studio)


## 1.1 COMPUTER MOUSE

### Identify the types of testing you would perform on a computer mouse, to make sure that it is of the highest quality.

Check if the sensor is good by moving the mouse across the mouse-pad. 
Pressing the buttons a bunch of times to see if it registers the presses.
Gripping the mouse hard and see if the build is robust and good. 
And last see how smooth the scroll wheel is.

## 1.2 CATASTROPHIC FAILURE

## Find a story where a software system defect had a bad outcome. Describe what happened. Can you identify a test that would have prevented it?

Idk if this is relavant.
When I was in internship. I had to code in Excel VBA and had to fetch large amounts of data. 
long story short, VBA 2016 did not like all of that data and would crash Excel every 2 hours. 
(no garbage collection, and no way of adding it)
and i dont think test could have fix the problem.


Investigate JUnit 5 (Jupiter). Explain the following, and how they are useful.

 -@Tag  :used to filter or "naming" the test/method, could be smart to describe a long-named method to something simpler.
 
 
 -@Disabled  :Used to disable a test, grate for temporarily avoiding red tests.
 
 
 -@RepeatedTest  :it repeads a test x amount of times.
 
 
 -@BeforeEach, @AfterEach  :make code or "whatever" runs it befor the test. if you use the same arrange for more than one test, use a BeforeEach to with the line of code once.
 
 
 -@BeforeAll, @AfterAll  :again abit like the one above. 
 
 
 -@DisplayName  :Displayes a custom name for a test.
 
 
 -@Nested  :for grouping test together that have a relationship among several groups of tests 
 
 
 -assumeFalse, assumeTrue  
 
 
Mocking frameworks

• What are their similarities?

 I choose the frameworks Mockito and EasyMock, they are both really similar do to the fact that Mockito's first "hacks" was made on top of Easymock code.
 
• What are their differences?

The syntax is very similar with slight variations. Easymock you need to be more specific of what you expect as an outcome. ("more code").

• Which one would you prefer, if any, and why?

since they or so similar, I would mind on over the other, but if I had to choose I would choose Mockito. do to the fact you can write "less" code and its extra support for stubbing.





