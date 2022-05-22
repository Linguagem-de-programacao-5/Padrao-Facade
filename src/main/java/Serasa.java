public class Serasa extends ConsultaFinanceira{

    private Serasa(){};
    private static Serasa serasa = new Serasa();

    public static Serasa getSerasa(){
        return serasa;
    }
}
