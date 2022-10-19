package domain;

import java.util.HashMap;
import java.util.Map;

public class ParkingCostFactory {

    private static Map<TypeEnum, IParkingCost> dictionary;
    private static ParkingCostFactory instance;

    //** CONSTRUCTOR */
    public ParkingCostFactory() {
        dictionary = new HashMap<TypeEnum, IParkingCost>();
        dictionary.put(TypeEnum.CAR, new CarParkingCost());
        dictionary.put(TypeEnum.MOTO, new MotoParkingCost());
        dictionary.put(TypeEnum.TRUCK, new TruckParkingCost());
        
        if(instance == null){
            instance = this;
        }
    }

    //** FACTORY INSTANCE */
    public static IParkingCost getParkingCost(TypeEnum type){
        if(instance == null){
            instance = new ParkingCostFactory();
        }
        if(type.compareTo(TypeEnum.CAR) == 0) return dictionary.get(TypeEnum.CAR);
        if(type.compareTo(TypeEnum.MOTO) == 0) return dictionary.get(TypeEnum.MOTO);
        return dictionary.get(TypeEnum.TRUCK);
    }


    //TODO: PA QUE SIRVE ESTO???
    private void VehicleFactory(){

    }

    // GETTERS && SETTERS
    public ParkingCostFactory getInstance() {
        if(instance == null){
            instance = new ParkingCostFactory();
        }
        return instance;
    }
    
}
