package service;
import java.util.logging.ConsoleHandler;
@WebService(name="CalculWS")
public class CalculWS {

    @WebMethod(operationName = "Somme")
    public double Somme(@WebParam(name = "val1") double a,@WebParam(name = "val2") double b){
        return a+b;
    }

    }


