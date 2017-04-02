package happyTickets.kuznetsov.ru;

public class HappyTickets {
        public static String happyTicket(String str) {
            try {
                System.out.println(str);
            } catch (NumberFormatException e) {
                System.err.println("Ошибка формата строки!");
            }
            //Разделение строки на подстроки
            String[] arrayOfTicketsString = str.split("\n");

            //Массивы для хранения цифр счастливого билета
            int[] ticketNumbersInt = new int[6];
            String[] ticketNumbersString;

            String happy = "";

            for (int j = 0; j < arrayOfTicketsString.length; j++){
                ticketNumbersString = arrayOfTicketsString[j].split("");

                for (int i = 0; i < ticketNumbersString.length; i++){
                    ticketNumbersInt[i] = Integer.parseInt(ticketNumbersString[i]);
                }

                if(ticketNumbersInt[0]+ticketNumbersInt[1]+ticketNumbersInt[2] ==
                        ticketNumbersInt[3]+ticketNumbersInt[4]+ticketNumbersInt[5]){
                    happy += arrayOfTicketsString[j] + " ";
                }
            }

            return (happy);
        }
}