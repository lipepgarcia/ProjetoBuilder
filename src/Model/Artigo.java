package Model;

import java.util.Date;
import java.util.List;


public interface Artigo {
    
    void setAutor(String nome);
    void setTitulo(String nome);
    void setMarcacoes(List marcadores);
    void setPaginas(int paginas);
    void setDataDaPublicacao(Date data);
    void setTexto(String texto);
    String toString();
}
