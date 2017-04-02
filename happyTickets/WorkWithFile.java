package happyTickets.kuznetsov.ru;

import java.io.*;

public class WorkWithFile {
        public static void write(String fileName, String text){
            File file = new File(fileName);

            try {
                if(!file.exists()){
                    file.createNewFile();
                }
                PrintWriter out = new PrintWriter(file.getAbsoluteFile());

                try {
                    //Записываем строку в файл
                    out.print(text);
                } finally {
                    out.close();
                }
            } catch(IOException e) {
                throw new RuntimeException(e);
            }
        }

        //Метод для чтения значений из файла.
        public static String read(String fileName) throws FileNotFoundException {
            //Объект для построения строки
            StringBuilder sb = new StringBuilder();
            File file = new File(fileName);

            exists(fileName);

            try{
                //Объект для чтения файла в буфер
                BufferedReader in = new BufferedReader(new FileReader( file.getAbsoluteFile()));
                try{
                    //Построчно считываем файл
                    String s;
                    while ((s = in.readLine()) != null) {
                        sb.append(s);
                        sb.append("\n");
                    }
                } finally {
                    in.close();
                }
            } catch(IOException e) {
                throw new RuntimeException(e);
            }

            return sb.toString();
        }

        //Метод для создания файла(при отсутствии)
        private static void exists(String fileName) throws FileNotFoundException {
            File file = new File(fileName);
            if (!file.exists()){
                throw new FileNotFoundException(file.getName());
            }
        }
}
