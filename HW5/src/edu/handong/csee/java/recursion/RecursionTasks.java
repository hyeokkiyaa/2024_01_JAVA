package edu.handong.csee.java.recursion;

/**
 * This class contains various recursive methods for different tasks.
 */
public class RecursionTasks {
    /**Constructor for RecursionTasks class */
    RecursionTasks(){

    }
    /** Task Name */
    private String taskName;
    /** input string from args */
    private String[] inputArgs = new String[2];
    /** change input to string for some methods */
    private String inputForString = "";
    /** change input to Integer for some methods */
    private int inputForIntegerFunction = 0;
    /** result to store */
    private String result;

    /**
     * Gets the input parameter for methods that require a string input.
     * 
     * @return the input parameter as a string
     */
    public String getInputForString() {
        return inputForString;
    }

    /**
     * Gets the input parameter for methods that require an integer input.
     * 
     * @return the input parameter as an integer
     */
    public int getInputForIntegerFunction() {
        return inputForIntegerFunction;
    }

    /**
     * Sets the input parameter for methods that require a string input.
     * 
     * @param inputForString the input parameter as a string
     */
    public void setInputForString(String inputForString) {
        this.inputForString = inputForString;
    }

    /**
     * Sets the input parameter for methods that require an integer input.
     * 
     * @param inputForIntegerFunction the input parameter as an integer
     */
    public void setInputForIntegerFunction(int inputForIntegerFunction) {
        this.inputForIntegerFunction = inputForIntegerFunction;
    }

    /**
 * Set the task name.
 * 
 * @param taskName the task name to set
 */
public void setTaskName(String taskName) {
    if(this.taskName == null || this.taskName.isEmpty()) {
        this.taskName = taskName;
    } else {
        System.out.println("Task name is already set."); // 또는 예외를 던지는 것도 가능
    }
}


    /**
     * Set the input parameters.
     * 
     * @param args the input parameters
     */
    public void setInputArgs(String[] args) {
        taskName = getTaskName();
        switch (taskName) {
            case "factorial":
            case "bunnyEars":
            case "decimal2binary":
                inputForIntegerFunction = Integer.parseInt(args[1]);
                break;
            case "countHi":
            case "changePi":
            case "endX":
            case "stringClean":
            case "decodeString":
            case "parseBoolExpr":
                inputForString = args[1];
                break;
            case "strDist":
                inputArgs[0] = args[1];
                inputArgs[1] = args[2];
                break;

            default:
                System.out.println("Function name does not exist");
                System.exit(0);
        }
    }

    /**
     * Set the result.
     * 
     * @param result the result to set
     */
    public void setResult(String result) {
        this.result = result;
    }

    /**
     * Get the task name.
     * 
     * @return the task name
     */
    public String getTaskName() {
        return taskName;
    }

    /**
     * Get the input parameters.
     * 
     * @return the input parameters
     */
    public String[] getInputArgs() {
        return inputArgs.clone();
    }

    /**
     * Get the result.
     * 
     * @return the result
     */
    public String getResult() {
        return result;
    }

    /**
     * Perform computation based on the task.
     */
    public void compute() {
        result = "The result of " + taskName + " is ";
        switch (taskName) {
            case "factorial":
                result += Integer.toString(factorial(inputForIntegerFunction)) + ".";
                break;
            case "bunnyEars":
                result += Integer.toString(bunnyEars(inputForIntegerFunction)) + ".";
                break;
            case "decimal2binary":
                result += decimal2binary(inputForIntegerFunction) + ".";
                break;
            case "countHi":
                result += Integer.toString(countHi(inputForString)) + ".";
                break;
            case "changePi":
                result += changePi(inputForString) + ".";
                break;
            case "endX":
                result += endX(inputForString) + ".";
                break;
            case "stringClean":
                result += stringClean(inputForString) + ".";
                break;
            case "decodeString":
                result += decodeString(inputForString) + ".";
                break;
            case "parseBoolExpr":
                result += Boolean.toString(parseBoolExpr(inputForString)) + ".";
                break;
            case "strDist":
                result += Integer.toString(strDist(inputArgs)) + ".";
                break;
        }
    }

    /**
     * Compute the factorial of a number.
     * 
     * @param num the number to compute factorial for
     * @return the factorial of the number
     */
    public int factorial(int num) {
        if (num == 1 || num == 0) {
            return 1;
        } else {
            return num * factorial(num - 1);
        }
    }

    /**
     * Count the number of ears in a bunny.
     * 
     * @param num the number of bunnies
     * @return the total number of ears
     */
    public int bunnyEars(int num) {
        if (num == 0) {
            return 0;
        } else {
            if (num % 2 == 0) {
                return 3 + bunnyEars(num - 1);
            } else {
                return 2 + bunnyEars(num - 1);
            }
        }
    }

    /**
     * Count the number of occurrences of "hi" in a string.
     * 
     * @param text the input string
     * @return the number of occurrences of "hi"
     */
    public int countHi(String text) {
        if (text.length() < 2) {
            return 0;
        } else {
            int index = -1;
            for (int i = 0; i < text.length(); i++) {
                if (text.charAt(i) == 'h') {
                    if (i + 1 < text.length() && text.charAt(i + 1) == 'i') {
                        i++;
                        index = i;
                        break;
                    }
                }
            }
            if (index == -1) {
                return 0 + countHi(text.substring(1));
            } else {
                return 1 + countHi(text.substring(index));
            }
        }
    }

    /**
     * Replace occurrences of "pi" with "3.14" in a string.
     * 
     * @param text the input string
     * @return the string with "pi" replaced
     */
    public String changePi(String text) {
        // Help from AI
        if (text.length() < 2) {
            return text;
        } else {
            for (int i = 0; i < text.length() - 1; i++) {
                if (text.charAt(i) == 'p' && text.charAt(i + 1) == 'i') {
                    return text.substring(0, i) + "3.14" + changePi(text.substring(i + 2));
                }
            }
            return text.charAt(0) + changePi(text.substring(1));
        }

    }

    /**
     * Move all 'x' characters to the end of the string.
     * 
     * @param text the input string
     * @return the modified string
     */
    public String endX(String text) {
        if (text.length() < 2) {
            return text;
        } else {
            for (int i = 0; i < text.length() - 1; i++) {
                if (text.charAt(i) == 'x') {
                    return text.substring(0, i) + endX(text.substring(i + 1)) + 'x';
                }
            }
            return text.charAt(0) + endX(text.substring(1));
        }
    }

    /**
     * Remove adjacent duplicate characters from the string.
     * 
     * @param text the input string
     * @return the string with adjacent duplicates removed
     */
    public String stringClean(String text) {
        if (text.isEmpty() || text.length() == 1) {
            return text;
        }
        if (text.charAt(0) == text.charAt(1)) {
            return stringClean(text.substring(1));
        } else {
            return text.charAt(0) + stringClean(text.substring(1));
        }
    }

    /**
     * Calculate the maximum substring length for which the substring appears at
     * both ends of the string.
     * 
     * @param text the input string array
     * @return the maximum substring length
     */
    public int strDist(String[] text) {
        // Help from AI
        String first = text[0];
        String sub = text[1];
        if (first.isEmpty()) {
            return 0;
        } else if (sub.isEmpty()) {
            return first.length();
        }

        String comparefirst = first.substring(0, sub.length());
        String comparelast = first.substring(first.length() - sub.length());
        if (comparefirst.equals(sub) && comparelast.equals(sub)) {
            return first.length();
        }

        if (!comparefirst.equals(sub)) {
            first = first.substring(1);
            text[0] = first;
            return strDist(text);
        } else {
            first = first.substring(0, first.length() - 1);
            text[0] = first;
            return strDist(text);
        }
    }

    /**
     * Convert a decimal number to binary.
     * 
     * @param num the decimal number
     * @return the binary representation of the number
     */
    public String decimal2binary(int num) {
        if (num == 0) {
            return Integer.toString(num);
        }
        int AddToResult = num / 2;
        if (AddToResult == 0) {
            return Integer.toString(num % 2);
        }
        int result = num % 2;
        return decimal2binary(AddToResult) + Integer.toString(result);
    }

    /**
     * Decode a string encoded with a certain pattern.
     * 
     * @param text the encoded string
     * @return the decoded string
     */
    public String decodeString(String text) {
        // Help from AI
        if (text.isEmpty()) {
            return "";
        }

        String result = "";
        int num = 0;
        int i = 0;

        while (i < text.length()) {
            char ch = text.charAt(i);

            if (Character.isDigit(ch)) {
                num = num * 10 + (ch - '0');
            } else if (ch == '[') {
                int j = i + 1;
                int bracketCount = 1;
                while (bracketCount != 0) {
                    if (text.charAt(j) == '[') {
                        bracketCount++;
                    } else if (text.charAt(j) == ']') {
                        bracketCount--;
                    }
                    j++;
                }
                String decodedString = decodeString(text.substring(i + 1, j - 1));
                for (int k = 0; k < num; k++) {
                    result += decodedString;
                }
                num = 0;
                i = j - 1;
            } else {
                result += Character.toString(ch);
            }

            i++;
        }

        return result;
    }

    /**
     * Parse a boolean expression represented as a string.
     * 
     * @param text the boolean expression string
     * @return the result of the boolean expression
     */
    public boolean parseBoolExpr(String text) {
        // Help from AI
        char op = text.charAt(0);
        if (text.equals("t"))
            return true;
        if (text.equals("f"))
            return false;
        if (op == '!')
            return !parseBoolExpr(text.substring(2, text.length() - 1));

        boolean result = (op == '&');
        int count = 0, start = 2;
        for (int i = 2; i < text.length() - 1; i++) {
            if (text.charAt(i) == '(')
                count++;
            if (text.charAt(i) == ')')
                count--;
            if (count == 0 && text.charAt(i) == ',') {
                if (start < i) {
                    boolean subResult = parseBoolExpr(text.substring(start, i));
                    if (result && !subResult)
                        return false;
                    if (!result && subResult)
                        return true;
                }
                start = i + 1;
            }
        }
        if (start < text.length() - 1) {
            boolean subResult = parseBoolExpr(text.substring(start, text.length() - 1));
            if (result && !subResult)
                return false;
            if (!result && subResult)
                return true;
        }
        return result;
    }
}
