public class ComboLock {
    public int secret1, secret2, secret3, dialPosition, pos1, pos2, pos3, count;
    
    public ComboLock (int secret1, int secret2, int secret3) {
        this.secret1 = secret1;
        this.secret2 = secret2;
        this.secret3 = secret3;
        dialPosition = 0;
        pos1 = 0;
        pos2 = 0;
        pos3 = 0;
        count = 0;
    }    
    
    public void reset() {
        dialPosition = 0;
        count = 0;
    }
    
    public void turnLeft(int ticks) {
        pos2 = 39 - (ticks - pos1);
        count++;
    }
    
    public void turnRight(int ticks) {
        if(count == 0) {
           pos1 = ticks; 
        } else {
            pos3 = pos2 - ticks;
            if (pos3 < 0) {
                pos3 = 39 - pos3;
            }
        }
        count++;
    }
    
    public boolean open() {
        boolean open = false;
        
        if (secret1 == pos1 && secret2 == pos2 && secret3 == pos3) {
            open = true;
        }
        
        return open;
    }
    
    public int getCount() {
        return count;
    }
}
