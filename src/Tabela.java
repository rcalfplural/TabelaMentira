import java.util.HashMap;
import java.util.Map;

public class Tabela {
    private Map<Integer, Process> table;
    private int numeroPaginas;
    private Memoria memoria;
    public Tabela(Memoria memoria){
        this.table = new HashMap<>();
        this.memoria = memoria;
        this.numeroPaginas = memoria.getSize() / memoria.getFrameSize();
    }

    public void add(Process process){
        int region = 0;
        while(table.containsKey(region)){
            region += memoria.getFrameSize();
        }

        process.setRegion(region);
        table.put(region, process);
    }

    public void remove(Process process){
        table.remove(process.getRegion());
        process.setRegion(-1);
    }

}
