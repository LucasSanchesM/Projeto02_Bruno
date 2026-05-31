/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package facadeTest;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import facade.FacadeGestaoFalha;
import facade.FacadeDadosFalha;
import facade.FacadeFalha;

/**
 * Teste responsável por validar a abertura de uma falha
 * utilizando a fachada FacadeGestaoFalha.
 *
 * Verifica se a falha é criada corretamente
 * e se inicia no estado ABERTO.
 *
 * @author Mirel
 */
public class FacadeGestaoFalhaTest {
    @Test
    public void deveAbrirFalhaComSucesso() {

        FacadeGestaoFalha facade = new FacadeGestaoFalha();

        FacadeDadosFalha dados = new FacadeDadosFalha(
                "Erro no sistema",
                "Sistema travou",
                "Máquina 01"
        );

        FacadeFalha falha = facade.abrirFalha(dados);

        assertNotNull(falha);
        assertEquals("ABERTO", falha.getEstado());
        assertEquals("Erro no sistema", falha.getTitulo());
    }
}
