package hsush2017.code_wars.kyu4;

import java.util.Random;
import java.util.Stack;

// https://www.codewars.com/kata/526c7b931666d07889000a3c
public class BefungeInterpreter {
    public String interpret(String code) {
        Befunge befunge = new Befunge(code);

        while (true) {
            if (befunge.get() >= '0' && befunge.get() <= '9') {
                befunge.push(Character.getNumericValue(befunge.get()));
            } else if (befunge.get() == '+') {
                befunge.push(befunge.pop() + befunge.pop());
            } else if (befunge.get() == '-') {
                Integer a = befunge.pop();
                Integer b = befunge.pop();
                befunge.push(b - a);
            } else if (befunge.get() == '*') {
                befunge.push(befunge.pop() * befunge.pop());
            } else if (befunge.get() == '/') {
                Integer a = befunge.pop();
                Integer b = befunge.pop();
                befunge.push(a == 0 ? 0 : b / a);
            } else if (befunge.get() == '%') {
                Integer a = befunge.pop();
                Integer b = befunge.pop();
                befunge.push(a == 0 ? 0 : b % a);
            } else if (befunge.get() == '!') {
                befunge.push(befunge.pop() == 0 ? 1 : 0);
            } else if (befunge.get() == '`') {
                Integer a = befunge.pop();
                Integer b = befunge.pop();
                befunge.push(b > a ? 1 : 0);
            } else if (befunge.get() == '>' || befunge.get() == '<' || befunge.get() == '^' || befunge.get() == 'v') {
                befunge.direction = befunge.get();
            } else if (befunge.get() == '?') {
                char[] dirs = new char[]{'>', '<', '^', 'v'};
                befunge.direction = dirs[new Random().nextInt(dirs.length)];
            } else if (befunge.get() == '_') {
                befunge.direction = befunge.pop() == 0 ? '>' : '<';
            } else if (befunge.get() == '|') {
                befunge.direction = befunge.pop() == 0 ? 'v' : '^';
            } else if (befunge.get() == '"') {
                befunge.next();
                while (befunge.get() != '"') {
                    befunge.push((int) befunge.get());
                    befunge.next();
                }
            } else if (befunge.get() == ':') {
                befunge.push(befunge.isEmpty() ? 0 : befunge.peek());
            } else if (befunge.get() == '\\') {
                Integer i1 = befunge.pop();
                Integer i2 = befunge.isEmpty() ? 0 : befunge.pop();
                befunge.push(i1);
                befunge.push(i2);
            } else if (befunge.get() == '$') {
                befunge.pop();
            } else if (befunge.get() == '.') {
                befunge.appendAsNumber();
            } else if (befunge.get() == ',') {
                befunge.appendAsCharacter();
            } else if (befunge.get() == '#') {
                befunge.next();
            } else if (befunge.get() == 'p') {
                befunge.changeValue(befunge.pop(), befunge.pop(), befunge.pop());
            } else if (befunge.get() == 'g') {
                befunge.push(befunge.get(befunge.pop(), befunge.pop()));
            } else if (befunge.get() == '@') {
                return befunge.print();
            }

            befunge.next();
        }
    }

    static class Befunge {
        int x;
        int y;
        char direction;
        final char[][] map;
        final Stack<Integer> stack;
        final StringBuilder printer;

        public Befunge(String str) {
            direction = '>';

            String[] lines = str.split(System.lineSeparator());
            map = new char[lines.length][];
            for (int i = 0; i < lines.length; i++) {
                map[i] = lines[i].toCharArray();
            }

            stack = new Stack<>();
            printer = new StringBuilder();
        }

        char get() {
            return map[x][y];
        }

        int get(Integer x, Integer y) {
            return map[x][y];
        }

        void next() {
            if (direction == '>') {
                y++;
            } else if (direction == '<') {
                y--;
            } else if (direction == '^') {
                x--;
            } else if (direction == 'v') {
                x++;
            }
        }

        void push(Integer n) {
            stack.push(n);
        }

        Integer pop() {
            return stack.pop();
        }

        boolean isEmpty() {
            return stack.isEmpty();
        }

        Integer peek() {
            return stack.peek();
        }

        public int size() {
            return stack.size();
        }

        public void appendAsNumber() {
            printer.append(pop());
        }

        public void appendAsCharacter() {
            printer.append(Character.valueOf((char) pop().intValue()));
        }

        public String print() {
            return printer.toString();
        }

        public void changeValue(Integer x, Integer y, Integer v) {
            map[x][y] = (char) v.intValue();
        }
    }
}
