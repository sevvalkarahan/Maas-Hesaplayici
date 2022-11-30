public class Employee {
    String name;
    int salary,workHours,hireYear;


    public Employee(String name, int salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    public double tax(){
        double vergi;
        if (this.salary<1000) {
             return vergi = 0;
        }
        else {
           return vergi = salary * 0.03;
        }

    }
    public double bonus(){
        int bns;
        if (this.workHours>=40){

           return bns=(workHours-40)*30;

        }

        else {
           return bns = 0;

        }

    }
    public double raiseSalary(){
        double zam;
        int yil=2021-hireYear;
        if (yil<10) {
           return zam = salary * 0.05;

        }
        else if (yil>=10 && yil<20) {
           return zam = salary * 0.10;

        }
        else {
          return   zam = salary * 0.15;

        }

    }

    public void display(){
        System.out.println("Adı: "+this.name);
        System.out.println("Maaşı: "+this.salary);
        System.out.println("Çalışma Saati: "+this.workHours);
        System.out.println("Başlangıç yılı: "+this.hireYear);
        System.out.println("Vergi: "+tax());
        System.out.println("Bonus: "+bonus());
        System.out.println("Maaş Artışı: "+raiseSalary());
        System.out.println("Vergi ve Bonuslar ile birlikte maaş: "+(salary-tax()+bonus()));
        System.out.println("Toplam Maaş: "+(salary-tax()+bonus()+raiseSalary()));



    }

}
