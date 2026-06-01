/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Observer;

import domain.Falha;
import model.DadosFalha;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author vasco
 */
public class ObserverTest {
    
    private final String descricao = "Motor meu parou";
    private final String tipo = "Mecânica";
    private final int idMaquina = 1;
    
   /** Observador Fake: foi criado uma classe que registra quantas vezes recebeu atualizar(). */

    
    static class ObservadorFake implements ObservadorFalha {
        int vezesNotificado = 0;

        @Override
        public void atualizar(Falha f) {
            vezesNotificado++;
        }
    }
    
    @Test
    public void deveNotificarObservadorRegistrado() {
        Falha f = new Falha(new DadosFalha(descricao, tipo, idMaquina));
        ObservadorFake obs = new ObservadorFake();
        f.adicionarObservador(obs);

        f.aprovar();
        f.concluir();
        
        assertEquals(2, obs.vezesNotificado);
    }
    
      // Todos os observadores recebem a notificacao
    @Test
    public void deveNotificarMultiplosObservadores() {
        Falha f = new Falha(new DadosFalha(descricao, tipo, idMaquina));
        ObservadorFake obs1 = new ObservadorFake();
        ObservadorFake obs2 = new ObservadorFake();
        ObservadorFake obs3 = new ObservadorFake();
        f.adicionarObservador(obs1);
        f.adicionarObservador(obs2);
        f.adicionarObservador(obs3);

        f.notificarObservadores();

        assertEquals(1, obs1.vezesNotificado);
        assertEquals(1, obs2.vezesNotificado);
        assertEquals(1, obs3.vezesNotificado);
    }
    
    // Observador removido nao pode mais ser notificado
    
    @Test
    public void naoDeveNotificarObservadorRemovido() {
        Falha f = new Falha(new DadosFalha(descricao, tipo, idMaquina));
        ObservadorFake obs = new ObservadorFake();
        f.adicionarObservador(obs);
        f.removerObservador(obs);

        f.notificarObservadores();

        assertEquals(0, obs.vezesNotificado);
    }
    
    
    
    
}
