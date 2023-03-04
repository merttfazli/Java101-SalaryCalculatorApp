public class Employee {
    String name;
    double  salary;
    int workHoursForAWeek;
    int hireYear;

    Employee(String name,int salary,int workHoursForAWeek,int hireYear){
        this.name=name;
        this.salary=salary;
        this.workHoursForAWeek=workHoursForAWeek;
        if (hireYear>1950 && hireYear<2023){
            this.hireYear=hireYear;
        }
        else{
            System.out.println("Geçersiz Tarih Girdiniz.");
        }

    }
    public double Tax(){
        double tax=0.00;
        if (this.salary<1000){
            return tax ;
        }
        else if(this.salary>=1000){
            tax=salary*0.03;
            return tax;
        }
        return tax;
    }

    public int bonus(){
        int bonus=0;
        if(this.workHoursForAWeek>40){
            bonus=(workHoursForAWeek-40)*30;
            return bonus;
        }
        return bonus;
    }

    public double raiseSalary(){
        int year=2021;
        double raise=0;
        int totalYearsOfTheWork=year-this.hireYear;
        if (totalYearsOfTheWork<10){
            raise=this.salary*0.05;
        }
        else if(totalYearsOfTheWork>9 && totalYearsOfTheWork<20){
            raise=this.salary*0.10;
        }
        else if(totalYearsOfTheWork>19){
            raise=this.salary*0.15;
        }
        return raise;
    }
    public void print(){
        System.out.println("Adı: "+this.name);
        System.out.println("Maaşı: "+this.salary);
        System.out.println("Haftalık Çalışma Saati: "+this.workHoursForAWeek);
        System.out.println("İşe Başlama Yılı: "+ this.hireYear);
        System.out.println("Vergi: "+Tax());
        System.out.println("Bonus: "+bonus());
        System.out.println("Maaş Artışı: "+raiseSalary());
        System.out.println("Vergiler ve Bonuslar ile birlikte maaş: "+(this.salary+(bonus()-Tax())));
        System.out.println("Toplam Maaş: "+(this.salary)+raiseSalary());
    }
}
