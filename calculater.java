public class calculater {
    
    double firstNum;
    double secondNum;
    char sign;

    public calculater(double firstNum, double secondNum, char sign) {
        this.firstNum = firstNum;
        this.secondNum = secondNum;
        this.sign = sign;
    }

    public double add() {
        return firstNum+secondNum;
    }

    public double subtract() {
        return firstNum-secondNum;
    }

    public double multiply() {
        return firstNum*secondNum;
    }

    public double divide() {
        return firstNum/secondNum;
    }

    
}
