package one.digitalinovation.laboojava.entidade;

import one.digitalinovation.laboojava.entidade.constantes.Materias;

public class Caderno extends Produto{
    Enum tipo;

    public Materias getTipo() {
        return (Materias) tipo;
    }
    public void setTipo(Materias tipo){
        this.tipo = tipo;
    }
    private Materias materias;

    public Materias getMaterias() {
        return materias;
    }
    public void setMaterias(Materias materias) {
        this.materias = materias;
    }


        /**
     * {@inheritDoc}.
     */
    @Override
    public double calcularFrete() {
        return (getPreco() * getQuantidade()) * (1 + ((Materias) tipo).getFator());
    }

    @Override
    public String toString() {
        return "Caderno{" +
                ", Materias=" + materias + '\'' +
                ", codigo='" + getCodigo() + '\'' +
                ", preço='" + getPreco() + '\'' +
                '}';
    }
}
