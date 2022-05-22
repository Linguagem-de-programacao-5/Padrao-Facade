public class SPC extends ConsultaFinanceira{

    private SPC(){};

    public static SPC spc = new SPC();

    public static SPC getSpc(){
        return  spc;
    }

}
