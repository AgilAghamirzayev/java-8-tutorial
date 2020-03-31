package lambda;

public class Work1 {
    public static void main(String[] args) {

        Work1 work1 = new Work1();

        MathOperation addition = Integer::sum; // (int a, int b) -> a + b;

        MathOperation subtraction = (a, b) -> a - b;

        MathOperation multiplication = (a, b) -> a * b;

        MathOperation division = (a, b) -> a / b;


        System.out.println(work1.operate(10,5,addition));
        System.out.println(work1.operate(10,5,subtraction));
        System.out.println(work1.operate(10,5,multiplication));
        System.out.println(work1.operate(10,5,division));

        GreetingService greetingService = message ->
                System.out.println("Hello " + message);

        GreetingService greetingService1 = System.out::println;

        greetingService.sayMessage("Aqil");
        greetingService1.sayMessage("Aqil_Zeka");

    }

    interface MathOperation{
        int operation(int a, int b);
    }

    interface GreetingService{
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a, b);
    }
}
