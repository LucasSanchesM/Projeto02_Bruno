/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facadeTest;

import domain.Falha;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import facade.FacadeGestaoFalha;
import model.DadosFalha;

/**
 * Teste responsável por validar a abertura de uma falha
 * utilizando a fachada FacadeGestaoFalha.
 *
 * Verifica se a falha é criada corretamente
 * e se inicia no estado ABERTO e também valida se ele realmente cria com os dados dos quais estamos passando
 *
 * @author Mirel
 */
public class FacadeGestaoFalhaTest {
    @Test
    public void deveAbrirFalhaComSucesso() {

        FacadeGestaoFalha facade = new FacadeGestaoFalha();

        Falha falha = facade.abrirFalha(new DadosFalha("Motor parou", "Mêcanica", 1));
        
        assertEquals("ABERTO", falha.getEstadoAtual().nome());
        assertEquals("Motor parou", falha.getTitulo());
        
    }
}
