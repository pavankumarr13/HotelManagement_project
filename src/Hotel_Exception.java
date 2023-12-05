public class Hotel_Exception {
    
}

class InvalidChoice extends RuntimeException{
    public String getMessage(){
        return "Invalid choice,Please enter a valid item number.\n";
    }
}
