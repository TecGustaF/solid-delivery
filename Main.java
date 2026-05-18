class Pedido {
    int id;

    Pedido(int id) {
        this.id = id;
    }
}

class PedidoService {
    void salvar(Pedido pedido) {
        System.out.println("Pedido salvo: " + pedido.id);
    }

    void exibir(Pedido pedido) {
        System.out.println("Pedido ID: " + pedido.id);
    }
}

interface Pagamento {
    void pagar();
}

class Pix implements Pagamento {
    public void pagar() {
        System.out.println("Pagamento via PIX");
    }
}

class Cartao implements Pagamento {
    public void pagar() {
        System.out.println("Pagamento via Cartão");
    }
}

class Dinheiro implements Pagamento {
    public void pagar() {
        System.out.println("Pagamento em Dinheiro");
    }
}

class Produto {
    void info() {
        System.out.println("Produto");
    }
}

class Pizza extends Produto {
    void info() {
        System.out.println("Pizza");
    }
}

class Hamburguer extends Produto {
    void info() {
        System.out.println("Hamburguer");
    }
}

class Bebida extends Produto {
    void info() {
        System.out.println("Bebida");
    }
}

interface Relatorio {
    void gerar();
}

interface Entrega {
    void entregar();
}

class SistemaRelatorio implements Relatorio {
    public void gerar() {
        System.out.println("Relatório gerado");
    }
}

class SistemaEntrega implements Entrega {
    public void entregar() {
        System.out.println("Entrega realizada");
    }
}

interface Notificacao {
    void enviar();
}

class Email implements Notificacao {
    public void enviar() {
        System.out.println("Email enviado");
    }
}

class WhatsApp implements Notificacao {
    public void enviar() {
        System.out.println("WhatsApp enviado");
    }
}

class SistemaNotificacao {
    private Notificacao notificacao;

    SistemaNotificacao(Notificacao notificacao) {
        this.notificacao = notificacao;
    }

    void notificar() {
        notificacao.enviar();
    }
}

public class Main {
    public static void main(String[] args) {

        Pedido pedido = new Pedido(1);
        PedidoService service = new PedidoService();

        service.salvar(pedido);
        service.exibir(pedido);

        Pagamento pagamento = new Pix();
        pagamento.pagar();

        Produto produto = new Pizza();
        produto.info();

        SistemaRelatorio relatorio = new SistemaRelatorio();
        relatorio.gerar();

        SistemaEntrega entrega = new SistemaEntrega();
        entrega.entregar();

        SistemaNotificacao notificacao =
                new SistemaNotificacao(new Email());

        notificacao.notificar();
    }
}