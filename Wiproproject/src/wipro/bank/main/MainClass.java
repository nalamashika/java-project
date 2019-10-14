package wipro.bank.main;

import wipro.bank.services.BankService;

public class MainClass {

public static void main(String[] args)
{

    int tenure = 5;
    float principal = 1000;
    int age = 23;
    String gender = "Male";
    BankService b=new BankService();
    b.calculate(principal, tenure, age, gender);
}

}
