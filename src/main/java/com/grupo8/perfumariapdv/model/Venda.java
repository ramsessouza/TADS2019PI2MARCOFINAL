package com.grupo8.perfumariapdv.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Venda {
    private Integer id;
    private Date data;
    private Float subtotal;
    private Float pagamentoDinheiro;
    private Float pagamentoCartao;
    private Cliente cliente;
    private ArrayList<ItemVenda> itensVenda = new ArrayList<ItemVenda>();
    
    public Venda() {
        cliente = new Cliente();
        itensVenda = new ArrayList<ItemVenda>();
    }
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public Float getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(Float subtotal) {
        this.subtotal = subtotal;
    }

    public Float getPagamentoDinheiro() {
        return pagamentoDinheiro;
    }

    public void setPagamentoDinheiro(Float pagamentoDinheiro) {
        this.pagamentoDinheiro = pagamentoDinheiro;
    }

    public Float getPagamentoCartao() {
        return pagamentoCartao;
    }

    public void setPagamentoCartao(Float pagamentoCartao) {
        this.pagamentoCartao = pagamentoCartao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<ItemVenda> getItensVenda() {
        return itensVenda;
    }

    public void setItensVenda(ArrayList<ItemVenda> itensVenda) {
        this.itensVenda = itensVenda;
    }
    
    public void adicionarItem(ItemVenda itemVenda){
        this.itensVenda.add(itemVenda);
    }
    
}
