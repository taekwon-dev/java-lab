package Conversion;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ConversionTest {

    @DisplayName("[Char to Int] 숫자로 구성된 문자열, 각 문자를 정수형으로 변환")
    @Test
    void typeConverison_Char2Int() {

        //given
        String input = "00111";

        //when
        for (int i = 0; i < input.length(); i++) {
            int result = input.charAt(i) - '0';
            System.out.print(result + " ");
        }


    }
}
