package ObserverTest;

import Observer.ObserverGestaoFalha;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Teste 09: Notificar vários assinantes.
 * Simula o disparo para todo mundo ao mesmo tempo (Painel, Técnico e SLA).
 * Garante que a lista roda e avisa geral sem travar o código.
 * * @author Ana Livia Vasconcellos 
 */
public class ObserverTesteMultiplosAssinantes {

    @Test
    public void deveNotificarMultiplosObservadoresComSucesso() {
        ObserverGestaoFalha observerManager = new ObserverGestaoFalha();

        observerManager.adicionarObservador();
        observerManager.adicionarObservador();
        observerManager.adicionarObservador();

        assertTrue(observerManager.notificarObservadores());
        assertEquals(3, observerManager.getTotalObservadores());
    }
}