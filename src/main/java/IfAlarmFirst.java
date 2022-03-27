public class IfAlarmFirst {

    public static void main(String[] args) {

        boolean proof = countCustomers(31);
        if (proof) {
            System.out.println("Noch Platz verfügbar");
        } else {
            System.out.println("Zu viele Leute im Laden");
        }

    }

    public static boolean countCustomers(int quantity) {
        return quantity <= 30;
    }

}