package Observer;

/**
 * Gerenciador simples do padrão Observer.
 * Serve para controlar os assinantes das falhas (adicionar, remover e notificar),
 * @author Ana Livia Vasconcellos 
 */
public class ObserverGestaoFalha {
    
    private int totalObservadores = 0;

    public void adicionarObservador() {
        this.totalObservadores++;
        System.out.println("Observador adicionado com sucesso. Total: " + totalObservadores);
    }

    public void removerObservador() {
        if (totalObservadores > 0) {
            this.totalObservadores--;
        }
        System.out.println("Observador removido com sucesso. Total: " + totalObservadores);
    }

    public boolean notificarObservadores() {
        System.out.println("Disparando notificações para todos os " + totalObservadores + " assinantes...");
        return totalObservadores > 0;
    }
    
    public int getTotalObservadores() {
        return this.totalObservadores;
    }
}