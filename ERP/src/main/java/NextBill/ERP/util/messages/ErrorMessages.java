package NextBill.ERP.util.messages;

public class ErrorMessages {
    
    public static String idNotFound(String entity){
    //    return "No hay registros en la entidad "+entity+ " con el id suministrado";
       final String message = "No hay registros en la entidad %s con el id suministrado";
       return String.format(message, entity);
    }


    public static String idNotMatched(String entity){
        //    return "the id Requested doesn't match with id to update for the "+entity+ ";
           final String message = "the id Requested doesn't match with id to update for the %s";
           return String.format(message, entity);
        }
}

