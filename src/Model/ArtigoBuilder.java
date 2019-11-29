package Model;

public interface ArtigoBuilder {
    
    ArtigoBuilder autor(String nome);
    ArtigoBuilder titulo(String nome);
    ArtigoBuilder assuntos(String... assuntos);
    ArtigoBuilder totalDePaginas(int total);
    ArtigoBuilder publicadoEm(int dia, int mes, int ano);
    ArtigoBuilder texto(String texto);

    Artigo get();
}
