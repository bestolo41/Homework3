
public class Main {
    public static void main(String[] args) {
        // задание 1

        System.out.println("\n Задание 1 \n");

        byte weeks = 52;
        short days = 365;
        int hours = 8760;
        long seconds = 31536000L;
        float weeksExact02 = 52.14f;
        double weeksExact12 = 52.142857142857;
        System.out.println("Значение переменной weeks с типом byte равно " + weeks);
        System.out.println("Значение переменной days с типом short равно " + days);
        System.out.println("Значение переменной hours с типом int равно " + hours);
        System.out.println("Значение переменной seconds с типом long равно " + seconds);
        System.out.println("Значение переменной weeksExact02 с типом float равно " + weeksExact02);
        System.out.println("Значение переменной weeksExact12 с типом double равно " + weeksExact12);

        // задание 2

        System.out.println("\n Задание 2 \n");

        float a = 27.12f;
        long b = 987678965549L;
        double c = 2.786;
        boolean d = false;
        int e = 569;
        short f = -159;
        long g = 27897L;
        byte h = 67;

        System.out.println("\n все сделано \n");

        // задание 3

        System.out.println("\n Задание 3 \n");

        int firstTeacherStudents = 23, secondTeacherStudents = 27, thirdTeacherStudents = 30, totalNumberOfSheets = 480;
        int sheetsForOneStudent = totalNumberOfSheets / (firstTeacherStudents + secondTeacherStudents + thirdTeacherStudents);
        System.out.println(sheetsForOneStudent);

        // задание 4

        System.out.println("\n Задание 4 \n");

        int efficiencyInOneMinute = 16/2;
        int minutes = 20;
        int minuteInDay = 24*60;
        int minutesInThreeDays = minuteInDay * 3;
        int minutesInMonth = minutesInThreeDays * 10;

        int efficiencyFor20Minutes = minutes*efficiencyInOneMinute;
        int efficiencyForDay = minuteInDay * efficiencyInOneMinute;
        int efficiencyForThreeDays = minutesInThreeDays * efficiencyInOneMinute;
        int efficiencyForMonth = minutesInMonth * efficiencyInOneMinute;
        System.out.println("За 20 минут машина произвела бутылок " + efficiencyFor20Minutes + " штук");
        System.out.println("За 1 день машина произвела бутылок " + efficiencyForDay + " штук");
        System.out.println("За 3 дня машина произвела бутылок " + efficiencyForThreeDays + " штук");
        System.out.println("За 1 месяц машина произвела бутылок " + efficiencyForMonth + " штук");

        // задание 5

        System.out.println("\n Задание 5 \n");

        int totalPaint = 120;
        int whitePaintInOneClass = 2;
        int brownPaintInOneClass = 4;
        int classes = totalPaint / (whitePaintInOneClass + brownPaintInOneClass);
        int totalWhitePaint = classes * whitePaintInOneClass;
        int totalBrownPaint = classes * brownPaintInOneClass;

        System.out.println("В школе, где " + classes + " классов, нужно " + totalWhitePaint +  " банок белой краски и " + totalBrownPaint + " коричневой краски");

        // задание 6

        System.out.println("\n Задание 6 \n");

        int bananas = 5;
        double oneBananaWeight = 80;
        int milk = 200;
        int milk100 = milk / 100;
        double milkWeightIn100Gramm = 105;
        int iceCreamCount = 2;
        double oneIceCreamWeight = 100;
        int eggs = 4;
        double oneEggWeight = 70;

        double breakfastWeightInGramm = (bananas * oneBananaWeight) + (milk100 * milkWeightIn100Gramm) + (iceCreamCount * oneIceCreamWeight) + (eggs * oneEggWeight);
        double breakfastWeightInKilogramm = breakfastWeightInGramm / 1000;
        System.out.println("Вес завтрака спортсмена составляет " + breakfastWeightInKilogramm + " кг");

        // задание 7

        System.out.println("\n Задание 7 \n");

        double purpose = 7;
        double minLossInDay = 0.25;
        double maxLossInDay = 0.5;
        double minDaysCount = purpose / minLossInDay;
        double maxDaysCount = purpose / maxLossInDay;
        double averageDaysCount = (minDaysCount + maxDaysCount)/2;

        System.out.println("Минимальное количество дней для похудания " + minDaysCount + " дней");
        System.out.println("Максимальное количество дней для похудания " + maxDaysCount + " дней");
        System.out.println("В среднем потребуется " + averageDaysCount + " дней");

        // задание 8

        System.out.println("\n Задание 8 \n");

        double mashaSalary = 67760, denisSalary = 83690, kristinaSalary = 76230;
        double percent = 0.1;
        double newMashaSalary = mashaSalary + mashaSalary * percent;
        double newDenisSalary = denisSalary + denisSalary * percent;
        double newKristinaSalary = kristinaSalary + kristinaSalary * percent;
        double mashaDiffYearSalary = (newMashaSalary - mashaSalary) * 12;
        double denisDiffYearSalary = (newDenisSalary - denisSalary) * 12;
        double kristinaDiffYearSalary = (newKristinaSalary - kristinaSalary) * 12;

        System.out.println("Маша теперь получает " + newMashaSalary + " рублей. Годовой доход вырос на " + mashaDiffYearSalary + " рублей");
        System.out.println("Денис теперь получает " + newDenisSalary + " рублей. Годовой доход вырос на " + denisDiffYearSalary + " рублей");
        System.out.println("Кристина теперь получает " + newKristinaSalary + " рублей. Годовой доход вырос на " + kristinaDiffYearSalary + " рублей");


    }
}