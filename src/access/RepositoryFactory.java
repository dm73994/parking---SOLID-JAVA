package access;

/**
 * RepositoryFactory
 */
public class RepositoryFactory{
    private static RepositoryFactory instance;
    
    public RepositoryFactory(){
        if(RepositoryFactory.instance == null){
            RepositoryFactory.instance = this;
        }
    }

    public IVehicleRepository getRepository(String type){
        //** SE DEBVERIA RETORNAR UN NUEVO REPOSITORIO, PERO NO HAY BD */
        return new VehicleRepository();
    }

    //GETTERS
    public static RepositoryFactory getInstance() { 
        if(RepositoryFactory.instance == null){
            RepositoryFactory.instance = new RepositoryFactory();
        }
        return RepositoryFactory.instance; 
    }
}