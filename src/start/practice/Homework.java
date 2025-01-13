package start.practice;

public class Homework {
    private static final String OPEN_TAG = "<data>";
    private static final String CLOSE_TAG = "</data>";
    private static final String EMAIL_SYMBOL = "@";
    private static final String DELIMITER_SYMBOL = ";";
    private static final String MASKING_SYMBOL = "*";
    private static final String DOT_SYMBOL = ".";
    private static final String SPACE_SYMBOL = " ";




    public static void main(String[] args) {
        double height = 1.93;
        int weight = 91;

        double index = weight / (height * height);
        System.out.println(index);
//        ------------------------------------

        int childAge = 18;

        if (childAge < 6) {
            System.out.println("Child goes to children garden");
        } else if (childAge < 11) {
            System.out.println("Child goes to school");
        } else if (childAge < 17) {
            System.out.println("Child goes to high school");
        } else {
            System.out.println("Child goes to university");
        }
//        ------------------------------------

        boolean chicken = true;
        boolean vegetables = true;
        boolean sour = true;
        boolean toast = true;
        boolean sausage = true;
        boolean eggs = true;

        boolean caesar = chicken & vegetables & sour & toast;
        boolean olivie = vegetables & (sausage || chicken) & eggs;

        if (caesar) {
            System.out.println("Cooks Caesar");
        } else if (olivie) {
            System.out.println("Cooks Olivye");
        } else if (vegetables) {
            System.out.println("Cooks vegetable salad");
        } else {
            System.out.println("No ingredients");
        }
//        ------------------------------------

        String text = "234";
        String some_text = "some_text";

        int number = Integer.parseInt(text);
        System.out.println(number + some_text.length());
//        ------------------------------------

        int a = 3;
        int b = 5;

        System.out.println((a + b) * (a + b));
//        ------------------------------------

        boolean hasFuel = true;
        boolean hasElectricsProblem = false;
        boolean hasMotorProblem = false;
        boolean hasTransmissionProblem = true;
        boolean hasWheelsProblem = true;

        int countProblem = 0;
        double price = 0;


        if (hasFuel) {
            if (hasMotorProblem) {
                price += 10_000;
                countProblem++;
                System.out.println("Repair Motor - $10000");
            }

            if (hasElectricsProblem) {
                price += 5_000;
                countProblem++;
                System.out.println("Repair Electric - $5000");
            }

            if (hasTransmissionProblem) {
                price += 4_000;
                countProblem++;
                System.out.println("Repair Transmission - $4000");
            }

            if (hasWheelsProblem) {
                price += 2_000;
                countProblem++;
                System.out.println("Repair Wheels - $2000");
            }
        } else {
            price += 1000;
            System.out.println("Consultation - $1000");
        }

        if (hasTransmissionProblem && (hasElectricsProblem || hasMotorProblem)) {
            price *= 0.8;
        } else if (countProblem > 1) {
            price *= 0.9;
        }

        System.out.println("Total : $" + price);
//        ------------------------------------


        String data = "<client>(some data)<data>380679998585;test@yandex.ru;Ivanov Ivan Ivanovich</data></client>";
        System.out.println(masking(data));
    }

    public static String masking(String text) {
        int indexStartData = text.indexOf(OPEN_TAG) + OPEN_TAG.length();
        int indexEndData = text.indexOf(CLOSE_TAG, indexStartData);

        if (indexEndData - indexStartData > 0) {
            String clientData = text.substring(indexStartData, indexEndData);
            return new StringBuilder()
                    .append(text, 0, indexStartData)
                    .append(maskingHelper(clientData))
                    .append(text.substring(indexEndData))
                    .toString();
        } else {
            return text;
        }
    }

    private static String maskingHelper(String data) {
        StringBuilder result = new StringBuilder();
        for (String field : data.split(DELIMITER_SYMBOL)) {
            if (field.contains(EMAIL_SYMBOL)) {
                maskingEmail(field, result);
            } else if (hasOnlyDigits(field)) {
                maskingNumber(field, result);
            } else {
                maskingName(field, result);
            }
        }
        return result.substring(0, result.length() - 1);
    }

    private static void maskingEmail(String field, StringBuilder result) {
        int emailIndex = field.indexOf(EMAIL_SYMBOL);
        int dotIndex = field.indexOf(DOT_SYMBOL, emailIndex);

        result.append(new StringBuilder()
                .append(field, 0, emailIndex - 1)
                .append(MASKING_SYMBOL)
                .append(EMAIL_SYMBOL)
                .append(MASKING_SYMBOL.repeat(dotIndex - emailIndex - 1))
                .append(field.substring(dotIndex))
                .append(DELIMITER_SYMBOL));
    }

    private static boolean hasOnlyDigits(String field) {
        String digits = "0123456789";
        for (String letter : field.split("")) {
            if (!digits.contains(letter)) {
                return false;
            }
        }
        return true;
    }

    private static void maskingNumber(String field, StringBuilder result) {
        result.append(new StringBuilder()
                .append(field, 0, 4)
                .append(MASKING_SYMBOL.repeat(3))
                .append(field, 8, field.length())
                .append(DELIMITER_SYMBOL));
    }

    private static void maskingName(String field, StringBuilder result) {
        int spaceIndex1 = field.indexOf(SPACE_SYMBOL);
        int spaceIndex2 = field.indexOf(SPACE_SYMBOL, spaceIndex1 + 1);

        result.append(new StringBuilder()
                .append(field, 0, 1)
                .append(MASKING_SYMBOL.repeat(spaceIndex1 - 2))
                .append(field, spaceIndex1 - 1, spaceIndex1)
                .append(SPACE_SYMBOL)
                .append(field, spaceIndex1 + 1, spaceIndex2)
                .append(field, spaceIndex2, spaceIndex2 + 2)
                .append(DOT_SYMBOL)
                .append(DELIMITER_SYMBOL));
    }
}
