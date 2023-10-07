package modulo6;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class Building {

    private List<Elevator> listElevators;
    private Random random;

    public Building(List<Elevator> listElevators){
        this.listElevators = listElevators;
    }

    public Building(){}

    public void callElevator() {
    }

    public List<Elevator> getListElevators() {
        return listElevators;
    }

    public void setListElevators(List<Elevator> listElevators) {
        this.listElevators = listElevators;
    }

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public void addElevators(){
        if(this.listElevators != null){
            Elevator elevator = new Elevator(this.listElevators.size()+1,random.nextInt(10));
            this.listElevators.add(elevator);
        }else{
            this.listElevators = new ArrayList<>();
            Elevator elevator = new Elevator(1,random.nextInt(10));
            this.listElevators.add(elevator);
        }
    }
}
