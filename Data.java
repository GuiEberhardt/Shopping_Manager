public class Data {
    private int dia;
    private int mes;
    private int ano;

    // Construtor para inicializar todos os atributos e validar a data
    public Data(int dia, int mes, int ano) {
        if (validarData(dia, mes, ano)) {
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        } else {
            System.out.println("Data inválida! Alterando para a data padrão: 1/1/2000");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }

    // Getters e Setters para todos os atributos
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        return dia + "/" + mes + "/" + ano;
    }

    // Método para verificar se o ano é bissexto
    public boolean verificaAnoBissexto() {
        return ehBissexto(ano);
    }

    private boolean validarData(int dia, int mes, int ano) {
        if (ano < 1 || mes < 1 || mes > 12 || dia < 1 || dia > diasNoMes(mes, ano)) {
            return false;
        }
        return true;
    }

    private int diasNoMes(int mes, int ano) {
        int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (mes == 2 && ehBissexto(ano)) {
            return 29;
        }

        return diasPorMes[mes];
    }

    private boolean ehBissexto(int ano) {
        return (ano % 400 == 0) || ((ano % 4 == 0) && (ano % 100 != 0));
    }
}
