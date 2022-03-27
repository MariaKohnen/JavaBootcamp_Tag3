public class IfAlarmSecond {
    public static void main(String[] args) {
        String result= informator(countCustomers(29, "gelb"));
        System.out.println(result);
    }

    public static boolean countCustomers (int quantity, String alarm) {
        if (alarm == "rot") {
            if (quantity <= 0) {
                return true;
            }
        }else if (alarm == "gelb") {
            if (quantity < 30) {
                return true;
            }
        }else if (alarm == "grün") {
            if (quantity < 60) {
                return true;
            }
        }
        return false;
    }

    public static String informator(Boolean result) {
        if (result == true) {
            return "Es können noch Leute rein";
        } else {
            return "Der Laden ist zu voll.";
        }

    }

}

//    public static void countCustomers(int quantity, String alarm) {
//        if (alarm == "rot") {
//            if (quantity == 0) {
//                System.out.println("Alles okay.");
//            } else {
//                System.out.println("Zu viele Leute im Laden.");
//            }
//        }
//        if (alarm == "gelb") {
//            if (quantity < 30) {
//                System.out.println("Es können noch Leute rein.");
//            } else {
//                System.out.println("Zu viele Leute im Laden.");
//            }
//        }
//        if (alarm == "grün") {
//            if (quantity < 60) {
//                System.out.println("Es können noch Leute rein.");
//            } else {
//                System.out.println("Zu viele Leute im Laden.");
//            }
//        }
//
//    }

