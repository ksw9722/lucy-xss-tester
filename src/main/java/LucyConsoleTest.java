import com.nhncorp.lucy.security.xss.XssFilter;

public class LucyConsoleTest {
    public static void main(String[] args) {
        // Lucy 필터 초기화
        XssFilter filter = XssFilter.getInstance("embed.xml");

        // 테스트할 입력 문자열

        String testInput = "<object><param name=\"src\" value=\"http://7w4emabd99qfgq6qtk2clcwq1h78v5ju.oastify.com/test\"></object>";

        // 필터를 적용한 결과
        String filteredOutput = filter.doFilter(testInput);

        // 결과 출력
        System.out.println("Original Input: " + testInput);
        System.out.println("Filtered Output: " + filteredOutput);
    }
}