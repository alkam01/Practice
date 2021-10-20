package javaRush;

import java.util.ArrayList;
import java.util.List;

public class Solution {

//        public static void main(String[] args) {
//            Window window = new Window();
//            window.printSize();
//            window.changeSize(4, 5);
//            window.printSize();
//        }
//public static void main(String[] args) {
//    Scanner console = new Scanner(System.in);
//    String line = console.nextLine();
//    String result = line.toLowerCase();
//    System.out.println(result);
//}
//
//    public static int salary;
//
//    public static void add(int increase) {
//        salary = Solution.salary;
//        salary += increase;
//    }
//    public static void main(String[] args) {
//        add(100501);
//        System.out.println(salary);
//    }

//    public List<String> students;
//
//    public Solution() {
//        students = new ArrayList<>();
//        students.add("Сергей Фрединский");
//        students.add("Виталий Правдивый");
//        students.add("Максим Козыменко");
//        students.add("Наталия Андрющенко");
//        students.add("Ира Величенко");
//        students.add("Николай Соболев");
//        students.add("Снежана Слободенюк");
//    }
//
//    public void exclude(String excludedStudent) {
//        List<String> copy = new ArrayList<>(students);
//        for (String student : copy) {
//            if (student.equals(excludedStudent)) {
//                students.remove(student);
//            }
//        }
//    }
//
//    public static void main(String[] args) {
//        Solution universityGroup = new Solution();
//        universityGroup.exclude("Виталий Правдивый");
//        universityGroup.students.forEach(System.out::println);
//    }

//    private final String[] students = new String[30];
//    public void addStudent(String student) {
//        int i = 0;
//        for (; i < students.length; i++) {
//            if (students[i] == null) {
//                break;
//            }
//        }
//        students[i] = student;
//    }
//    public void printStudents() {
//        for (String student : students) {
//            if (student != null) {
//                System.out.println(student);
//            }
//        }
//    }
//    public static void main(String[] args) {
//        //напишите тут ваш код
//        Solution sol = new Solution();
//        sol.addStudent("Максим Федоренко");
//        sol.addStudent("Олег Кесарчук");
//        sol.printStudents();
//    }
//public static void main(String[] args) {
//    Student student = new Student("Амиго");
//    System.out.println(student.name);
//}
//public static void main(String[] args) {
//    String numberStr = "147852369";
//
//    for (char symbol : numberStr.toCharArray()) {
//        System.out.print(digitToText(symbol));
//        System.out.print(" ");
//    }
//    System.out.println();
//}
//
//    public static String digitToText(char digit) {
//        String result = "";
//        switch (digit) {
//            case '0':
//                result = "ноль";
//                break;
//            case '1':
//                result = "один";
//                break;
//            case '2':
//                result = "два";
//                break;
//            case '3':
//                result = "три";
//                break;
//            case '4':
//                result = "четыре";
//                break;
//            case '5':
//                result = "пять";
//                break;
//            case '6':
//                result = "шесть";
//                break;
//            case '7':
//                result = "семь";
//                break;
//            case '8':
//                result = "восемь";
//                break;
//            case '9':
//                result = "девять";
//                break;
//        }
//        return result;
//    }
}
