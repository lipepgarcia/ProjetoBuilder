package Model;

import java.util.Date;
import java.util.List;

public class Blog implements Artigo{

    private String autor;
    private String titulo;
    private List marcadores;
    private int paginas;
    private Date publicacao;
    private String texto;
    
    @Override
    public void setAutor(String nome) {
        this.autor = autor;
    }

    @Override
    public void setTitulo(String nome) {
        this.titulo = titulo;
    }

    @Override
    public void setMarcacoes(List marcadores) {
        this.marcadores = marcadores;
    }

    @Override
    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public void setDataDaPublicacao(Date data) {
        this.publicacao = data;
    }

    @Override
    public void setTexto(String texto) {
        this.texto = texto;
    }

    @Override
    public String toString() {
        return "Blog{" + "autor=" + autor + ", titulo=" + titulo + ", marcadores=" + marcadores + ", paginas=" + paginas + ", publicacao=" + publicacao + ", texto=" + texto + '}';
    }

    public String getAutor() {
        return autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public List getMarcadores() {
        return marcadores;
    }

    public int getPaginas() {
        return paginas;
    }

    public Date getPublicacao() {
        return publicacao;
    }

    public String getTexto() {
        return texto;
    }
    
}
