package br.com;

import java.io.*;

import java.util.Scanner;

public class Teclado {
	/*public static void main (String args[]) {
		DataInputStream entrada = new DataInputStream(System.in);
		String nome;
		System.out.println("Informe seu nome: ");
		try {
			nome=entrada.readLine();
			System.out.println("Seu nome �: " + nome);
		} catch(IOException e){
			System.out.println("N�o foi poss�vel ler seu nome.");
		}
	}*/
	
	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		String nome;
		System.out.println("Informe seu nome: ");
		nome=entrada.next();
		System.out.println("Seu nome �: " + nome);
	}
	
	}


