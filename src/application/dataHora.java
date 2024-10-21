package application;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class dataHora {

	public static void main(String[] args) {
		// INSTACIACAO DE DATA
		
		LocalDate d01 = LocalDate.now();
		
		System.out.println("Data: " + d01);
		
		//INSTACIACAO DE DATA/HORA
		LocalDateTime d02 = LocalDateTime.now();
		
		System.out.println("Data/hora: " + d02);
		
		//INSTACIACAO DE DATA/HORA COM FUSO HORARIO
		Instant d03 = Instant.now(); //PEGA O FUSO HORARIO DE LONDRES
		
		System.out.println("Data hora com fuso horário: " + d03);
		
		//LENDO UMA DATA E IMPRIMINDO
		LocalDate d04 = LocalDate.parse("2024-10-11");
		System.out.println("Data lida: " + d04);
		
		//LENDO UMA DATA/HORA E IMPRIMINDO
		LocalDateTime d05 = LocalDateTime.parse("2024-10-11T20:00:00.2342");
		System.out.println("Data/hora lida: " + d05);
		
		//LENDO UMA DATA/HORA COM FUSO HORARIO E IMPRIMINDO
		Instant d06 = Instant.parse("2024-10-11T01:30:00.2342Z");
		System.out.println("Data/hora lida com fuso horario: " + d06);
		
		
		//LENDO UMA DATA/HORA COM FUSO HORARIO E IMPRIMINDO CONVERTENDO PARA OUTRO FUSO HORARIO
		Instant d07 = Instant.parse("2024-10-11T20:00:00.2342-03:00");
		System.out.println("Data/hora lida com fuso horario convertido:" + d07);
		
		
		//LENDO UMA DATA EM FORMATO DIFERENTE
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		LocalDate d08 = LocalDate.parse("20/07/2022",fmt1);
		System.out.println("Data lida convertida de um outro formato: " + d08);
		
		//LENDO UMA DATA/HORA EM FORMATO DIFERENTE
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		LocalDateTime d09 = LocalDateTime.parse("20/07/2022 09:00",fmt2);
		System.out.println("Data/hora lida convertida de um outro formato: " + d09);
		
		
		//LENDO UMA DATA INFORMANDO MANUALMENTE ANO MES E DIA
		LocalDate d10 = LocalDate.of(2022, 07, 20);
		System.out.println("Data lida informando manualmente ano mes e dia: " + d10);
		
		
		//LENDO UMA DATA/HORA INFORMANDO MANUALMENTE ANO MES E DIA
		LocalDateTime d11 = LocalDateTime.of(2024, 8, 22, 20, 32);
		System.out.println("Data lida informando manualmente ano mes e dia: " + d11);
		
		//FORMATANDO DATAS
		DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		DateTimeFormatter fmt4 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		DateTimeFormatter fmt5 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
		DateTimeFormatter fmt6 = DateTimeFormatter.ISO_DATE_TIME;
		DateTimeFormatter fmt7 = DateTimeFormatter.ISO_INSTANT;
		
		System.out.println("d11: " + d11.format(fmt3));
		System.out.println("d11: " + fmt3.format(d11));//outra forma de se fazer
		System.out.println("d11: " + d11.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))); //outra forma de se fazer
		
		
		System.out.println("d11 com hora: " + d11.format(fmt4));
		
		System.out.println("d06 formatado com fuso horario: " + fmt5.format(d06));
		System.out.println("d11 formatado com data/horario: " + fmt6.format(d11));
		System.out.println("d06 formatado com data/horario e fuso horario: " + fmt7.format(d06));
		
		
		//CONVERTENDO DATA/HORA GLOBAL PARA LOCAL
		
		LocalDate d12 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
		System.out.println(d12);
		
		LocalDate d13 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));
		System.out.println(d13);
		
		LocalDateTime d14 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
		LocalDateTime d15 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));
		
		System.out.println(d14);
		System.out.println(d15);
		
		System.out.println("d04 dia da semana = " + d04.getDayOfWeek());
		System.out.println("d04 Mês do dia = " + d04.getMonthValue());
		
		System.out.println("d15 hora e minutos: " + d15.getHour() +" " + d15.getMinute() );
		
		
//		for(String s: ZoneId.getAvailableZoneIds()) {
//			System.out.println(s);
//		}
//	
		
		//Calculos com Data/Hora
		System.out.println();
		
		LocalDate semanaAnteriorLocalDate = d04.minusDays(7);
		LocalDate proximaSemana = d04.plusDays(7);
		System.out.println("D04: " + d04);
		System.out.println("7 dias atras d04: " + semanaAnteriorLocalDate);
		System.out.println("7 dias depois de d04: " + proximaSemana);
		
		System.out.println();
		
		System.out.println("D05: " + d05);
		LocalDateTime semanaAnteriorLocalDateTime = d05.minusDays(7);
		LocalDateTime proximaSemanaLocalDateTime = d05.plusDays(7);
		
		System.out.println("7 dias atras d05: " + semanaAnteriorLocalDateTime);
		System.out.println("7 dias depois de d05: " + proximaSemanaLocalDateTime);
		
		System.out.println();
		
		System.out.println("D06: " + d06);
		Instant semanaAnteriorInstant = d06.minus(7, ChronoUnit.DAYS);
		Instant proximaSemanaInstant = d06.plus(7, ChronoUnit.DAYS);
		
		System.out.println("7 dias atras d06: " + semanaAnteriorInstant);
		System.out.println("7 dias depois de d06: " + proximaSemanaInstant);
		
		System.out.println();
		
		Duration t1 = Duration.between(semanaAnteriorLocalDateTime, d05);
		System.out.println("t1 dias: " + t1.toDays());
		
		Duration t2 = Duration.between(semanaAnteriorLocalDate.atStartOfDay(), d04.atStartOfDay()); //Convertendo LocalDate para local date time
		System.out.println("t2 dias: " + t2.toDays());
		
		Duration t3 = Duration.between(semanaAnteriorInstant, d06); //Convertendo LocalDate para local date time
		System.out.println("t3 dias: " + t3.toDays());
		
		Duration t4 = Duration.between(d06, semanaAnteriorInstant); //Convertendo LocalDate para local date time
		System.out.println("t4 dias: " + t4.toDays());
		
	}

}
