/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package businessLogic;

/**
 *
 * @author Anabel
 */
public class Calculadora {
    
    public static float add(float a, float b)
    {
        return a+b;
    }
    
    public static float substract(float a, float b)
    {
        return a-b;
    }
    
    public static float multiply(float a, float b)
    {
        return a*b;
    }
    
    public static float div(float a, float b)
    {
        return a/b;
    }

    public static String back(String s){return s.length() > 0 ? s.substring(0, s.length() - 1): s;}

    public static float signo(float f){return f*-1;}

    public static String coma(String s){return s.length() > 0 && !(s.contains(".")) ? s + "." : s;}

    public static float mod(float a, float b){ return a%b;}

    public static float tenPow(double a){return (float) Math.pow(10, a);}

    public static float sqrt(double a){return (float) Math.sqrt(a);}

    public static float nFact(double a){ if(a <= 2){ return (float) a;} return (float) a * nFact(a-1); }

    public static float log(double a){ return (float) Math.log(a);}
}
