package ClientSever;

import java.io.Serializable;

public class Operation implements Serializable {
    // Déclaration des attributs pour les deux nombres et l'opérateur
    int nombre1;
    int nombre2;
    String operateur;

   
    // Constructeur pour initialiser les valeurs des attributs
    public Operation(int nombre1, int nombre2, String operateur) {
        this.nombre1 = nombre1;
        this.nombre2 = nombre2;
        this.operateur = operateur;
    }


	public int getNombre1() {
		return nombre1;
	}


	public void setNombre1(int nombre1) {
		this.nombre1 = nombre1;
	}


	public int getNombre2() {
		return nombre2;
	}


	public void setNombre2(int nombre2) {
		this.nombre2 = nombre2;
	}


	public String getOperateur() {
		return operateur;
	}


	public void setOperateur(String operateur) {
		this.operateur = operateur;
	}
    

}
