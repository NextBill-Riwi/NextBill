package NextBill.ERP.util.exeptions;

public class NotMatchedRequestIdException extends RuntimeException {
    
    public NotMatchedRequestIdException(String message){
        super(message);
    }
    
}
