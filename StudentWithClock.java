import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

class Student {
        public void learn() {
                System.out.println("Я учусь. .zZ");
        }
}

public class StudentWithClock extends Student {
        @Override
        public void learn() {
                super.learn();
                printCurrentTime();
                System.out.println("Я закончил учиться");
        }

        private void printCurrentTime() {
                LocalTime currentTime = LocalTime.now();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
                System.out.println("Текущее время: " + currentTime.format(formatter));
        }

        public static void main(String[] args) {
                StudentWithClock student = new StudentWithClock();
                student.learn();
        }
}
