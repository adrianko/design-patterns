package behavioral.command.electronics;

public class TurnTVOff implements Command {

    ElectronicDevice theDevice;

    public TurnTVOff(ElectronicDevice newDevice){
        theDevice = newDevice;
    }

    public void execute() {
        theDevice.off();
    }
    
    public void undo() {
        theDevice.on();
    }

}