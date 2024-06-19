package Controller;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class OrderLogger {
    private static final String ORDER_LOG_FILE = "./src/orders.csv";
    private static final DateTimeFormatter DATE_TIME_FORMATTER = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static void logOrder(List<String[]> orderDetails, double totalPrice) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(ORDER_LOG_FILE, true));
        StringBuilder sb = new StringBuilder();
        sb.append(DATE_TIME_FORMATTER.format(LocalDateTime.now())).append(","); // 주문 시간

        for (String[] item : orderDetails) {
            sb.append(item[0]).append(" "); // 메뉴 이름
        }
        sb.append(",").append(totalPrice).append("\n"); // 총 가격

        writer.write(sb.toString());
        writer.close();
    }
}
