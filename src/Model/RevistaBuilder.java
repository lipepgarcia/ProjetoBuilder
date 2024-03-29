package Model;

import java.util.Arrays;
import java.util.Calendar;

public class RevistaBuilder implements ArtigoBuilder{

    private Artigo artigo;
    
    public RevistaBuilder() {
        this.artigo = new Revista();
    }
    
    public static ArtigoBuilder builder() {
        return new RevistaBuilder();
    }
    
    @Override
    public ArtigoBuilder autor(String nome) {
        this.artigo.setAutor(nome);
        return this;
    }

    @Override
    public ArtigoBuilder titulo(String nome) {
        this.artigo.setTitulo(nome);
        return this;
    }

    @Override
    public ArtigoBuilder assuntos(String... assuntos) {
        this.artigo.setMarcacoes(Arrays.asList(assuntos));
        return this;
    }

    @Override
    public ArtigoBuilder totalDePaginas(int total) {
        this.artigo.setPaginas(total);
        return this;
    }

    @Override
    public ArtigoBuilder publicadoEm(int dia, int mes, int ano) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(ano, mes, dia);
        this.artigo.setDataDaPublicacao(calendar.getTime());
        return this;
    }

    @Override
    public ArtigoBuilder texto(String texto) {
        this.artigo.setTexto(texto);
        return this;
    }

    @Override
    public Artigo get() {
        return this.artigo;
    }
    
}
