package factory;

import services.Funcionario;

/**
 * Usada de base para criação de outras fabricas
 * @author Lucas Sanches Marcilio Pereira
 * @since 2026
 * @version 1.0.0
 */
public abstract class FabricaFuncionarios {
    /**
     * @return irá retornar um funcionario, no escopo atual ele sera um Operador, Gerente ou Tecnico
     */
    public abstract Funcionario criarFuncionario();
}
