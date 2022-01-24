import java.util.Stack;

class Main {
    public static void main(String[] args) {

        Stack<String> animals = new Stack<>();

        animals.push("cow");
        animals.push("tiger");
        animals.push("lion");
        System.out.println("Stack: " + animals);

        animals.pop();
        System.out.println("Stack after pop: " + animals);
    }
}