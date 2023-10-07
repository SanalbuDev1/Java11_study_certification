package modulo6;

public class Elevator implements IElevator{

    private Integer idElevator;
    private Integer currentFloor;

    private boolean door;

    public Elevator(Integer idElevator, Integer currentFloor) {
        this.idElevator = idElevator;
        this.currentFloor = currentFloor;
    }

    @Override
    public void up() {

    }

    @Override
    public void down() {

    }

    @Override
    public boolean iSDoorsOpen() {
        return false;
    }

    public Integer getIdElevator() {
        return idElevator;
    }

    public void setIdElevator(Integer idElevator) {
        this.idElevator = idElevator;
    }

    public Integer getCurrentFloor() {
        return currentFloor;
    }

    public void setCurrentFloor(Integer currentFloor) {
        this.currentFloor = currentFloor;
    }

    public boolean isDoor() {
        return door;
    }

    public void setDoor(boolean door) {
        this.door = door;
    }

    @Override
    public String toString() {
        return "Elevator{" +
                "idElevator=" + idElevator +
                ", currentFloor=" + currentFloor +
                '}';
    }
}
