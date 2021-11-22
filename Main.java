import java.io.*;
import static java.lang.System.*;
import java.util.*;

class Main{
public static void main (String str1[]){

Scanner sc=new Scanner(System.in);

Book b = new Book("I am Malala", "Malala Yousafzai", 2013, 288, true);
System.out.println(b);
System.out.println();

Book b2 = new Book("I am Malala", "Malala Yousafzai", 1900, 100, false);

Book g = new Book("Ulysses", "James Joyce", 1922, 730, true);
System.out.println(g);
System.out.println();

/*
System.out.println("Numpages of Ulysses: "+g.getNumPages());
System.out.println("Is Malala hardcover: "+b.getHardcover());

System.out.println("Enter new number of pages for Malala.");
int mp=sc.nextInt();
b.setNumPages(mp);
System.out.println(b);
System.out.println();

Scanner sc2 = new Scanner(System.in);

System.out.println("Enter new author for Ulysses.");
String ah=sc2.nextLine();
g.setAuthor(ah);
System.out.println(g);
System.out.println();
*/

System.out.println("Are the books equal? "+b.equals(b2));
}
}


