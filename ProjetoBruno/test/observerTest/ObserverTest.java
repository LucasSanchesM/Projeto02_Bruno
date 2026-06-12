package observerTest;

import services.ObservadorFalha;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import stubs.DadosFalhaStub;
import stubs.FalhaStub;
import stubs.ObserverStub;

/**
 * Classe de testes unitários para verificar o comportamento básico do padrão
 * Observer na classe Falha. Estes testes focam na funcionalidade de registro,
 * notificação e remoção de observadores, sem considerar as transições de estado
 * da Falha.
 *
 * @author Ana Livia Vasconcellos
 * @since 2026
 * @version 1.0.0
 */
public class ObserverTest {

    // Facilitar e padronizar parâmetros
    private final String descricao = "Motor meu parou";
    private final String tipo = "Mecânica";
    private final int idMaquina = 1;

    /**
     * Testa se um observador registrado é notificado corretamente quando a
     * classe falha(um stub) invoca o método notificarObservadores(). Espera-se
     * que o observador seja notificado uma única vez.
     */
    @Test
    public void ct11_deveNotificarObservadorRegistrado() {
        FalhaStub f = new FalhaStub(new DadosFalhaStub());
        ObserverStub obs = new ObserverStub();
        f.adicionarObservador((ObservadorFalha) obs);
        f.notificarObservadores();
        assertEquals(1, obs.getVezesNotificado());
    }

    /**
     * Testa se múltiplos observadores registrados são notificados corretamente
     * quando o a falha (stub) chama o método notificarObservadores(). Espera-se
     * que cada observador seja notificado uma única vez.
     */
    @Test
    public void ct12_deveNotificarMultiplosObservadores() {
        FalhaStub f = new FalhaStub(new DadosFalhaStub());
        ObserverStub obs1 = new ObserverStub();
        ObserverStub obs2 = new ObserverStub();
        ObserverStub obs3 = new ObserverStub();
        f.adicionarObservador(obs1);
        f.adicionarObservador(obs2);
        f.adicionarObservador(obs3);

        f.notificarObservadores();

        assertEquals(1, obs1.getVezesNotificado());
        assertEquals(1, obs2.getVezesNotificado());
        assertEquals(1, obs3.getVezesNotificado());
    }

    /**
     * Testa se um observador que foi removido da lista de observadores da
     * falha(stub) e não é mais notificado quando notificarObservadores() é
     * invocado. Espera-se que o observador não seja notificado nenhuma vez.
     */
    @Test
    public void ct13_naoDeveNotificarObservadorRemovido() {
        FalhaStub f = new FalhaStub(new DadosFalhaStub());
        ObserverStub obs = new ObserverStub();
        f.adicionarObservador(obs);
        f.removerObservador(obs);
        f.notificarObservadores();
        assertEquals(0, obs.getVezesNotificado());
    }
}
