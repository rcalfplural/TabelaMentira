public class Process {
    private static int pidCounter = 0;
    private int PID;
    private int region;

    public Process(){
        this.PID = pidCounter++;
        this.region = -1;
    }

    @Override
    public String toString(){
        return "PROC "+PID;
    }

    @Override
    public boolean equals(Object o){
        if(!(o instanceof Process)) return false;
        return ((Process) o).PID == this.PID;
    }

    public void setRegion(int region) {
        this.region = region;
    }

    public int getRegion(){
        return region;
    }

    public int writeMemory(Memoria mem, int address){
        mem.set(address, this.region, (byte)PID);
        return 0;
    }
}
