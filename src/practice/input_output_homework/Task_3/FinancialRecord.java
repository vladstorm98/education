package practice.input_output_homework.Task_3;

public class FinancialRecord {
    private int incomes;
    private int outcomes;

    public FinancialRecord(int incomes, int outcomes) {
        this.incomes = incomes;
        this.outcomes = outcomes;
    }

    public void setIncomes(int incomes) {
        this.incomes = incomes;
    }

    public void setOutcomes(int outcomes) {
        this.outcomes = outcomes;
    }

    public int getIncome() {
        return incomes;
    }

    public int getOutcome() {
        return outcomes;
    }
}
