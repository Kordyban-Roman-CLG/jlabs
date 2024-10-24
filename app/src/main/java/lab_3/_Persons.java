package lab_3;

class _Persons {
    protected String name;
    protected int age;

    public _Persons(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void Show() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class _Student extends _Persons {
    private String major;
    private int year;

    public _Student(String name, int age, String major, int year) {
        super(name, age);
        this.major = major;
        this.year = year;
    }

    @Override
    public void Show() {
        System.out.println("Student: " + name + ", Age: " + age + ", Major: " + major + ", Year: " + year);
    }
}

class _Teacher extends _Persons {
    protected String department;
    protected String degree;

    public _Teacher(String name, int age, String department, String degree) {
        super(name, age);
        this.department = department;
        this.degree = degree;
    }

    @Override
    public void Show() {
        System.out
                .println("Teacher: " + name + ", Age: " + age + ", Department: " + department + ", Degree: " + degree);
    }
}

class _DepartmentHead extends _Teacher {
    private int yearsInPosition;

    public _DepartmentHead(String name, int age, String department, String degree, int yearsInPosition) {
        super(name, age, department, degree);
        this.yearsInPosition = yearsInPosition;
    }

    @Override
    public void Show() {
        System.out.println("Department Head: " + name + ", Age: " + age + ", Department: " + department +
                ", Degree: " + degree + ", Years in Position: " + yearsInPosition);
    }
}