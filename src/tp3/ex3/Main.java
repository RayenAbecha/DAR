package tp3.ex3;

public class Main {

    // in this assignment we will simulate a vendor that sells an isi sandwich
    // and a student that waits for a sandwich until it's prepared
    // implement the student and the vendor run methods in order to get a correct output

    public static void main(String[] args) {
        ISISandwich isiSandwich = new ISISandwich();
        Student student = new Student("Salah",isiSandwich);
        Vendor vendor = new Vendor("El Baya3",isiSandwich);

        student.start();
        vendor.start();

        //output should be :
        //  Student Salah is waiting for a sandwich
        //  Vendor El Baya3 said 'isi sandwich is ready'
        //  Student Salah got a sandwich
    }
}
