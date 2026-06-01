package ObserverTest;

import Observer.ObserverGestaoFalha;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Teste 08: Notificar um único assinante.
 * Valida o comportamento quando só tem 1 observador na lista.
 * Garante que ele é adicionado e recebe o alerta numa boa.
 * * @author Ana Livia Vasconcellos
 * @since 2026
 */
public class ObserverTesteUmAssinante {

    @Test
    public void deveAdicionarENotificarUmObservadorComSucesso() {
        ObserverGestaoFalha observerManager = new ObserverGestaoFalha();

        observerManager.adicionarObservador();

        assertTrue(observerManager.notificarObservadores());
        assertEquals(1, observerManager.getTotalObservadores());
    }
}