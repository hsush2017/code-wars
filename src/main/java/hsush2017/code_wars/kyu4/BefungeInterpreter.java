package hsush2017.code_wars.kyu4;

import java.util.Arrays;
import java.util.Random;
import java.util.Stack;

// https://www.codewars.com/kata/526c7b931666d07889000a3c
public class BefungeInterpreter {
    int x;
    int y;
    char[][] map;
    Direction d = Direction.RIGHT;
    final Stack<Integer> stack = new Stack<>();
    final StringBuilder printer = new StringBuilder();

    public String interpret(String code) {
        map = initMap(code);

        while (true) {
            char ch = map[x][y];
            switch (ch) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    stack.push(Character.getNumericValue(ch));
                    break;
                case '+':
                    stack.push(stack.pop() + stack.pop());
                    break;
                case '-':
                    stack.push(-1 * stack.pop() + stack.pop());
                    break;
                case '*':
                    stack.push(stack.pop() * stack.pop());
                    break;
                case '/':
                    divide();
                    break;
                case '%':
                    modulo();
                    break;
                case '!':
                    stack.push(stack.pop() == 0 ? 1 : 0);
                    break;
                case '`':
                    greater();
                    break;
                case '>':
                case '<':
                case '^':
                case 'v':
                    d = Direction.parse(ch);
                    break;
                case '?':
                    d = Direction.random();
                    break;
                case '_':
                    d = stack.pop() == 0 ? Direction.RIGHT : Direction.LEFT;
                    break;
                case '|':
                    d = stack.pop() == 0 ? Direction.DOWN : Direction.UP;
                    break;
                case '"':
                    next();
                    stringMode();
                    break;
                case ':':
                    stack.push(stack.isEmpty() ? 0 : stack.peek());
                    break;
                case '\\':
                    swap();
                    break;
                case '$':
                    stack.pop();
                    break;
                case '.':
                    printer.append(stack.pop());
                    break;
                case ',':
                    printer.append(Character.valueOf((char) stack.pop().intValue()));
                    break;
                case '#':
                    next();
                    break;
                case 'p':
                    map[stack.pop()][stack.pop()] = (char) (int) stack.pop();
                    break;
                case 'g':
                    stack.push((int) map[stack.pop()][stack.pop()]);
                    break;
                case '@':
                    return printer.toString();
                default:
                    break;
            }

            next();
        }
    }

    private void stringMode() {
        while (true) {
            if (map[x][y] == '"') {
                return;
            }

            stack.push((int) map[x][y]);

            next();
        }
    }

    private void next() {
        x += d.x;
        y += d.y;
    }

    private void swap() {
        int a = stack.pop();
        int b = stack.isEmpty() ? 0 : stack.pop();

        stack.push(a);
        stack.push(b);
    }

    private void greater() {
        Integer a = stack.pop();
        Integer b = stack.pop();

        stack.push(b > a ? 1 : 0);
    }

    private void modulo() {
        int a = stack.pop();
        int b = stack.pop();

        stack.push(a == 0 ? 0 : b % a);
    }

    private void divide() {
        int a = stack.pop();
        int b = stack.peek();

        stack.push(a == 0 ? 0 : b / a);
    }

    private char[][] initMap(String str) {
        String[] lines = str.split(System.lineSeparator());
        char[][] map = new char[lines.length][];

        for (int i = 0; i < lines.length; i++) {
            map[i] = lines[i].toCharArray();
        }

        return map;
    }

    enum Direction {
        RIGHT(0, 1, '>'), LEFT(0, -1, '<'), UP(-1, 0, '^'), DOWN(1, 0, 'v');

        final int x;
        final int y;
        final char symbol;

        Direction(int x, int y, char symbol) {
            this.x = x;
            this.y = y;
            this.symbol = symbol;
        }

        static Direction random() {
            return values()[new Random().nextInt(values().length)];
        }

        static Direction parse(char symbol) {
            return Arrays.stream(values())
                    .filter(d -> symbol == d.symbol)
                    .findFirst()
                    .orElseThrow(() -> new NullPointerException("unknown symbol" + symbol));
        }
    }
}
