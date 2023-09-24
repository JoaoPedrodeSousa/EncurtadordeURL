package entities;

import java.time.LocalDate;

public class Url {

    private String urlOriginal;
    private String urlEncurtada;

    private Integer quantidadeDeAcesso = 0;
    private final LocalDate dataGeracao = LocalDate.now();
    private LocalDate dataExpiracao;



    public Url(String urlOriginal, String urlEncurtada, Integer quantidadeDeAcesso, LocalDate dataExpiracao) {
        this.urlOriginal = urlOriginal;
        this.urlEncurtada = urlEncurtada;
        this.quantidadeDeAcesso = quantidadeDeAcesso;
        this.dataExpiracao = dataGeracao.plusDays(7);
    }

    public String getUrlOriginal() {
        return urlOriginal;
    }

    public String getUrlEncurtada() {
        return urlEncurtada;
    }

    public Integer getQuantidadeDeAcesso() {
        return quantidadeDeAcesso;
    }

    public LocalDate getDataGeracao() {
        return dataGeracao;
    }

    public LocalDate getDataExpiracao() {
        return dataExpiracao;
    }

    public void setUrlOriginal(String urlOriginal) {
        this.urlOriginal = urlOriginal;
    }

    public void setUrlEncurtada(String urlEncurtada) {
        this.urlEncurtada = urlEncurtada;
    }

    public void setQuantidadeDeAcesso(Integer quantidadeDeAcesso) {
        this.quantidadeDeAcesso = quantidadeDeAcesso;
    }
}
