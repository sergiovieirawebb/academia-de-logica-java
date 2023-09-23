package exercicios.POO.E08;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Data {
	/*
	 * Escreva uma classe Data cuja instância (objeto) represente uma data. Esta
	 * classe deverá dispor dos seguintes métodos:
	 * 
	 * - a. Construtor: define a data que determinado objeto (através de parâmetro),
	 * este método verifica se a data está correta, caso não esteja a data é
	 * configurada como 01/01/0001
	 * 
	 * - b. Compara: recebe como parâmetro um outro objeto da Classe data, compare
	 * com a data corrente e retorne:
	 * 		- i. 0 se as datas forem iguais;
	 * 		- ii. 1 se a data corrente for maior que a do parâmetro;
	 * 		- iii. -1 se a data do parâmetro for maior que a corrente.
	 * 
	 * - c. GetDia: retorna o dia da data
	 * 
	 * - d. GetMes: retorna o mês da data
	 * 
	 * - e. GetMesExtenso: retorna o mês da data corrente por extenso
	 * 
	 * - f. GetAno: retorna o ano da data
	 * 
	 * - g. IsBissexto: retorna verdadeiro se o ano da  data corrente for bissexto e
	 * falso caso contrário.
	 * 
	 * - h. Clone: o objeto clona a si próprio, para isto, ele cria um novo objeto da
	 * classe Data com os mesmos valores de atributos e retorna sua referência pelo método
	 */

	private LocalDate data;
	private DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

	public Data(String data) {
		setData(data);
	}

	public int comparar(String data) {
		LocalDate dataCorrente = LocalDate.parse(data, dateFormatter);
		return dataCorrente.isAfter(this.data) ? -1 : dataCorrente.isBefore(this.data) ? 1 : 0;
	}

	public int getDia() {
		return data.getDayOfMonth();
	}

	public int getMes() {
		return data.getMonthValue();
	}

	public String getMesExtenso() {
		String[] meses = { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro",
				"Outubro", "Novembro", "Dezembro" };
		return meses[data.getMonthValue() - 1];
	}

	public int getAno() {
		return data.getYear();
	}

	public boolean isBissexto() {
		return data.isLeapYear();
	}

	public Data clonar() {
		return new Data(getData());
	}

	public String getData() {
		return data.format(dateFormatter);
	}

	public void setData(String data) {
		try {
			this.data = LocalDate.parse(data, dateFormatter);
		} catch (Exception e) {
			this.data = LocalDate.parse("01/01/0001", dateFormatter);
		}
	}
}
