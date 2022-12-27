public class MyFirstProgram {

    static double result;

    static void calc1(double param1, double param2, String operation) {

        switch (operation) {
            case "+":
                result = param1 + param2;
                System.out.println("Результат операции: " + operation + " равен: " + result);
                break;
            case "-":
                result = param1 - param2;
                System.out.println("Результат операции: " + operation + " равен: " + result);
                break;
            case "*":
                result = param1 * param2;
                System.out.println("Результат операции: " + operation + " равен: " + result);
                break;
            case "/":
                result = param1 / param2;
                System.out.println("Результат операции: " + operation + " равен: " + result);
                break;
            default:
                System.out.println("Извините, такой операции нет");
        }
    }


    static void calc2(double param1, double param2, String operation) {

        if (operation == "+") {
            result = param1 + param2;
            System.out.println("Результат операции: " + operation + " равен: " + result);
        } else if (operation == "-") {
            result = param1 - param2;
            System.out.println("Результат операции: " + operation + " равен: " + result);
        } else if (operation == "/") {
            result = param1 / param2;
            System.out.println("Результат операции: " + operation + " равен: " + result);
        } else if (operation == "*") {
            result = param1 * param2;
            System.out.println("Результат операции: " + operation + " равен: " + result);
        } else {
            System.out.println("Извините, такой операции нет");
        }
    }


    public static void main(String[] args) {
        calc1(18, 3, "+");
        calc1(18, 3, "-");
        calc1(18, 3, "/");
        calc1(18, 3, "*");
        calc1(18, 3, "%");

        calc2(9, 3, "+");
        calc2(9, 3, "-");
        calc2(9, 3, "/");
        calc2(9, 3, "*");
        calc2(9, 3, "%");
    }
}
