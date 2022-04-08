package BasicPrograms;

public class ComplexNumbers{
    double real, imaginary;

    ComplexNumbers(double r, double i){
        this.real = r;
        this.imaginary = i;
    }

    public static ComplexNumbers sum(ComplexNumbers complexOne, ComplexNumbers complexTwo)
    {
        ComplexNumbers temp = new ComplexNumbers(0, 0);

        temp.real = complexOne.real + complexTwo.real;
        temp.imaginary = complexOne.imaginary + complexTwo.imaginary;

        return temp;
    }
    public static void main(String args[]) {
        ComplexNumbers c1 = new ComplexNumbers(4.3, 8);
        ComplexNumbers c2 = new ComplexNumbers(4.5, 3.9);
        ComplexNumbers temp = sum(c1, c2);
        System.out.printf("Sum: "+ temp.real + " + "+ temp.imaginary + "i ");
    }
}