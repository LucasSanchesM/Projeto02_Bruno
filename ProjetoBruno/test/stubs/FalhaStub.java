package stubs; 
 
import domain.Falha; 
import model.DadosFalha; 
import services.EstadoFalha; 
 
public class FalhaStub extends Falha { 
 
    private EstadoFalha estadoAtual; 
    private boolean maquinaParada;
    private int horasRestantes = 24;
    public String categoria;

    public FalhaStub(DadosFalha dados) { 
        super(dados); 
    } 
    
    
    @Override
    public void atualizarHorasRestantes(int horas){
        this.horasRestantes = horas;
    }
    
    @Override
    public int getHorasRestantesSLA(){
        return horasRestantes;
    }
    
    @Override
    public void setMaquinaParada(boolean maquinaParada) {
        // Ignora qualquer lógica da classe real e armazena localmente
        this.maquinaParada = maquinaParada;
    }

    @Override
    public boolean isMaquinaParada() {
        // Garante que o motor de priorização leia o valor do stub
        return this.maquinaParada;
    }
 
    @Override 
    public void setEstado(EstadoFalha novoEstado) { 
        this.estadoAtual = novoEstado; 
    } 
 
    @Override 
    public EstadoFalha getEstadoAtual() { 
        return estadoAtual; 
    } 
    
    
}