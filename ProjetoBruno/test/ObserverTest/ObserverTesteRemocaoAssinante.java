package ObserverTest;

import Observer.ObserverGestaoFalha;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Teste 10: Remover assinatura.
 * Testa se o cancelamento de inscrição funciona.
 * Se a pessoa sair da lista e a gente notificar, o sistema avisa que não tem ninguém ouvindo.
 * * @author Ana Livia Vasconcellos
 */
public class ObserverTesteRemocaoAssinante {

    @Test
    public void deveRemoverObservadorComSucesso() {
        ObserverGestaoFalha observerManager = new ObserverGestaoFalha();

        observerManager.adicionarObservador();
        observerManager.removerObservador();

        assertFalse(observerManager.notificarObservadores());
        assertEquals(0, observerManager.getTotalObservadores());
    }
}