package lesson_07.HomeWork7;



//Task 3 Распечатать 10 строк: “Task1”. “Task2”. … “Task10”. Используем цикл while


public class task3While {
    public static void main(String[] args) {

        int page = 1;
        while (page < 11){
            System.out.println("Task" + page);
            page++;

        }

    }
}
