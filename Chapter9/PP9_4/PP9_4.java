public class PP9_4 {
    public static void main(String[] args) {
        ParallelResonantCircuit parCir = new ParallelResonantCircuit(10, 1, 15);
        SeriesResonantCircuit serCir = new SeriesResonantCircuit(10, 1, 15);
        
        System.out.println("Parallel Circuit: \n" + parCir.display());
        System.out.println("Series Circuit: \n" + serCir.display());
    }
}
