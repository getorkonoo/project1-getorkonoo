Project 1   
Assigned: Friday, January 28, 2022  
Due: Thursday, February 10, 2022, at the beginning of class  

Based on user inputs for mortgage amount, number of years and interest rate, calculate the monthly mortgage, the accumulated mortgage payments, and the accumulated interest payments as a percentage of the mortgage amount. Interests are compounded monthly. 

Your program should accept 3 inputs from the user: 
1. A mortgage amount, a double 
2. An interest rate, a double 
3. A number of years, an int 

Note: You can assume that the user will enter data that complies with the data types above.   
1. Calculate the monthly mortgage payment for the interest rate input by the user   
2. Calculate the monthly mortgage payment for the interest rate input by the user – 1%; for example, if the user enters 0.05, this is 4% (5% - 1%)   
3. Calculate the monthly mortgage payment for the interest rate input by the user + 1%; for example, if the user enters 0.05, this is 6% (5% + 1%)
4. Calculate the total payments 
5. Calculate the total interest payments as a percentage of the original mortgage amount 

Output (1), (2), (3) and (4) in **currency format** ($ sign in front of it and 2 digits only after the decimal point; example: $1024.56) using either NumberFormat or DecimalFormat.  
Output (5) in **% format** (example: 56%) using either NumberFormat or DecimalFormat.  
You need to use either the NumberFormat or DecimalFormat class for the above.  
Your program should include appropriate comments (including at the top, your name, date created and date last updated), variables should have proper names, and style should be good (spacing, indentation, ..). You need to use at least one constant, the number of months per year.  
Grading (100 points):  
* Variable names and constant(s): 8 points  
* Style: 8 points  
* Comments: 8 points  
* Correctness: 76 points  
* Extra Credit (10 points): In addition to the above, using a loop, output a table (it should look clean and easy to read) as follows:  
  * 4 columns: headers are: 10 15 30 and the year input by the user.  
  * 5 rows: headers: <interest rate -1%>, <interest rate – 0.5%>, <interest rate>, <interest rate + 0.5%>, <interest rate + 1%>. For example, if the user input 0.04 for the interest rate, your row headers should be 3%, 3.5%, 4%, 4.5%, and 5%.  
  * Fill the 20 cells of the table with the correctly calculated monthly mortgage payment.  

**Testing**:  
You should test that your program produces the correct results. 
For example, a $100,000 mortgage at 5% interest rate for 30 years will translate into a monthly payment of $536.82.  

**Submission Details**:  
You should have only one class. You should write your program from scratch.  
Name your class MortgageFirstLastName (for example, I would name my class MortgageHerveFranceschi). Submit the Java source code (.java file) on Moodle.  
1. GitHub: Completed .java file (including comments).  
2. Moodle: Same as above.  
