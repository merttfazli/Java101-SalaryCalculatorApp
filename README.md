# Çalışan Bilgileri Hesaplama

Bu Java programı, `Employee` (Çalışan) sınıfını kullanarak bir çalışanın maaşını, vergisini, bonusunu, maaş artışını ve toplam maaşını hesaplayan bir programdır.

## Kurulum

- Java JDK'nın bilgisayarınıza yüklü olduğundan emin olun.
- Bu repo'yu klonlayın veya zip dosyası olarak indirin.

## Nasıl Çalıştırılır

- Bir Java derleyici veya entegre geliştirme ortamı (IDE) kullanarak projeyi açın.
- Main.java dosyasını bulun ve açın.
- Programı derleyin ve çalıştırın.

## Programın İşleyişi

`Employee` sınıfı, aşağıdaki özelliklere sahiptir:

- `name`: Çalışanın adını temsil eden bir `String`.
- `salary`: Çalışanın maaşını temsil eden bir `double`.
- `workHoursForAWeek`: Haftalık çalışma saatlerini temsil eden bir `int`.
- `hireYear`: İşe başlama yılını temsil eden bir `int`.

Ayrıca, `Employee` sınıfı aşağıdaki yöntemlere sahiptir:

- `Tax()`: Çalışanın vergisini hesaplayan ve geri döndüren bir yöntem.
- `bonus()`: Çalışanın bonusunu hesaplayan ve geri döndüren bir yöntem.
- `raiseSalary()`: Çalışanın maaş artışını hesaplayan ve geri döndüren bir yöntem.
- `print()`: Çalışanın tüm bilgilerini ekrana yazdıran bir yöntem.

`Main` sınıfı, `Employee` sınıfını kullanarak bir çalışanın bilgilerini oluşturur ve `print()` yöntemini çağırarak tüm bilgileri ekrana yazdırır.

Program çalıştırıldığında, çalışanın adı, maaşı, haftalık çalışma saati, işe başlama yılı, vergisi, bonusu, maaş artışı, vergi ve bonuslarla birlikte toplam maaşı gibi bilgiler ekrana yazdırılır.

Umarım bu bilgi size yardımcı olur. İyi çalışmalar!

# Employee Information Calculation

This Java program is a program that uses the `Employee` class to calculate an employee's salary, tax, bonus, salary raise, and total salary.

## Installation

- Make sure Java JDK is installed on your computer.
- Clone or download this repository as a zip file.

## How to Run

- Open the project using a Java compiler or an integrated development environment (IDE).
- Locate and open the Main.java file.
- Compile and run the program.

## Program Workflow

The `Employee` class has the following properties:

- `name`: A `String` representing the employee's name.
- `salary`: A `double` representing the employee's salary.
- `workHoursForAWeek`: An `int` representing the employee's weekly work hours.
- `hireYear`: An `int` representing the year the employee was hired.

Additionally, the `Employee` class has the following methods:

- `Tax()`: A method that calculates and returns the employee's tax.
- `bonus()`: A method that calculates and returns the employee's bonus.
- `raiseSalary()`: A method that calculates and returns the employee's salary raise.
- `print()`: A method that prints all the employee's information to the console.

The `Main` class creates an employee object using the `Employee` class, and calls the `print()` method to print all the information to the console.

When the program is executed, it will display information such as the employee's name, salary, weekly work hours, hire year, tax, bonus, salary raise, and total salary (including taxes and bonuses).

I hope this information is helpful. Happy coding!

