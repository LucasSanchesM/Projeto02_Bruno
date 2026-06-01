package factory;
/**
 * Classe responsavel pela criação de Operadores, é uma subclasse de FabricaFuncionarios
 * @author lucas
 * @since 2026
 * @version 1.0.0
 */
public class FabricaOperador extends FabricaFuncionarios{
    /**
     * @return Retorna um novo operador
     */
    @Override
    public Funcionario criarFuncionario(){
        return new Operador();
    }
}
