import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentReg thisYearReg = new StudentReg();
        String input;


        while (true) {
            input = scanner.nextLine();
            if (input.equals("end")) {
                break;
            }
            try {
                String[] inputArray = input.split(",");
                if (!thisYearReg.addStudent(new Student(inputArray[0].trim(), inputArray[1].trim(), Integer.parseInt(inputArray[2].trim())))) {
                    System.out.println("Студент с данным номером билета уже существует");
                } else {
                    System.out.println("Студент добавлен (вроде)");
                }
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Введены лишние или неполные данные");
            } catch (NumberFormatException e) {
                System.out.println("Некорректный ID студента");
            }

        }

        for (Student temp : thisYearReg.getStudents()) {
            System.out.println(temp);
        }


    }
}
