import static org.junit.jupiter.api.Assertions.*;

class BonusServiceTest {

    @org.junit.jupiter.api.Test
    void calculate() {
        BonusService service = new BonusService();
        // подготавливаемданные:
        long amount = 1000_60;
        boolean registered = true;

        long expected = 30;
        // вызываемцелевойметод:
        //
        long actual = service.calculate(amount, registered);

        // производимпроверку (сравниваеможидаемыйифактический):
         assertEquals(expected, actual);
    }
    @org.junit.jupiter.api.Test
    void shouldCalculateForRegisteredAndOverLimit() {
        BonusService service = new BonusService();

        // подготавливаем данные:
        long amount = 1_000_000_60;
        boolean registered = true;
        long expected = 500;

        // вызываем целевой метод:
        long actual = service.calculate(amount, registered);

        // производим проверку (сравниваем ожидаемый и фактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateunRegisteredAndOverLimit () {
        BonusService service = new BonusService();
        // подготавливаемданные:
        long amount = 1000000_60;
        boolean registered = false;

        long expected = 500;
        // вызываемцелевойметод:
        //
        long actual = service.calculate(amount, registered);

        // производимпроверку (сравниваеможидаемыйифактический):
        assertEquals(expected, actual);
    }

    @org.junit.jupiter.api.Test
    void shouldCalculateunRegisteredAndUnderLimit () {
        BonusService service = new BonusService();
        // подготавливаемданные:
        long amount = 1000_60;
        boolean registered = false;

        long expected = 10;
        // вызываемцелевойметод:
        //
        long actual = service.calculate(amount, registered);

        // производимпроверку (сравниваеможидаемыйифактический):
        assertEquals(expected, actual);
    }
}