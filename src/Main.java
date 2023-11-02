public class Main {
    public static void main(String[] args) {
        Memoria mem = new Memoria(1*Medidas.GIGA_BYTES, 512);
        Tabela tab = new Tabela(mem);

        Process a = new Process();
        Process b = new Process();
        Process c = new Process();
        Process d = new Process();
        Process e = new Process();
        Process f = new Process();

        tab.add(a);
        tab.add(b);
        tab.add(c);
        tab.add(d);
        tab.add(e);
        tab.add(f);

        a.writeMemory(mem, 500);
        b.writeMemory(mem, 500);
        c.writeMemory(mem, 500);
        d.writeMemory(mem, 500);
        e.writeMemory(mem, 500);
        f.writeMemory(mem, 500);

        mem.specs();
    }
}