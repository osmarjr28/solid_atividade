package exercico02;

public class PersistenciaArquivoPdf implements PersistenciaFatura{

    public Fatura fatura;

    public PersistenciaArquivoPdf(Fatura fatura) {
        this.fatura = fatura;
    }

    public Fatura getFatura() {
        return fatura;
    }

    public void setFatura(Fatura fatura) {
        this.fatura = fatura;
    }

    @Override
    public void salvar(Fatura fatura) {

        System.out.println("Salvar a fatura no Arquivo PDF...\n");
        this.fatura.imprimirFatura();

    }

}

