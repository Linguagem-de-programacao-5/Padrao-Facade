public  class ContaBancariaFacade {
    public static String validarCliente(ContaBancaria conta) {

        if (Serasa.getSerasa().verificarClienteComInadiplencia(conta.getCliente())) {
            return "Cliente possui inviabilidade no Serasa!";
        }

        if(SPC.getSpc().verificarClienteComInadiplencia(conta.getCliente())){
            return "Cliente possui inviabilidade no SPC!";
        }

        return "Cliente adimplente nas bases do SPC e Serasa!";
    }
}
