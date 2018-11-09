package kyu7;

public class ToLeetSpeak {
    static String toLeetSpeak (final String speak) {
        String result = speak
                            .replace('A', '@')
                            .replace('B', '8')
                            .replace('C', '(')
                            .replace('E', '3')
                            .replace('G', '6')
                            .replace('H', '#')
                            .replace('I', '!')
                            .replace('L', '1')
                            .replace('O', '0')
                            .replace('S', '$')
                            .replace('T','7')
                            .replace('Z', '2');

        return result;
    }

}
