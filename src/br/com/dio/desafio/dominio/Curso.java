package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Set;

public class Curso extends Conteudo {

    private Set<Atividade> atividades = new LinkedHashSet<>();

    @Override
    public double calcularXp() {
        return XP_PADRAO * getCargaHorariaConcluida();
    }

    public Curso() {
    }

    public int getCargaHoraria() {
        return atividades.stream().mapToInt(o -> o.getCargaHoraria()).sum();
    }

    public int getCargaHorariaConcluida() {
        return atividades.stream().filter(o -> o.isConcluido()).mapToInt(o -> o.getCargaHoraria()).sum();
    }

    public Set<Atividade> getAtividades() {
        return atividades;
    }

    public void setAtividades(Set<Atividade> atividades) {
        this.atividades = atividades;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + getCargaHoraria() +
                ", atividades=" + atividades +
                '}';
    }
}
