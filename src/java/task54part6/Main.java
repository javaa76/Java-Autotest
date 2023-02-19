package task54part6;

public class Main {
    static int toInt(String str) {
        if (str.equals("-0")) str = "0";
        if (str.charAt(0) == '-' && str.charAt(1) == '0' && str.length() > 2)
           str = "-" + str.replaceAll("^0{1,}|^-0{1,}","");
        else
            if (str.length() > 2)
                str = str.replaceAll("^0{1,}|^-0{1,}",""); //Замена нулей вначале

        if (!str.matches("\\d{1,}|-\\d{1,}")) { //
            System.out.println("Кривое число! Уберите не числовые значения");
            return -1;
        }
        if ((str.charAt(0) == '-' && str.length() > 11) || // Проверка в стринге что длина соответствует
                (str.length() > 10) && str.charAt(0) != '-')
                {
                    System.out.println("Число слишком велико по длине для Int");
                    return -1;
                }
        int result = 0; // Сюда сохраняет результат
        double mn = Math.pow(10, str.length() - 1); // Множитель
        if ((str.length() < 12 && str.charAt(0) == '-') ||
            (str.length() < 11 && str.charAt(0) != '-')) {       // Если длина меньше 10 символов, то просто конвертируем
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) == '-') {      // Если минус в числе стоит
                    mn /= 10;
                    continue;
                }
                result += (str.charAt(i) - '0') * (int)mn;
                mn /= 10;
            }
        }
        if (str.charAt(0) != '-' && 2147483647 - result < 0) {
            System.out.println("Число не вмещается в Int");
            return -1;
        }
        if (str.charAt(0) == '-' && -result + -2147483648 < 0) {
            System.out.println("Число не вмещается в Int");
            return -1;
        }

        if (str.charAt(0) == '-') result = 0 - result;
        return result;
    }
    public static void main(String[] args) {
        //System.out.println(Integer.MAX_VALUE + " " + Integer.MIN_VALUE);
        int num = toInt(args[0]);
        if (num != -1) {
            System.out.println("Переданное число: " + num);
            System.out.println("Результат умножения на 2: " + num * 2);
        }
        else {
            System.out.println("Завершение работы!");
            System.exit(0);
        }
    }
}
