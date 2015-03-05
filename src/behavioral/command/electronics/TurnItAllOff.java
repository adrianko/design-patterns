package behavioral.command.electronics;

import java.util.List;

public class TurnItAllOff implements Command {
    
    List<ElectronicDevice> theDevices;

    public TurnItAllOff(List<ElectronicDevice> newDevices) {
        theDevices = newDevices;
    }

    public void execute() {
        theDevices.forEach(ElectronicDevice::off);
    }

    public void undo() {
        theDevices.forEach(ElectronicDevice::on);
    }
    
}