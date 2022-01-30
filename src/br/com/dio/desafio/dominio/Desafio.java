package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Desafio extends Atividade {

    private LocalDate dataEntrega;

    @Override
    public int getCargaHoraria() {
        return 0;
    }

    @Override
    public Boolean isConcluido() {
        return dataEntrega != null;
    }

    public LocalDate getData() {
        return dataEntrega;
    }

    public void setData(LocalDate dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    @Override
    public String toString() {
        return "Desafio{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + getData() +
                '}';
    }
}
