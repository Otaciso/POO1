import java.util.*;


public class Agencia {
    
    private int numero;
    private Banco banco;
    private List<ContaIF> contas = new ArrayList<ContaIF>();
    private List<Cliente> clientes = new ArrayList<Cliente>();

    public void cadastrarConta(ContaIF conta) {
        contas.add(conta);
    }
    
    public void cadastraCliente(Cliente cliente) {
    	clientes.add(cliente);
    }
    
    public Cliente pesquisaPorCpf(String cpf) {
    	for (Cliente cliente : clientes) {
    		if (cliente.getCpf().equals(cpf)){
    			return cliente;
    		}
    	}
    	throw new RuntimeException("Cliente nao encontrado: " + cpf);
    }
    
    public ContaIF pesquisarContaPorNumero(int numero) {
        
        for (ContaIF conta : contas) {
            
            if (conta.getNumero() == numero) {
                return conta;
            }
        }
        
        throw new RuntimeException("Conta não encontrada: " + numero);
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public Banco getBanco() {
        return banco;
    }

}
