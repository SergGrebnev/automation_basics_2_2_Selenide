//Для запуска тестируемого приложения, находясь в корне проекта,
// выполните в терминале команду: java -jar ./artifacts/app-card-delivery.jar
// Используется selenide

package ru.netology.Alfa;

import com.codeborne.selenide.Condition;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Keys;

import java.time.Duration;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.*;


public class CardWithDeliveryTest {


    @BeforeEach
    public void setUp() {
        open("http://localhost:9999/");


    }

    @Test
    public void testFormCardHappyPath() {
        $("[data-test-id='city'] input").setValue("Новосибирск");
//        $("[placeholder='Дата встречи']").sendKeys(SHIFT, HOME);
//        LocalDate date = LocalDate.now();
//        date.plusDays(4);
//        String textDate = date.format(DateTimeFormatter.ofPattern("dd MM yyyy"));
//        $("[placeholder='Дата встречи']").sendKeys(textDate);
        $("[data-test-id='name'] input").setValue("Гребнев Сергей");
        $("[data-test-id='phone'] input").setValue("+79130000000");
        $("[data-test-id='agreement']").click();
        //$("[type=button]").click();
        //$(withText("Успешно!")).shouldBe(Condition.visible, Duration.ofSeconds(15));
//        driver.findElement(By.cssSelector("[data-test-id='name'] input")).sendKeys("Сергей");
//        driver.findElement(By.cssSelector("[data-test-id='phone'] input")).sendKeys("+79130000000");
//        driver.findElement(By.cssSelector("[data-test-id='agreement']")).click();
//        driver.findElement(By.className("button")).click();
//
       //String text = $(".notification__content").getText();
//
        //assertEquals("Встреча успешно забронирована на", text.trim()); //.trim() - удаляет лишние пробелы в начале и в конце строки



//        $("[data-test-id='city'] input").setValue("Краснодар");
//        $("[data-test-id ='date'] input").sendKeys(Keys.chord(Keys.SHIFT, Keys.HOME), Keys.BACK_SPACE);
//        $("[data-test-id ='date'] input").setValue(planningDate);
//        $("[data-test-id='name'] input ").setValue("Велев Максим");
//        $("[data-test-id='phone'] input ").setValue("+79756249171");
//        $("[data-test-id='agreement']").click();
//        $("[type=button] .button__content").click();
//        $x(".//div[@class='notification__title']")
//                .should(text("Успешно"), Duration.ofSeconds(5000))
//                .shouldBe(Condition.visible);
//        $("[data-test-id='notification'] .notification__content")
//                .shouldHave(Condition.text("Встреча успешно забронирована на " + planningDate), Duration.ofSeconds(5000))
//                .shouldBe(Condition.visible);

    }

/*
    @Test
    public void testFormCardInvalidName() {
        driver.findElement(By.cssSelector("[data-test-id='name'] input")).sendKeys("Serg");
        driver.findElement(By.cssSelector("[data-test-id='phone'] input")).sendKeys("+79130000000");
        driver.findElement(By.cssSelector("[data-test-id='agreement']")).click();
        driver.findElement(By.className("button")).click();

        String text = driver.findElement(By.cssSelector("[data-test-id='name'].input_invalid .input__sub")).getText();

        assertEquals("Имя и Фамилия указаные неверно. Допустимы только русские буквы, пробелы и дефисы.", text.trim()); //.trim() - удаляет лишние пробелы в начале и в конце строки

    }


    @Test
    public void testFormCardEmptyName() {
        driver.findElement(By.cssSelector("[data-test-id='phone'] input")).sendKeys("+79130000000");
        driver.findElement(By.cssSelector("[data-test-id='agreement']")).click();
        driver.findElement(By.className("button")).click();

        String text = driver.findElement(By.cssSelector("[data-test-id='name'].input_invalid .input__sub")).getText();

        assertEquals("Поле обязательно для заполнения", text.trim()); //.trim() - удаляет лишние пробелы в начале и в конце строки

    }

    @Test
    public void testFormCardInvalidPhone() {
        driver.findElement(By.cssSelector("[data-test-id='name'] input")).sendKeys("Сергей");
        driver.findElement(By.cssSelector("[data-test-id='phone'] input")).sendKeys("15-480");
        driver.findElement(By.cssSelector("[data-test-id='agreement']")).click();
        driver.findElement(By.className("button")).click();

        String text = driver.findElement(By.cssSelector("[data-test-id='phone'].input_invalid .input__sub")).getText();

        assertEquals("Телефон указан неверно. Должно быть 11 цифр, например, +79012345678.", text.trim()); //.trim() - удаляет лишние пробелы в начале и в конце строки

    }

    @Test
    public void testFormCardEmptyPhone() {
        driver.findElement(By.cssSelector("[data-test-id='name'] input")).sendKeys("Сергей");
        driver.findElement(By.cssSelector("[data-test-id='agreement']")).click();
        driver.findElement(By.className("button")).click();

        String text = driver.findElement(By.cssSelector("[data-test-id='phone'].input_invalid .input__sub")).getText();

        assertEquals("Поле обязательно для заполнения", text.trim()); //.trim() - удаляет лишние пробелы в начале и в конце строки

    }

    @Test
    public void testFormCardNoCheckbox() {
        driver.findElement(By.cssSelector("[data-test-id='name'] input")).sendKeys("Сергей");
        driver.findElement(By.cssSelector("[data-test-id='phone'] input")).sendKeys("+79130000000");
        driver.findElement(By.className("button")).click();

        String text = driver.findElement(By.cssSelector("[data-test-id='agreement'].input_invalid .checkbox__text")).getText();

        assertEquals("Я соглашаюсь с условиями обработки и использования моих персональных данных и разрешаю сделать запрос в бюро кредитных историй", text.trim()); //.trim() - удаляет лишние пробелы в начале и в конце строки

    }


}

*/
}
