package Entidades;

import java.lang.reflect.Array;
import java.time.LocalDateTime;
import java.util.ArrayList;

public class Venda {
    private Cliente cliente;
    private ArrayList<ItemVenda> itensVenda = new ArrayList();
    private LocalDateTime data;

    public Venda(Cliente cliente, LocalDateTime data) {
        this.cliente = cliente;
        this.data = data;
    }

    public void adicionarItemVenda(ItemVenda novoItem){
        itensVenda.add(novoItem);
    }
    public void calcularTotal() {
    }
}
