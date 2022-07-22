public class App {

    public static void main(String[] args) {

        GeneralTreeOfString arv = new GeneralTreeOfString();
        arv.add("um", null);
        arv.add("dois", "um");
        arv.add("tres", "um");
        arv.add("quatro", "dois");
        arv.add("cinco", "dois");
        arv.add("seis", "dois");

        System.out.println("Caminhamento em largura:");
        System.out.println(arv.positionsWidth());

        System.out.println("Caminhamento pré-fixado:");
        System.out.println(arv.positionsPre());

       // System.out.println("Caminhamento pós-fixado:");
       // System.out.println(arv.positionsPos());

        System.out.println("-------------------------");
        arv.geraDOT();
        
        System.out.println("Total de elementos da arvore="+arv.size());
        arv.removeBranch(2);
        System.out.println("Total de elementos da arvore="+arv.size());
        
        System.out.println("-------------------------");
        arv.geraDOT();
    }
}
