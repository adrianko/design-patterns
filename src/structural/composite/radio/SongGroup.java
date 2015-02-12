package structural.composite.radio;

import java.util.ArrayList;

public class SongGroup extends SongComponent {
    
    ArrayList<SongComponent> songComponents = new ArrayList<SongComponent>();
    
    String groupName;
    String groupDescription;
    
    public SongGroup(String gn, String gd) {
        groupName = gn;
        groupDescription = gd;
    }
    
    public String getGroupName() {
        return groupName;
    }
    
    public String getGroupDescription() {
        return groupDescription;
    }
    
    @Override
    public void add(SongComponent sc) {
        songComponents.add(sc);
    }
    
    @Override
    public void remove(SongComponent sc) {
        songComponents.remove(sc);
    }
    
    @Override
    public SongComponent getComponent(int i) {
        return songComponents.get(i);
    }
    
    @Override
    public void displaySongInfo() {
        System.out.println(getGroupName() + " " + getGroupDescription());
        songComponents.forEach(SongComponent::displaySongInfo);
    }
    
}