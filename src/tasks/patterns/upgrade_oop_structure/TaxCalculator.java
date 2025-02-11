package tasks.patterns.upgrade_oop_structure;

// ❌ Проблемы:
// Магические строки ("USA", "Germany" и т. д.).
// Сложно расширять (если добавится новая страна, придётся менять код).
// Нет OOP (по сути, это просто большая if-else конструкция).
// 🔹 Задача:
// Убери if-else, используя Enum + Strategy.
// Сделай так, чтобы добавление новой страны не требовало менять существующий код.

public class TaxCalculator {
    public static double calculateTax(String country, double income) {
        if (country.equals("USA")) {
            return income * 0.3;
        } else if (country.equals("Germany")) {
            return income * 0.25;
        } else if (country.equals("UK")) {
            return income * 0.2;
        } else {
            throw new IllegalArgumentException("Unsupported country: " + country);
        }
    }
}