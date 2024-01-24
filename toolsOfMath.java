

public class toolsOfMath {
    int x;
    int y;

    public toolsOfMath(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getMultiplication() {
        return this.x * this.y;
    }

    public toolsOfMath additionOfTwoObjects(toolsOfMath other) {
        toolsOfMath toReturn = new toolsOfMath(1, 1);
        toReturn.x = this.x + other.x;
        toReturn.y = this.y + other.y;

        return toReturn;
        
    }
}

