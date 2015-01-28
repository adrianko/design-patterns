package iterator;

public class NameRepository implements Container {
    
    public String names[] = { "Robert", "John", "Julie", "Lora" };
    
    @Override
    public Iterator getIterator() {
        return new NameIterator();
    }
    
    private class NameIterator implements Iterator {
        int i;
        
        @Override
        public boolean hasNext() {
            return i < names.length;
        }
        
        @Override
        public Object next() {
            if (hasNext()) {
                return names[i++];
            }
            
            return null;
        }
        
    }
    
}