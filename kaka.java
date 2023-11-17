pclasskaka { 

public static void main(String args[]) 

{ 

int x = 7, sum = 0;

do { // The line will be printed even 

// if the condition is false 

sum += x; 

x–;

} while (x > 0); 

System.out.println(“Sum: ” + sum); 

} 

}