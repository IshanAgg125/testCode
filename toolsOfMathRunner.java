
public class toolsOfMathRunner {

    public static void main(String[] args) {
        toolsOfMath tom = new toolsOfMath(6, 7);
        toolsOfMath tom2 = new toolsOfMath(9, 10);
        int x = tom.getMultiplication();
        toolsOfMath tom3 = tom.additionOfTwoObjects(tom2);
        System.out.println(tom3.x + " " + tom3.y);
        //System.out.println("answer = " + x);
    }

}


