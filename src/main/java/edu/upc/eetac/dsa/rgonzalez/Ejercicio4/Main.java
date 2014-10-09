package edu.upc.eetac.dsa.rgonzalez.Ejercicio4;


public class Main {
	public static void main(String[] args){
		Archivo archivo = new Archivo();
		System.out.println(archivo.cuentaChars());
		archivo.leerFichero();
		archivo.escribirFichero();
	}

}