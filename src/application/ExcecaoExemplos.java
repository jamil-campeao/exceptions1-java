package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Reservation;

public class ExcecaoExemplos {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Numero do quarto: ");
		int roomNumber = sc.nextInt();
		
		System.out.print("Data do Check-in (dd/MM/yyyy): ");
		Date checkIn = sdf.parse(sc.next());
		
		System.out.print("Data do Check-out (dd/MM/yyyy): ");
		Date checkOut = sdf.parse(sc.next());
		
		if (!checkOut.after(checkIn)) {
			System.out.println("Erro na reserva: A data de check-out deve ser maior que a data de check-in");
		}
		else {
			Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
			System.out.println("Reserva: " + reservation.toString());
		
		
		System.out.println();
		System.out.println("Entre com os dados para atualizar a reserva:");
		
		
		System.out.print("Numero do quarto: ");
		roomNumber = sc.nextInt();
		
		System.out.print("Data do Check-in (dd/MM/yyyy): ");
		checkIn = sdf.parse(sc.next());
		
		System.out.print("Data do Check-out (dd/MM/yyyy): ");
		checkOut = sdf.parse(sc.next());
		
		Date now = new Date();
		if (checkIn.before(now) || checkOut.before(now)) {
			System.out.println("Erro na reserva: As datas atualizadas devem ser futuras as datas anteriores.");
		}
		else if (!checkOut.after(checkIn)) {
			System.out.println("Erro na reserva: A data de check-out deve ser maior que a data de check-in");
		}
		else {
			reservation.updateDates(checkIn, checkOut);
			System.out.println("Reserva: " + reservation.toString());	
		}
		
		}
		
		
		
		sc.close();

	}

}
