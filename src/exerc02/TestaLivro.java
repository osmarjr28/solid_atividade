package exercico02;

public class TestaLi {

    public static void main (String[] args){

      Livro livro = new Livro( "Clean Code", "Robert Cocil", 2008, 390, "978281111");

      Fatura fatura = new Fatura(livro, 1,0.10, 0.05);

      ImpFatura imprimir = new ImpFatura(fatura);
      imprimir.imprimir();


    }
}
