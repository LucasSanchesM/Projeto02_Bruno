package factory;

import model.Tecnico;
import services.Funcionario;

/**
  * Responsavel pela criação de Operadores, é uma subclasse de FabricaFuncionarios
 * @author Lucas Sanches Marcilio Pereira
 * @since 2026
 * @version 1.0.0
 */
public class FabricaTecnico extends FabricaFuncionarios{
    
    @Override
    public Funcionario criarFuncionario(){
        return new Tecnico();
    }
}
