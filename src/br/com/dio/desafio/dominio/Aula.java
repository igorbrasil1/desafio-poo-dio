package br.com.dio.desafio.dominio;

public class Aula extends Atividade {

    private int cargaHoraria;
    private Boolean concluido = false;

    public Aula(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public int getCargaHoraria() {
        return 0;
    }

    @Override
    public Boolean isConcluido() {
        return concluido;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public void setConcluido(Boolean concluido) {
        this.concluido = concluido;
    }

    @Override
    public String toString() {
        return "Aula {" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", concluido='" + concluido + '\'' +
                '}';
    }
}
