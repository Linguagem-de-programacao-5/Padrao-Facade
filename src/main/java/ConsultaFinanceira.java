import java.util.ArrayList;
import java.util.List;

public class ConsultaFinanceira {

    private List<Cliente> clientesInadimplentes = new ArrayList<Cliente>();

    public void addClienteInadimplente(Cliente cliente) {
        this.clientesInadimplentes.add(cliente);
    }

    public boolean verificarClienteComInadiplencia(Cliente cliente) {
        return this.clientesInadimplentes.contains(cliente);
    }
}
