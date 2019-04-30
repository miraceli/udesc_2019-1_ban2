package modelo;

public class Especie {
	private int codespecie;
	private String nomeespecie;
	private String expectativaespecie;


	public Especie(int codespecie, String nomeespecie, String expectativaespecie) {
		this.codespecie = codespecie;
		this.nomeespecie = nomeespecie;
		this.expectativaespecie = expectativaespecie;
	}

	public int getCodespecie() {
		return codespecie;
	}

	public String getNomeespecie() {
		return nomeespecie;
	}

	public String getExpectativaespecie() {
		return expectativaespecie;
	}

}
