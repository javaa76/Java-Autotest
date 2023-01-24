package membershipManagement;
import member.Member;
import member.MultiClubMember;
import member.SingleClubMember;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.Scanner;

public class MembershipManagement {
    final private Scanner reader = new Scanner(System.in);

    private int getIntInput() {
        int choice = 0;
        while (choice == 0) {
            try {
                choice = reader.nextInt();
                if (choice == 0) throw new InputMismatchException();
                reader.nextLine(); // Необходимо для чтения новой строки, особенность работы Сканера
            }
            catch (InputMismatchException e) {
                reader.nextLine(); // Аналогично, если не сработал трай, то чтоб символ не был поглощен
                System.out.println("Ошибка: Некоректный ввод. Попробуйте ввести заново:");
            }
        }
        return choice;
    }

    private void printClubOptions() {
        System.out.println("1) Клуб Меркурий");
        System.out.println("2) Клуб Нептун");
        System.out.println("3) Клуб Юпитер");
        System.out.println("4) Мульти Клубы");
    }

    public int getChoice() {
        int choice;
        System.out.println("Добро пожаловать в Озон фитнес центр");
        System.out.println("=====================================");
        System.out.println("1) Добавить участника");
        System.out.println("2) Удалить участника");
        System.out.println("3) Показать информацию об участнике");
        System.out.print("Выберите пункт меню (или введите -1 для выхода):");
        choice = getIntInput();
        return choice;
    }

    public String addMembers(LinkedList<Member> m) {
        String name;
        int club;
        String mem ="";
        double fees;
        int memberID;
        Member mbr;
        Calculator<Integer> cal;

        //Создание имени посетителя
        System.out.print("Введите имя посетителя: ");
        name = reader.nextLine();

        //Привязка посетителя к клубу
        printClubOptions();
        club = getIntInput();
        while (club < 1 || club > 4) {
            System.out.println("Введенное значение некорректно. От 1 до 4 допустимо");
            System.out.print("Введите значение: ");
            club = getIntInput();
        }

        if (m.size() > 0 ) {  // Вычисление ID участника
            memberID = m.getLast().getMemberID() + 1;
        }
        else memberID = 1;

        if (club != 4) {
            cal = (n) -> { // Лямбда для вычисления оплаты
                switch (n) {
                    case 1:
                        return 900;
                    case 2:
                        return 950;
                    case 3:
                        return 1000;
                    default:
                        return -1;
                }
            };
            fees = cal.CalculateFees(club);
            mbr = new SingleClubMember('S', memberID, name, fees, club);
            m.add(mbr);
            mem = mbr.toString();
            System.out.println("Mem = " + mem);
            System.out.println("\nСТАТУС: Участник одиночного клуба успешно добавлен\n");
        }
        else {
            cal = (n)-> {
              switch (n) {
                  case 4:
                      return 1200;
                  default:
                      return -1;
              }
            };
            fees = cal.CalculateFees(club);
            mbr = new MultiClubMember('M', memberID, name, fees, 100);
            m.add(mbr);
            mem = mbr.toString();
            System.out.println("\nСТАТУС: Участник мульти клубов успешно добавлен\n");
        }
       return mem;
    }

    public void removeMember(LinkedList<Member> m) {
        int memberID;
        System.out.print("Введите идентификатор участника для удаления: ");
        memberID = getIntInput();
        for (int i = 0; i < m.size(); i++) {
            if (m.get(i).getMemberID() == memberID) {
                m.remove(i);
                System.out.println("Участник с ID - " + memberID + " уcпешно удален");
                return;
            }
        }
        System.out.println("Участника с ID - " + memberID + " не найден!");
    }

    public void printMemberInfo(LinkedList<Member> m) {
        int memberID;
        System.out.print("Введите идентификатор участника для удаления: ");
        memberID = getIntInput();
        for (int i = 0; i < m.size(); i++) {
            if (m.get(i).getMemberID() == memberID) {
                String[] memberInfo = m.get(i).toString().split(", ");;
                if (memberInfo[0] == "S") {
                    System.out.println("Тип участника = S");
                }
                else System.out.println("Тип участника = M");
                System.out.println("ID участника = " + memberInfo[1]);
                System.out.println("Имя участника = " + memberInfo[2]);
                System.out.println("Оплата посещения = " + memberInfo[3]);
                if (memberInfo[0] == "S") System.out.println("Клубный ID = " + memberInfo[4]);
                else System.out.println("Скидка мультиклуба = " + memberInfo[4]);
                return;
            }
        }
        System.out.println("Участника с ID - " + memberID + " не найден!");

    }

 }
