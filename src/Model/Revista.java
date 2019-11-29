package Model;

import java.util.Date;
import java.util.List;

public class Revista implements Artigo{
    
    private String autor;
    private String titulo;
    private List marcacoes;
    private int paginas;
    private Date publicacao;
    private String texto;

    public String getAutor() {
        return autor;
    }

    @Override
    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    @Override
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List getMarcacoes() {
        return marcacoes;
    }

    public void setMarcacoes(List marcacoes) {
        this.marcacoes = marcacoes;
    }

    public int getPaginas() {
        return paginas;
    }

    @Override
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public Date getPublicacao() {
        return publicacao;
    }

    public void setPublicacao(Date publicacao) {
        this.publicacao = publicacao;
    }

    public String getTexto() {
        return texto;
    }

    @Override
    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return "Revista{" + "autor=" + autor + ", titulo=" + titulo + ", marcacoes=" + marcacoes + ", paginas=" + paginas + ", publicacao=" + publicacao + ", texto=" + texto + '}';
    }

    @Override
    public void setDataDaPublicacao(Date data) {
        this.publicacao = data;
    }
    
}
