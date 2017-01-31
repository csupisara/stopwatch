# Stopwatch tasks by Supisara Chuthathumpitak (5910546457)

I ran the tasks on a MacBook Pro, and got these results:

Task														| Time
----------------------------------------|--------------------------:
Append 50,000 chars to String		|0.942719 sec
Append 100,000 chars to String		|3.025188 sec
Append 100,000 chars to StringBuilder	|0.002077 sec	
Add 1 billion double using array	|1.019434 sec	
Add 1 billion Double using array	|5.312840 sec
Add 1 billion BigDecimal using array	|8.548623 sec

## Explanation of Results

Why does appending 100,000 chars to a String take more than 2X the time to append 50,000 chars? 
Answer: Because each times we create the new String, it didn’t replace the old String with the new ones, but it make the new String and point to that one, so the times that it takes will be more than 2X. For examples, at first we have char ‘a’ and ‘b’ and if we want to put them together, we didn’t have just “ab” but we have ‘a’ ‘b’ and also “ab”.

Why is appending to StringBuilder so much different than appending to String? What is happening to the String?  Answer: Because appending to String will create the new String every times. StringBuilder having the array inside which have 16 index. When we appending more than the array index, it will automatically increase the index to be 2 times of the old index plus 2 more. So, it just creating the new array not the new String. This will consume less memory as well as less times.

Explain difference in time to sum double, Double, and BigDecimal. Which is faster and why?  Answer: The fastest is double, next one is Double and BigDecimal is the slowest. The reason is double can straightly add up and storing just a few decimal place, so it doesn’t use much memory and will be fast. Double is an object, so it need to change to double and then put it back again to be a Double, so it took so many processes. Moreover, Double have an attributes and methods which consume the memory, in which double not. For the BigDecimal, it also have a attributes and methods and the attributes are more than the Double object. Furthermore, BigDecimal will get the more accurate resulting number because it will get the exactly number(not rounding), this will make it use so much memory and use more times than the previous one.
