package org.example;

public class ExamplesOfMiniProject1 {
    // Sayı bulma - Find number
    int[] numbers = {1, 2, 3, 4, 5, 6};
    int findNumber = 10;
    boolean isResult = false;

    public ExamplesOfMiniProject1(int... findNumbers) {
        Example(findNumbers);
    }

    public void Example(int... findNumbers) {
        isResult = FindNumber(findNumbers);
        if (isResult) {
            System.out.println(this.findNumber + " was found");
        } else {
            System.out.println("it was not found");
        }
    }

    public boolean FindNumber(int... findNumbers) {
        for (int findNumber : findNumbers) {
            this.findNumber = findNumber;
            for (int number : numbers) {
                if (number == findNumber)
                    return true;
            }
        }
        return false;
    }
}
