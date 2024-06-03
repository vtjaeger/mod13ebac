public interface IPessoa {
    String comprimentos(String mensagem);
    default String classe(){
        return getClass().getSimpleName();
    }
}
