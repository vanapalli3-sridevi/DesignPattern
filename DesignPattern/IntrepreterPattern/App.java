package com.IntrepreterPattern.IntrepreterPattern;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    { 
    	Expression person1 = new TerminalExpression("Deepika"); 
    Expression person2 = new TerminalExpression("Mani"); 
    Expression isSingle = new OR(person1, person2); 
      
    Expression lakshmi= new TerminalExpression("Lakshmi"); 
    Expression committed = new TerminalExpression("Committed"); 
    Expression isCommitted = new AND(lakshmi, committed);     

    System.out.println(isSingle.interpreter("Deepika")); 
    System.out.println(isSingle.interpreter("Mani")); 
    System.out.println(isSingle.interpreter("Kusu")); 
      
    System.out.println(isCommitted.interpreter("Committed, Laskhmi")); 
     
    }
}
