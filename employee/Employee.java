package employee;

public class Employee {
    String name;
    double salary;
    int workHours;
    int hireYear;

    Employee(String name,double salary,int workHours,int hireYear){
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }


    double tax(){
        if(this.salary < 1000){
            return 0.0;
        }else{
            return this.salary*0.03;
        }
    }

    double bonus(){
        if(this.workHours > 40){
            return (this.workHours-40)*30;
        }else{
            return 0.0;
        }
    }

    double raiseSalary(){
        int now = 2021;
        int workYear = now - this.hireYear;
        if(workYear < 10){
            return this.salary*0.05;
        }else if(workYear < 20){
            return this.salary*0.10;
        }else{
            return this.salary*0.15;
        }
    }

    void showInfo(){
        System.out.println("--------------------");
        System.out.println("Adi : " +this.name);
        System.out.println("Maasi : "+this.salary);
        System.out.println("Calısma Saati : " +this.workHours);
        System.out.println("Baslangic yili : " +this.hireYear);
        System.out.println("vergi : "+this.tax());
        System.out.println("bonus : " +this.bonus());
        System.out.println("Total : " +(this.salary+this.bonus()+this.raiseSalary()-this.tax()));
        System.out.println("--------------------");

    }

}
