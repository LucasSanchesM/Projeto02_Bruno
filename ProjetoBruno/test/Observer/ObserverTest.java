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
 * Classe de testes unitários para verificar o comportamento básico do padrão Observer
 * na classe `Falha`. Estes testes focam na funcionalidade de registro, notificação
 * e remoção de observadores, sem considerar as transições de estado da `Falha`.
 * 
 * @author vasco
 */
public class ObserverTest {
    
    //facilitar e padroniza parametros
    private final String descricao = "Motor meu parou";
    private final String tipo = "Mecânica";
    private final int idMaquina = 1;
    
   /** 
    * observador fake: uma implementação de `ObservadorFalha` utilizada para testes nesse caso.
    * Ela simplesmente conta quantas vezes o método `atualizar()` foi invocado,
    * permitindo verificar se as notificações estão ocorrendo conforme o esperado.
    */
    static class ObservadorFake implements ObservadorFalha {
        int vezesNotificado = 0;

        @Override
        public void atualizar(Falha f) {
            vezesNotificado++;
        }
    }
    
    /**
     * Testa se um observador registrado é notificado corretamente quando o Subject
     * (a classe `Falha`) invoca o método `notificarObservadores()`.
     * Espera-se que o observador seja notificado uma única vez.
     */
    @Test
    public void deveNotificarObservadorRegistrado() {
        Falha f = new Falha(new DadosFalha(descricao, tipo, idMaquina));
        ObservadorFake obs = new ObservadorFake();
        f.adicionarObservador(obs);

        f.notificarObservadores();

        assertEquals(1, obs.vezesNotificado);
    }
    
    /**
     * Testa se múltiplos observadores registrados são notificados corretamente
     * quando o Subject (a classe `Falha`) invoca o método `notificarObservadores()`.
     * Espera-se que cada observador seja notificado uma única vez.
     */
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
    
    /**
     * Testa se um observador que foi removido da lista de observadores do Subject (a classe `Falha`) não é mais notificado quando `notificarObservadores()`
     * é invocado. Esperase que o observador não seja notificado nenhuma vez.
     */
    
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
