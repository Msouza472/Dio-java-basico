package one.digitalinovation.laboojava.entidade.constantes;

public enum Materias {

    M2(15),

    M5(10),

    M10(5);

    private double fator;

    /**
     * Construtor.
     * @param fator Valor por tipo que influencia no cálculo do frete.
     */
    Materias(double fator) {
        this.fator = fator / 100;
    }

    public double getFator() {
        return fator;
    }
}

