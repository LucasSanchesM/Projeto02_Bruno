package factory;

import services.FabricaFuncionarios;
import model.Operador;
import services.Funcionario;

/**
 * Responsavel pela criação de Operadores, é uma subclasse de
 * FabricaFuncionarios
 *
 * @author Lucas Sanches Marcilio Pereira
 * @since 2026
 * @version 1.0.0
 */
public class FabricaOperador extends FabricaFuncionarios {

    /**
     * @return Retorna uma nova instancia de operador
     */
    @Override
    public Funcionario criarFuncionario() {
        return new Operador();
    }
}
