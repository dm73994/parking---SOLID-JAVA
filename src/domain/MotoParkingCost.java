package domain;

import java.time.LocalDateTime;

public class MotoParkingCost implements IParkingCost {

    @Override
    public long calculateCost(Vehicle type, LocalDateTime input, LocalDateTime output) {
    //    LocalDateTime hora = LocalDateTime.parse("2018-10-10T-11:25");
    //     if(hora.getHour() == 1){
    //         return 2000;
    //     }else if(hora.getHour() < 1){
    //         return 1000;
    //     }else if (hora.getHour() >1){
    //         int pagoBase = 1000;
    //     }
        return 111111;
    }
}

