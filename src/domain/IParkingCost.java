package domain;

import java.time.LocalDateTime;

public interface IParkingCost {
    long calculateCost(Vehicle type, LocalDateTime input, LocalDateTime output);
}
