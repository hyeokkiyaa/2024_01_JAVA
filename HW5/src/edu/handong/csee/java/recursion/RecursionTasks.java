package edu.handong.csee.java.recursion;


public class RecursionTasks {
    private String taskName;
    private String[] input = new String[3];
    private int inputForIntegerFunction = 0;
    private String result;

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public void setInput(String[] args) {
        taskName = getTaskName();
        switch (taskName) {
            case "FACTORIAL":
            case "BUNNYEARS":
            case "DECIMAL2BINARY":
                inputForIntegerFunction = Integer.parseInt(args[1]);
                break;
            case "COUNTHI":
            case "CHANGEPI":
            case "ENDX":
            case "STRINGCLEAN":
            case "DECIDESTRUBG":
            case "PARSEBOOLEXPR":
                input[0] = args[1];
                break;
            case "STRDIST":
                input[0] = args[1];
                input[1] = args[2];
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

    public void compute() {
        switch (taskName) {
            case "FACTORIAL":
                result = Integer.toString(factorial(inputForIntegerFunction));
                break;
            case "BUNNYEARS":
                break;
            case "DECIMAL2BINARY":
                break;
            case "COUNTHI":
                break;
            case "CHANGEPI":
                break;
            case "ENDX":
                break;
            case "STRINGCLEAN":
                break;
            case "DECIDESTRUBG":
                break;
            case "PARSEBOOLEXPR":
                break;
            case "STRDIST":
                break;
        }
    }

    public int factorial(int num) {
        if (num == 1) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }
}
