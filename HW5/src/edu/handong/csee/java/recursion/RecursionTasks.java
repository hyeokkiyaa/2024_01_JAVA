package edu.handong.csee.java.recursion;

public class RecursionTasks {
    private String taskName;
    private String[] input = new String[3];
    private String inputForString = "";
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
                inputForString = args[1];
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
                result = Integer.toString(bunnyEars(inputForIntegerFunction));
                break;
            case "DECIMAL2BINARY":

                break;
            case "COUNTHI":
                result = Integer.toString(countHi(inputForString));
                break;
            case "CHANGEPI":
                result = changePi(inputForString);
                break;
            case "ENDX":
                result = endX(inputForString);
                break;
            case "STRINGCLEAN":
                result = stringClean(inputForString);
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

    public String changePi(String text) {
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

    public String stringClean(String text) {
        if (text.length() < 2) {
            return text;
        } else {
            int i = 0;
            while (i < text.length() - 1) {
                int shift = 0;
                while (i + shift < text.length() - 1 && text.charAt(i + shift) == text.charAt(i + 1 + shift)) {
                    shift++;
                }
                i += shift;
                if (shift != 0) {
                    if (i + 1 < text.length()) {
                        return text.charAt(i) + stringClean(text.substring(i + 1));
                    } else {
                        return Character.toString(text.charAt(i));
                    }
                }
                i++;
            }
            return text.charAt(0) + stringClean(text.substring(1));
        }
    }
    
}
