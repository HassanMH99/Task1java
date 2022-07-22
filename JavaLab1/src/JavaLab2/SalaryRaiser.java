package JavaLab2;

public class SalaryRaiser {
    public static void main(String[] args){
        int max=6000;
        int min = 5000;
        int salary = (int) (Math.random() * (max - min)) + min;
        double updatesalry;
        System.out.println("The Salary is ->"+salary);
        if(salary <6000){
            updatesalry = salary*(0.1);
            salary = salary+(int)updatesalry;
            System.out.println("The Salary after raised 10% is ->"+salary);

        }else {
            updatesalry = salary*(0.05);
            salary = salary+(int)updatesalry;
            System.out.println("The Salary after raised 5% is ->"+salary);
        }

    }
}
