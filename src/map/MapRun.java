package map;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public final class MapRun {
        private MapRun() {
        }

        /**
         * Класс,что запускает реализацю.
         * @param args - 0.
         */
        public static void main(final String[] args) {
                System.out.println("Введите количество "
                                         + "пользователей: ");
                Scanner scan = new Scanner(System.in, "UTF-8");
                int scanInt = scan.nextInt();
                Map<String, String> map = new TreeMap<>();
                for (int i = 0; i < scanInt; i++) {
                        System.out.println("Введите логин");
                        Scanner cin1 = new Scanner(System.in, "UTF-8");
                        String str1 = cin1.nextLine();
                        System.out.println("Введите пароль");
                        Scanner cin2 = new Scanner(System.in, "UTF-8");
                        String str2 = cin2.nextLine();
                        map.put(str1, str2);
                }
                for (Map.Entry<String, String> log : map.entrySet()) {
                        System.out.printf("Логин: %s  Пароль: %s %n",
                                             log.getKey(), log.getValue());
                }

                System.out.println("Введите логин поиска");
                Scanner scanName = new Scanner(System.in, "UTF-8");
                String str = scanName.nextLine();

                for (Map.Entry<String, String> log : map.entrySet()) {
                        if (str.equals(log.getKey())) {
                                System.out.printf("Пароль: %s ",
                                                        log.getValue());
                        }
                }
        }
}
