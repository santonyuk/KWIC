*Provide a brief technical summary to compare and contrast your two designs.*

*1. What criteria did you use to decompose the first design?*
<br />
The criteria to use to decompose the first design is to split the 
separate functions.

    
*2. What criteria did you use to decompose the second design?*
<br />
The criteria to use to decompose the second design is to split up the major functions into their own classes.
    
*3. Which design is more resilient to change? And why?*
<br />
The second design is much more resilient to change. The whole program will not be affected by updating one class.


*4. What would have to change in the first design/implementation if the file were changed out for a database?*
<br />
I would create methods to connect to the database.
    
*5. What would have to change in the second design/implementation if the file were changed out for a database?*
<br />
I would make similar changes as in the first design. Also a new LineIO class would need to be created to read from the 
database.
    
*6. What would have to change in the first vs second design/implementation if we wanted to use a graphical user interface 
instead of the traditional console UI (System.out)?*
<br />
I would need to create a controller and redirected the output through the controller.

    
*7. Identify another change that may happen in the future, and how does design 1 compare to design 2 when it comes to 
impact of the change?*
<br />
If changes needed to be added, such as added functionality, these changes would impact version 1 and 2 differently.
Changes into version 1 would ultimately create a god class but would be easy to understand. Changes to version 2 would 
would only impact one class, lineIO and additional classes can be added.
    
*8. Which design/implementation is easier to understand?*
<br />
Version 1 is easier to understand, but that may change as functions are added and the class grows.
    
*9. Which design/implementation is better performing?*
<br />
The versions are unfinished but version 2 would be better performing.
    
*10. How does the principle of information hiding relate to all of this?*
<br />
The principle of information hiding relates to all this because it allows the classes to be built without clearly showing exactly what is used
 so that different classes and data structures can be swapped out with others and not be affected.
