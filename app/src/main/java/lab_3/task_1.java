package lab_3;

public class task_1 {
    public static void main() {
        _Persons[] people = new _Persons[4];
        people[0] = new _Student("Ivan", 20, "Computer Science", 2);
        people[1] = new _Teacher("Olena", 35, "Mathematics", "PhD");
        people[2] = new _DepartmentHead("Petro", 50, "Physics", "Doctor", 5);
        people[3] = new _Student("Anna", 21, "Biology", 3);
        for (_Persons person : people) {
            person.Show();
        }
    }
}
/*
    Побудувати ієрархію класів відповідно до варіанта завдання.
    Згідно завдання вибрати суперклас (базовий клас) та підкласи (похідні класи).
    В класах задати поля, які характерні для кожного класу.
    Для всіх класів розробити метод Show(), який виводить дані про об’єкт класу.
    Вивести інформацію про об’єкти заданих сутностей згідно варіанту в масив типу суперкласу та друкує введений масив (з використанням методу Show()).

    Студент, викладач, персона, завідувач кафедри.
*/