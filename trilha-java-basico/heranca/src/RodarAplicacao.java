class RodarAplicacao {
    public static void main(String[] args){
        Funcionario funcionario = new Funcionario();
        /*Upcast */
        Funcionario gerente = new Gerente();
        Funcionario faxineiro = new Faxineiro();
        Funcionario vendedor = new Vendedor();

        /*Downcast da erro evitar  usar*/
        Vendedor vendedor_ = (Vendedor) new Funcionario();

    }
}
