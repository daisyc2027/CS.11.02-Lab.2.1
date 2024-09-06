/**
*****************************************************************************************************
* By writing your name in the space provided below, you are honouring the CIS academic honesty pledge 
* “I have neither given nor received unauthorized aid on this piece of work.”
* NAME: DAISY CHEN
*****************************************************************************************************
*/

public class Main {

    public static void main(String[] args) {

    int firstMethod = add(5, 8);
    System.out.println(firstMethod);

    int secondMethod = add(1,2,3,4);
    System.out.println(secondMethod);

    String thirdMethod = morningGreeting("Mr. Ewing");
    System.out.println(thirdMethod);

    String fourthMethod = afternoonGreeting("Mr. Ewing");
    System.out.println(fourthMethod);

    String fifthMethod = triple("thegoogoodolls");
    System.out.println(fifthMethod);

    double sixthMethod = half(10);
    System.out.println(sixthMethod);

    double seventhMethod = roundPositiveValueToNearestInteger(13.2);
    System.out.println(seventhMethod);

    double eighthMethod = roundNegativeValueToNearestInteger(-4.6);
    System.out.println(eighthMethod);

    }
    // 1. add
    public static int add(int a, int b){
        return a + b;
    }
    // 2. add
    public static int add(int a, int b, int c, int d){
        return a + b + c + d;
    }
    // 3. morningGreeting
    public static String morningGreeting(String name){
        return "早上好, " + name +"!";
    }
    // 4. afternoonGreeting
    public static String afternoonGreeting(String name){
        return "下午好, " + name+"!";
    }
    // 5. triple
    public static String triple(String randomWord){
        return randomWord + randomWord + randomWord;
    }

    // 6. half
    public static double half(int a){
        return (double) a / 2;
    }
    // 7. roundPositiveValueToNearestInteger
    public static double roundPositiveValueToNearestInteger(double a){
        a += 0.5;
        return (int) a;
    }
    // 8. roundNegativeValueToNearestInteger
    public static double roundNegativeValueToNearestInteger(double a){
        a -= 0.5;
        return (int) a;
    }
}
