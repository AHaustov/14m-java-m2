package lesson05.uni;

class Person {
    String firstName;
    String secondName;
    int age;
    String gender;
    String nationality;
    int childCount = 0;
    double valueBankAcc = 0.00;

    public Person() {

    }

    public Person(String firstName) {
        this.firstName = firstName;
    }

    public Person(String firstName, String secondName, int age) {
        this.firstName = firstName;
        this.secondName = secondName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getChildCount() {
        return childCount;
    }

    public void setChildCount(int childCount) {
        this.childCount = childCount;
    }

    public double getValueBankAcc() {
        return valueBankAcc;
    }

    public void setValueBankAcc(double valueBankAcc) {
        this.valueBankAcc = valueBankAcc;
    }

    public void walks(int minutes) {
        System.out.println("This Person walked for " + minutes + " minutes.");
    }

    public static void sortAge(Person[] arr) {
        for (int i = 1; i < arr.length; i++) {
            Person temp = arr[i];
            int index = i;
            while (index > 0 && temp.age < arr[index - 1].age) {
                arr[index] = arr[index - 1];
                index--;
            }
            arr[index] = temp;
        }
    }

    public static void printArr(Person[] arr) {
        for (Person person : arr) {
            System.out.print(person.firstName + " " + person.age + " ");
        }
        System.out.println();
    }

    public Teacher changeToTeacher() {
        Teacher newTeacher = new Teacher(this.firstName, this.secondName, this.age);
        return newTeacher;
    }

    public Student changeToStudent() {
        Student newStudent = new Student(this.firstName, this.secondName, this.age);
        return newStudent;
    }

    public Worker changeToWorker() {
        Worker newWorker = new Worker(this.firstName, this.secondName, this.age);
        return newWorker;
    }

    public static void changePerson(Person[] arr, int index, Person person) {
        arr[index] = person;
    }

    public static Person[] delete(Person[] arr, int index) {
        if (index >= arr.length) return arr;
        Person[] newArr = new Person[arr.length - 1];
        for (int i = 0; i < index; i++) {
            newArr[i] = arr[i];
        }
        for (int i = index; i < newArr.length; i++) {
            newArr[i] = arr[i + 1];
        }
        return newArr;
    }

    public static Person[] add(Person[] arr, int index, Person element) {
        Person[] newArr = new Person[arr.length + 1];
        if (index > arr.length) {
            for (int i = 0; i < arr.length; i++) {
                newArr[i] = arr[i];
            }
            newArr[arr.length] = element;
        } else {
            for (int i = 0; i < index; i++) {
                newArr[i] = arr[i];
            }
            newArr[index] = element;
            for (int i = index; i < arr.length; i++) {
                newArr[i + 1] = arr[i];
            }
        }
        return newArr;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", secondName='" + secondName + '\'' +
                ", age=" + age +
                '}';
    }
}
