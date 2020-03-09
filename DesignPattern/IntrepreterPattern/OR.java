package com.IntrepreterPattern.IntrepreterPattern;
class OR implements Expression  
{ 
    Expression expr1; 
    Expression expr2; 
  
    public OR(Expression expr1, Expression expr2)  
    { 
        this.expr1 = expr1; 
        this.expr2 = expr2; 
    } 
    public boolean interpreter(String con)  
    {         
        return expr1.interpreter(con) || expr2.interpreter(con); 
    } 
} 