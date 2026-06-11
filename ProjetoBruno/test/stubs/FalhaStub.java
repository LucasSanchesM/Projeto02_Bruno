package stubs; 
 
import domain.Falha; 
import model.DadosFalha; 
import services.EstadoFalha; 
 
public class FalhaStub extends Falha { 
 
    private EstadoFalha estadoAtual; 
    private boolean maquinaParada;
    private int horasRestantes = 24;
    public String categoria;
    // ALTERAÇÃO: Atributo adicionado para guardar a referência do stub de dados recebido
    private final DadosFalha dadosInternos; 

    public FalhaStub(DadosFalha dados) { 
        super(dados); 
        this.dadosInternos = dados; 
    } 
    
    
    @Override
    public String getCategoria() {
        return this.dadosInternos.getTipo();
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
        
        this.maquinaParada = maquinaParada;
    }

    @Override
    public boolean isMaquinaParada() {
        
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