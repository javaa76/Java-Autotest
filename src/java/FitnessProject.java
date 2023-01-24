import filehandler.FileHandler;
import member.Member;
import membershipManagement.MembershipManagement;

import java.util.LinkedList;
public class FitnessProject {
    public static void main(String[] args) {
        String mem;
        MembershipManagement mm = new MembershipManagement();
        FileHandler fh = new FileHandler();
        LinkedList<Member> members = fh.readFile();
        int choice = mm.getChoice();
        while (choice != -1)
        {
            switch (choice) {
                case 1:
                    mem = mm.addMembers(members);
                    fh.appendFile(mem);
                    break;
                case 2:
                    mm.removeMember(members);
                    fh.overWriteFile(members);
                    break;
                case 3:
                    mm.printMemberInfo(members);
                default:
                    System.out.println("Вы введи неверное значение! ");
                    break;
            }
            choice = mm.getChoice();
        }
        System.out.println("Всего хорошего! До свидания!");
    }
}
