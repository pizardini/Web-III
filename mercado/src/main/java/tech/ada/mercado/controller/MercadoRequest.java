package tech.ada.mercado.controller;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import tech.ada.mercado.model.Mercado;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class MercadoRequest {
    private String nome;
    private String moeda;
    private Double saldo;

    private Double valor;

    public Mercado update (Mercado mercado) {
        mercado.setNome(this.nome);
        mercado.setMoeda(this.moeda);
        mercado.setSaldo(this.saldo);
        mercado.setValor(this.valor);

        return mercado;
    }
    public Mercado create() {
        Mercado mercado = new Mercado();
        mercado.setNome(this.nome);
        mercado.setMoeda(this.moeda);
        mercado.setSaldo(this.saldo);
        mercado.setValor(this.valor);
        return mercado;
    }
}
