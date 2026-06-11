package Observer;

import domain.Falha;
import model.DadosFalha;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import stubs.DadosFalhaStub;
import stubs.FalhaStub;
import stubs.ObserverStub;

/**
 * Classe de testes unitários para verificar o comportamento básico do padrão Observer
 * na classe Falha. Estes testes focam na funcionalidade de registro, notificação
 * e remoção de observadores, sem considerar as transições de estado da Falha.
 * * @author vasco
 */
public class ObserverTest {
    
    // Facilitar e padronizar parâmetros
    private final String descricao = "Motor meu parou";
    private final String tipo = "Mecânica";
    private final int idMaquina = 1;
    
    /**
     * Testa se um observador registrado é notificado corretamente quando o Subject
     * (a classe Falha) invoca o método notificarObservadores().
     * Espera-se que o observador seja notificado uma única vez.
     */
    @Test
    public void deveNotificarObservadorRegistrado() {
        FalhaStub f = new FalhaStub(new DadosFalhaStub());
        ObserverStub obs = new ObserverStub();
        f.adicionarObservador((ObservadorFalha) obs);

        f.notificarObservadores();

        // Alterado de obs.vezesNotificado para obs.getVezesNotificado()
        assertEquals(1, obs.getVezesNotificado());
    }
    
    /**
     * Testa se múltiplos observadores registrados são notificados corretamente
     * quando o Subject (a classe Falha) invoca o método notificarObservadores().
     * Espera-se que cada observador seja notificado uma única vez.
     */
    @Test
    public void deveNotificarMultiplosObservadores() {
        FalhaStub f = new FalhaStub(new DadosFalhaStub());
        ObserverStub obs1 = new ObserverStub();
        ObserverStub obs2 = new ObserverStub();
        ObserverStub obs3 = new ObserverStub();
        f.adicionarObservador((ObservadorFalha) obs1);
        f.adicionarObservador((ObservadorFalha) obs2);
        f.adicionarObservador((ObservadorFalha) obs3);

        f.notificarObservadores();

        // Alterado para usar o método getter em cada instância
        assertEquals(1, obs1.getVezesNotificado());
        assertEquals(1, obs2.getVezesNotificado());
        assertEquals(1, obs3.getVezesNotificado());
    }
    
    /**
     * Testa se um observador que foi removido da lista de observadores do Subject 
     * (a classe Falha) não é mais notificado quando notificarObservadores() é invocado. 
     * Espera-se que o observador não seja notificado nenhuma vez.
     */
    @Test
    public void naoDeveNotificarObservadorRemovido() {
        FalhaStub f = new FalhaStub(new DadosFalhaStub());
        ObserverStub obs = new ObserverStub();
        f.adicionarObservador((ObservadorFalha) obs);
        f.removerObservador((ObservadorFalha) obs);

        f.notificarObservadores();

        // Corrigido de ObservadorFalha para usar a instância 'obs' com o getter
        assertEquals(0, obs.getVezesNotificado());
    }
}
