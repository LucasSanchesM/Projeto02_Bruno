package factoryTest;
import factory.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
/**
 * Teste Responsavel por verificar a criação de funcionarios (Operador, Gerente e Tecnico)
 * 
 * @author lucas
 */

public class FactoryFuncionarios {
    
    public FactoryFuncionarios() {
    }
    
    @Test
    public void deveCriarUmOperador() {
        FabricaFuncionarios fabrica = new FabricaOperador();
        Funcionario funcionario = fabrica.criarFuncionario();
        assertTrue("O Funcionario criado deve ser um Operador", funcionario instanceof Operador);
    }
    @Test
    public void deveCriarUmGerente(){
        FabricaFuncionarios fabrica = new FabricaGerente();
        Funcionario funcionario = fabrica.criarFuncionario();
        assertTrue("O Funcionario criado deve ser um Gerente", funcionario instanceof Gerente);
    }
    
    
}
