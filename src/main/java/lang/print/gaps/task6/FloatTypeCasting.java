package lang.print.gaps.task6;

public class FloatTypeCasting {
    public void roundNumber(float numberToBeRounded) {
        int rounded = Math.round(numberToBeRounded);
        System.out.println(rounded);
    }
    public static void main(String[] args) {
        FloatTypeCasting casting = new FloatTypeCasting();
        casting.roundNumber (7.2f);


    }
}

// You will be given a float number, and your task will be to find a correct way to round this variable to integer variable, corresponding to Math rules (requires googling). Print that variable to console. Implement program inside a code snippet given below:
// where float numberToBeRounded - is the variable which needs to be rounded.