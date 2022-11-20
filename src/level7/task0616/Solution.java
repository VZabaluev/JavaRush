package level7.task0616;
//Перед тобой — цифровая учетная карточка работника. В ней указано его имя, должность и зарплата.
//        Имя работника вряд ли поменяется, а вот должность и зарплата могут. Такие изменения вносятся с помощью методов setPosition() и setSalary(). Правда, сейчас они неправильно работают.
//        Разберись, в чем причина и исправь баги. При этом ни имена переменных класса, ни имена параметров методов изменять нельзя.
//
//        Требования:
//        •	Метод setPosition() должен устанавливать полученное значение переменной класса position.
//        •	Метод setSalary() должен устанавливать полученное значение переменной класса salary.
//        •	Изменять имена переменных класса нельзя.
//        •	Изменять имена параметров методов нельзя.



    public class Solution {
        public static void main(String[] args) {

        }

        public String name = "Amigo";
        public String position = "Java developer";
        public int salary = 10_000;

        public void setPosition(String position) {

            this.position = position;
        }

        public void setSalary(int salary) {

            this.salary = salary;
        }
    }

//        this указывает на текущий объект.
//        Почему не имя класса: класс в программе один, уникальный, а вот объектов этого класса может быть сколько угодно.
//        И если хочешь получить доступ к памяти конкретного текущего объекта - делаешь это через this. А доступ к общей памяти класса, так называемой статической области - через имя класса.
//        Объекты не могут обращаться к другим объектам того же класса - они друг о друге ничего не знают, у каждого свой this. Но все они могут обращаться к общей памяти класса, и обмениваться таким образом данными или настройками.
//        Обычно статическими объявляют именно общие фрагменты: то, что не зависит от содержимого объекта. Всякие вспомогательные методы, хэлперы, константы, общие данные.
