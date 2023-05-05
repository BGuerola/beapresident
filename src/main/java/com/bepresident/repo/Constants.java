package com.bepresident.repo;

import java.util.HashMap;
import java.util.Map;
import java.io.*;
import org.springframework.context.annotation.*;

public final class Constants {
	
	public static enum Partits {Progresista, Liberal};
	public static enum Raza{Blanco, Afroamericano, Hispano};
	public static enum Sexo{Hombre, Mujer};
	public static enum Demografia{Blanca,Afroamericanos, Hispanos};
	public static enum Nivell{Alt, Mig, Baix};
	public static enum TipusSocial{Industrial, Rural, Serveis};
	public static enum Eleccions{Municipals, Estatals, Nacionals};


    /*Accions publicitaries*/
    
    @Bean
    Map<String, Integer> publi() {
        Map<String, Integer> publicitat = new HashMap<>();
        publicitat.put("puntBlancs", 5);
        publicitat.put("puntAfros", 5);
        publicitat.put("puntHisp", 5);
        publicitat.put("puntNAlt", 5);
        publicitat.put("puntNMig", 5);
        publicitat.put("puntNBaix", 5);
        publicitat.put("puntIndus", 5);
        publicitat.put("puntRural", 5);
        publicitat.put("puntServ", 5);
        return publicitat;
    }
	

    @Bean
    Map<String, Integer> EventBn() {
		Map<String, Integer>events = new HashMap<>();
		events.put("puntBlancs",5);
		events.put("puntAfros",5);
		events.put("puntHisp",5);
		events.put("puntNAlt",5);
		events.put("puntNMig",5);
		events.put("puntNBaix",5);
		events.put("puntIndus",5);
		events.put("puntRural",5);
		events.put("puntServ",5);
		return events;
    }

	    
    @Bean
    Map<String, Integer> LobbBn() {
		Map<String, Integer>armes = new HashMap<>();
		armes.put("diners",500);
		armes.put("puntBlancs",5);
		armes.put("puntAfros",5);
		armes.put("puntHisp",5);
		armes.put("puntNAlt",5);
		armes.put("puntNMig",5);
		armes.put("puntNBaix",5);
		armes.put("puntIndus",5);
		armes.put("puntRural",5);
		armes.put("puntServ",5);
		return armes;
    }

    @Bean
    Map<String, Integer> programaProgressitaBn() {
		Map<String, Integer>regInmig = new HashMap<>();
		regInmig.put("diners",500);
		regInmig.put("puntBlancs",5);
		regInmig.put("puntAfros",5);
		regInmig.put("puntHisp",5);
		regInmig.put("puntNAlt",5);
		regInmig.put("puntNMig",5);
		regInmig.put("puntNBaix",5);
		regInmig.put("puntIndus",5);
		regInmig.put("puntRural",5);
		regInmig.put("puntServ",5);
		return regInmig;
    }
    
    @Bean
    Map<String, Integer> programaLliberal() {
		Map<String, Integer>castInmig = new HashMap<>();
		castInmig.put("diners",500);
		castInmig.put("puntBlancs",5);
		castInmig.put("puntAfros",5);
		castInmig.put("puntHisp",5);
		castInmig.put("puntNAlt",5);
		castInmig.put("puntNMig",5);
		castInmig.put("puntNBaix",5);
		castInmig.put("puntIndus",5);
		castInmig.put("puntRural",5);
		castInmig.put("puntServ",5);
		return castInmig;
    }
    
}
