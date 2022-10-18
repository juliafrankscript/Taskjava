public class Main {
    public static void main(String[] args) {
/*  Создать класс "Employee", имеющий:
        - конструктор, который принимает переменные salary, number of  employee's working hours в качестве параметров
        - следующие методы:
        addSalary() , который добавляет 10 евро к зарплате сотрудника если она меньше 500
         addWork() , добавляющий 5 евро к зарплате сотрудника если количество часов  больше 6.
        - создать несколько сотрудников и применить к ним методы */


        Employee e1 = new Employee(400,8);
        Employee e2 = new Employee(650,6);

        e1.addSalary();
        e1.addWork();
        e2.addSalary();
        e2.addWork();

        System.out.println(e1);
        System.out.println(e2);


    }
}