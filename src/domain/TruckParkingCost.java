package domain;

import java.time.LocalDateTime;

public class TruckParkingCost implements IParkingCost {

    @Override
    public long calculateCost(Vehicle type, LocalDateTime input, LocalDateTime output) {
        LocalDateTime hora=LocalDateTime.parse("2018-10-10T11:25");
        if( hora.getHour() <= 12){
            return 10000;
        }else if (hora.getHour()>12 && hora.getHour()<24 )
        return 15000;
        
        return 0;
    }  
}
