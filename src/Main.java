public class Main {
    public static void main(String[] args) {

        //task1
        System.out.println("Task 1");
        String firstName = "Семён 123@@";
        String middleName = " Ivanovich ...2334";
        String lastName = " Ivanov#@#$%!@#";
        //Так при изменении данных в строках результат программы будет выводится корректно даже если нагадим цифрами и символами.
        //Если так делать нельзя - поправьте меня пожалуйста!
        firstName = firstName.replaceAll("[^A-Za-zА-Яа-я-ёЁ]", "");//
        middleName = middleName.replaceAll("[^A-Za-zА-Яа-я-ёЁ]", "");
        lastName = lastName.replaceAll("[^A-Za-zА-Яа-я-ёЁ]", "");
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("Ф.И.О. сотрудника — " + fullName);

        //task2
        System.out.println("Task 2");
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — " + fullName.toUpperCase());//Это задача просто говорит нам об этом методе или я не правильно понял ?

        //task3
        //Если исходя из условий берем уже имеющуюся переменную "fullName"
        System.out.println("Task 3");
        fullName = fullName.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника — " + fullName);

        //это на всякий случай, чтоб вы приняли дз :)))
        /*String firstName2 = "Семён";
        String middleName2 = "Семёнович";
        String lastName2 = "Семёнов";
        String fullName2 = lastName2 + " " + firstName2 + " " + middleName2;
        fullName2 = fullName2.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника — " + fullName2);*/

    }
}