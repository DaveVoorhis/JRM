Example of using pipelining to implement relational operators.  

Each operator entirely consumes as few of its operands' tuples as is necessary
to return the next tuple in the result.  In effect, tuples are streamed
from one operator to the next.

This approach uses anonymous classes with an overridden Tuple getNext() 
operator.