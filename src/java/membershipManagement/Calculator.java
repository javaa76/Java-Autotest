package membershipManagement;

public interface Calculator <T extends Number> { // Ограничения - только числа
    double CalculateFees(T clubID);
}
