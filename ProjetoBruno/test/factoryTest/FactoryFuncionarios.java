package factoryTest;
import model.Gerente;
import model.Operador;
import model.Tecnico;
import services.Funcionario;
import factory.*;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
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
    @Test
    public void deveCriarUmTecnico(){
        FabricaFuncionarios fabrica = new FabricaTecnico();
        Funcionario funcionario = fabrica.criarFuncionario();
        assertTrue("O Funcionario criado deve ser um Gerente", funcionario instanceof Tecnico);
    }
    
}
