package domain;

import java.time.LocalDateTime;

public class CarParkingCost implements IParkingCost {
    @Override
    public long calculateCost(Vehicle type, LocalDateTime input, LocalDateTime output) {
        return 0;
    }
    
}