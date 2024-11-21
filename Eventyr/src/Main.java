public class Main {
    public static void main(String[] args) {
        try {

            BankSystem bank = new BankSystem();

            //Testcases
            bank.createAccount("1234", 500);
            bank.createAccount("1111",1000);
            bank.deposit("1234", 100);
            bank.withdraw("1234", 50);

            //Forsøg at hæve mere en saldoen
            bank.withdraw("1234", 700);

            // Udskriv konto detaljer
            bank.printAccountDetails("1234");

            //Forsøg at tilgå en ikke-eksisterende konto
            bank.printAccountDetails("9999");

        }
        catch (Exception e){
            System.out.println("Error: "+e.getMessage());
        }

    }
}