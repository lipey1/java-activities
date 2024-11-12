public class Computador {
    String processador;
    String armazenamento;
    int memoriaRAM;

    public Computador(String processador, int memoriaRAM, String armazenamento) {
        this.processador = processador;
        this.memoriaRAM = memoriaRAM;
        this.armazenamento = armazenamento;
    }
    public int ligar(int status){
        if(status == 0){
            System.out.println("Você ligou o computador!");
            status = 1;
        } else {
            System.out.println("O computador já está ligado!");
        }
        return status;
    }

    public int desligar(int status){
        if (status != 0){
            System.out.println("Você desligou o computador!");
            status = 0;
        } else {
            System.out.println("O computador já está desligado!");
        }
        return status;
    }


}
