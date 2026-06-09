package stubs;
import factory.FabricaTecnico;
import model.Tecnico;
import services.Funcionario;

/**
 * Stub para Testes.
 * Permite que a classe de teste utilize desta para simular valores,
 * deixando o teste limitado ao ambiente correto
 * @author Lucas Sanches Marcílio Pereira
 * @since 2026
 * @version 1.0.0
 */
public class FabricaTecnicoStub extends FabricaTecnico{
    @Override
    public Funcionario criarFuncionario(){
        Tecnico tecnicoFake = new Tecnico();
        tecnicoFake.setId(999);
        tecnicoFake.setNome("Tecnico de Teste");
        return tecnicoFake;
    }
}
