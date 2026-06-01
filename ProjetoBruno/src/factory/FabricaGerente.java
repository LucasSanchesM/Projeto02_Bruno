
package factory;
/**
 * Responsavel pela criação de gerentes, é uma subclasse de FabricaFuncionarios
 * @author lucas
 */
public class FabricaGerente extends FabricaFuncionarios{
    /**
     * @return retorna uma nova instancia de gerente 
     */
    @Override
    public Funcionario criarFuncionario(){
        return new Gerente();
    }
}
