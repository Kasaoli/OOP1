public class TesteN1 {

  public static void main(String[] args) {

    Livro livro = new Livro();
    Didatico didatico = new Didatico("História");
    Ficcao ficcao = new Ficcao("Fantasia");
    Infantil infantil = new Infantil(8);

    Livro l1 = didatico;
    Livro l2 = ficcao;
    Livro l3 = infantil;

    Didatico d1 = (Didatico) l1;
    Ficcao f1 = (Ficcao) l2;
    Infantil i1 = (Infantil) l3;

    d1.identificarTipoDoLivro();
    d1.identificarTipoDoLivro(1000);
    f1.identificarTipoDoLivro();
    f1.identificarTipoDoLivro("George R. R. Martin");
    i1.identificarTipoDoLivro();
    i1.identificarTipoDoLivro(true);
    i1.identificarTipoDoLivro(false);

  }

}