package services;

/**
 * Interface usada como contrato para todo model que implementa funcionario.
 *
 * @author Lucas Sanches Marcílio Pereira
 * @since 2026
 * @version 1.0.0
 */
public interface Funcionario {

    int getId();

    String getNome();

    void setId(int id);

    void setNome(String Nome);
}
