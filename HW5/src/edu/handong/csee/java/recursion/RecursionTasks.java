package edu.handong.csee.java.recursion;

public class RecursionTasks {
    private String taskName;
    private String[] input;
    private int inputForIntegerFunction = 0;
    private String result;

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public void setInput(String[] inputMain) {
        setTaskName(inputMain[0]);
        switch (taskName) {
            case "FACTORIAL":
            case "BUNNYEARS":
            case "DECIMAL2BINARY":
                
                inputForIntegerFunction = Integer.parseInt(inputMain[1]);
                break;

            case "COUNTHI":
            case "CHANGEPI":
            case "ENDX":
            case "STRINGCLEAN":
            case "DECIDESTRUBG":
            case "PARSEBOOLEXPR":
                input[0] = inputMain[1];
                break;

            case "STRDIST":
                input[0] = inputMain[1];
                input[1] = inputMain[2];
                break;
            
            default:
                System.out.println("Function name does not exist");
                System.exit(0);
        }
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getTaskName() {
        return taskName;
    }

    public String[] getInput() {
        return input;
    }

    public String getResult() {
        return result;
    }

    public void compute(){
        switch (taskName) {
            case "FACTORIAL":
                result = Integer.toString(factorial(inputForIntegerFunction));
            case "BUNNYEARS":
            case "DECIMAL2BINARY":

                inputForIntegerFunction = Integer.parseInt(inputMain[1]);
                break;

            case "COUNTHI":
            case "CHANGEPI":
            case "ENDX":
            case "STRINGCLEAN":
            case "DECIDESTRUBG":
            case "PARSEBOOLEXPR":
                input[0] = inputMain[1];
                break;

            case "STRDIST":
                input[0] = inputMain[1];
                input[1] = inputMain[2];
                break;

            default:
                System.out.println("Function name does not exist");
                System.exit(0);
        }
        inputForIntegerFunction = 0;
    }

    public int factorial(int num) {

        return 0;
    }
}
