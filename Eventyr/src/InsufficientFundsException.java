public class InsufficientFundsException extends Exception{

    public InsufficientFundsException(String message){
        super(message);
    }

}
class InvalidAmountException extends RuntimeException{
public InvalidAmountException(String message){
    super(message);
}
}

class AccountNotFoundException extends Exception{
    public AccountNotFoundException(String message){
        super(message);
    }

}