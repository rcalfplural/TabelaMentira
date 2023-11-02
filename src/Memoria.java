public class Memoria {
    private final int size;
    private final int frameSize;
    private final byte[] ram;

    public Memoria(int tamanho, int tamanhoMoldura){
        this.size = tamanho;
        this.frameSize = tamanhoMoldura;
        this.ram = new byte[size];
    }

    public void specs(){
        System.out.println("Tamanho total em bytes: "+ size);
        System.out.println("Tamanho da pagina em bytes: "+ frameSize);
    }

    public int getPos(int vPos){
        return 0;
    }

    public void set(int address, int region, byte value){
        int pos = getPhysicalAddress(address, region);
        ram[pos] = value;
    }

    private int getPhysicalAddress(int address, int region){
        int pageNumber = (int)Math.floor(address/frameSize);
        int regionStart = region * frameSize;
        int offset = address - (frameSize*pageNumber) + regionStart;

        return offset;
    }

    public byte get(int address, int region){
        int pos = getPhysicalAddress(address, region);
        return ram[pos];
    }

    public int getSize() {
        return size;
    }

    public int getFrameSize() {
        return frameSize;
    }
}
