

package model;

import Service.DaysFinderImpl;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public class DaysFinder {
    
    DaysFinderImpl service=new DaysFinderImpl();
    
    @WebMethod
    public String calculateDB(int year, int month, int date){
      return service.calculateDB(year, month, date)==-1?"Invalid input":String.valueOf(service.calculateDB(year, month, date));
    }
}
