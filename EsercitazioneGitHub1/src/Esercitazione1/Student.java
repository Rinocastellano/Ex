package Esercitazione1;

public class Student {
	private String nome;
	private String cognome;
	private Integer matricola;
	//constructor
	public Student(String nome, String cognome, Integer matricola) {
		super();
		this.nome = nome;
		this.cognome = cognome;
		this.matricola = matricola+1;
	}
	
<<<<<<< HEAD
	public String  toString() {
		return "numero :" + matricola; //okok
=======
	public void Inutile() {
		int i=0;
		i++;
>>>>>>> refs/heads/local1
	}
	
	//hashcode and equals
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cognome == null) ? 0 : cognome.hashCode());
		result = prime * result + ((matricola == null) ? 0 : matricola.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (cognome == null) {
			if (other.cognome != null)
				return false;
		} else if (!cognome.equals(other.cognome))
			return false;
		if (matricola == null) {
			if (other.matricola != null)
				return false;
		} else if (!matricola.equals(other.matricola))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		return true;
	}
	

}
