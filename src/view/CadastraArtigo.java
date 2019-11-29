package view;

import Model.Artigo;
import Model.BlogBuilder;
import Model.RevistaBuilder;

public class CadastraArtigo {
    
    public static void main(String[] args) {
        Artigo blog = BlogBuilder.builder()
                .autor("Maxwell Laner")
                .titulo("BlogBuilder")
                .assuntos("padrão de projeto", "Builder")
                .publicadoEm(29, 11, 2019)
                .texto("Padrão de projeto Builder - exemplo")
                .get();
        
        System.out.println(blog.toString());
        
        Artigo revista = RevistaBuilder.builder()
                .autor("Gladmir Catarino")
                .titulo("RevistaBuilder")
                .assuntos("padrão de projeto", "Builder")
                .publicadoEm(29, 11, 2019)
                .texto("Padrão de projeto Builder - exemplo")
                .get();
        
        System.out.println(revista.toString());
    }
}
