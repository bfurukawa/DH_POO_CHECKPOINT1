import entities.Cliente;
import entities.subclass.Endereco;
import entities.subclass.subsubclass.Bulldog;
import entities.subclass.subsubclass.ChowChow;
import entities.subclass.subsubclass.Shitzu;

public class programaTeste {
    public static void main(String[] args) {
        Endereco endereco1 = new Endereco(1, "Avenida do centro","cidade pequena","AM","00000-001");
        Endereco endereco2 = new Endereco(2, "Avenida do sul","cidade media","PI","00000-002");
        Endereco endereco3 = new Endereco(3, "Avenida do norte","cidade grabde","AC","00000-003");
        Cliente cliente1 = new Cliente(1, "Joao1", "Silva1", 123456789, "(11)99876-1234", endereco1);
        Cliente cliente2 = new Cliente(2, "Joao2", "Silva2", 234567890, "(12)99876-1234", endereco2);
        Cliente cliente3 = new Cliente(3, "Joao3", "Silva3", 345678901, "(13)99876-1234", endereco3);
        Shitzu shitzu = new Shitzu(1,cliente1,"ShitzuBoy",5,true);
        Bulldog bulldog = new Bulldog(1,cliente1,"BulldogBoy",5,true);
        ChowChow chowchow = new ChowChow(1,cliente1,"ChowChowBoy",5,true);
        shitzu.comer();
        chowchow.comer();
        bulldog.comer();

    }
}