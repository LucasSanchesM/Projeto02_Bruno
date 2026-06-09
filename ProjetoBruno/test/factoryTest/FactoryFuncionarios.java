package factoryTest;
import services.FabricaFuncionarios;
import model.Gerente;
import model.Operador;
import model.Tecnico;
import services.Funcionario;
import factory.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import stubs.FabricaGerenteStub;
import stubs.FabricaOperadorStub;
import stubs.FabricaTecnicoStub;
/**
 * Teste Responsavel por verificar a criação de funcionarios (Operador, Gerente e Tecnico).
 * 
 * Intancia uma fabrica que cria objetos que possuem a interface Funcionario (Operador, Gerente e Tecnico), ou seja,
 * facilita correções em que é necessario trocar o tipo de funcionario que vai ser instanciado
 * 
 * @author Lucas Sanches Marcilio Pereira
 * @since 2026
 * @version 1.0.0
 */

public class FactoryFuncionarios {
    
    public FactoryFuncionarios() {
    }
    
    @Test
    public void ct11_deveCriarUmOperador() {
        FabricaFuncionarios fabrica = new FabricaOperadorStub();
        Funcionario funcionario = fabrica.criarFuncionario();
        assertTrue("O Funcionario criado deve ser um Operador", funcionario instanceof Operador);
    }
    @Test
    public void ct12_deveCriarUmGerente(){
        FabricaFuncionarios fabrica = new FabricaGerenteStub();
        Funcionario funcionario = fabrica.criarFuncionario();
        assertTrue("O Funcionario criado deve ser um Gerente", funcionario instanceof Gerente);
    }
    @Test
    public void ct13_deveCriarUmTecnico(){
        FabricaFuncionarios fabrica = new FabricaTecnicoStub();
        Funcionario funcionario = fabrica.criarFuncionario();
        assertTrue("O Funcionario criado deve ser um Tecnico", funcionario instanceof Tecnico);
    }
    
}
