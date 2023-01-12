import javax.sound.midi.Soundbank;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        // Savings
        task1();
        System.out.println();
        // Numbers 1 to 10 and back
        task2();
        System.out.println();
        // Population in 10 years
        task3();
        System.out.println();
        // Vasily's savings account Part 1
        task4();
        System.out.println();
        //Vasily's savings account Part 2
        task5();
        System.out.println();
        //Vasily's savings account Part 3
        task6();
        System.out.println();
        //Find friday
        task7();
        System.out.println();
        //Comet
        task8();
        System.out.println();

    }

    public static void task1(){
        System.out.println("\tSavings:");
        int savingsPerMonth = 15000, savingsTotal = 2_459_000, months = 0, savingsTemp = 0;
        while(savingsTemp<savingsTotal){
            savingsTemp +=savingsPerMonth;
            months++;
            System.out.printf("Месяц %d, сумма накоплений равна %d рублей\n",months,savingsTemp);
        }

    }

    public static void task2(){
        System.out.println("\tNumbers 1 to 10 and back:");
        int i = 1;
        while(i<=10){
            System.out.printf(" %d",i++);
        }
        System.out.println();
        i--;
        for (;i>0;i--){
            System.out.printf(" %d",i);
        }
        System.out.println();
    }

    public static void task3(){
        System.out.println("\tPopulation in 10 years:");
        int populationTotal = 12_000_000, years = 1;
        double birthRate = (double) 17/1000;
        double deathRate = (double) 8/1000;
        int populationIncrease = 0, populationDecrease = 0;

        while(years<=10){
            populationIncrease = (int) (populationTotal*birthRate);
            populationDecrease = (int) (populationTotal*deathRate);

            populationTotal += (populationIncrease - populationDecrease);
            System.out.printf("Год %d, численность населения составляет %d\n",years,populationTotal);
            years++;
        }


    }

    public static void task4(){
        System.out.println("\tVasily's savings account Part 1:");
        double accountTotal = 15000, targetSavings = 12_000_000;
        double monthlyInterest = 7;
        int months = 0;
        while (accountTotal<=targetSavings){
            accountTotal += accountTotal*(monthlyInterest/100);
            months++;
            System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей\n",months,accountTotal);
        }
    }

    public static void task5(){
        System.out.println("\tVasily's savings account Part 2:");
        double accountTotal = 15000, targetSavings = 12_000_000;
        double monthlyInterest = 7;
        int months = 0;
        while (accountTotal<=targetSavings){
            accountTotal += accountTotal*(monthlyInterest/100);
            months++;
            if(months%6==0){
                System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей\n",months,accountTotal);
            }
        }
    }

    public static void task6(){
        System.out.println("\tVasily's savings account Part 3:");
        double accountTotal = 15000, targetSavings = 12_000_000;
        double monthlyInterest = 7;
        int months = 0;
        int monthsIn9Years = 12*9;
        while (months<monthsIn9Years){
            accountTotal += accountTotal*(monthlyInterest/100);
            months++;
            if(months%6==0){
                System.out.printf("Месяц %d, сумма накоплений равна %.2f рублей\n",months,accountTotal);
            }
        }
    }

    public static void task7(){
        System.out.println("\tFind friday:");
        int friday = 3, daysTotal = 31;
        while (friday<=daysTotal){
            System.out.printf("Сегодня пятница, %d-е число. Необходимо подготовить отчет.\n", friday);
            friday +=7;
        }
    }

    public static void task8(){
        System.out.println("\tComet:");
        int yearInc = 79; //Comet passes every 79th year
        int currentYear = LocalDate.now().getYear(); //current year
        int startingYear = currentYear - 200;
        int endingYear = currentYear + 100;
        int yearTemp = 0;

        while(yearTemp<=endingYear){

            if (yearTemp>=startingYear && yearTemp<=currentYear){
                System.out.println(yearTemp);
            }

            if (yearTemp>=currentYear){
                System.out.println(yearTemp);
            }

            yearTemp += yearInc;
        }

    }
}