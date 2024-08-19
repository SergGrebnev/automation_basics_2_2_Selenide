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

import static com.codeborne.selenide.Selectors.withText;
import static com.codeborne.selenide.Selenide.*;


public class CardWithDeliveryTest {


    @BeforeEach
    public void setUp() {
        open("http://localhost:9999");


    }

    @Test
    public void testFormCardHappyPath() {
        $("[data-test-id='city'] input").setValue("Новосибирск");
        $("[data-test-id ='date'] input").sendKeys(Keys.SHIFT, Keys.HOME); // выделение текста кнопками Shift+Home
        LocalDate date = LocalDate.now(); //получаем текущую дату
        date = date.plusDays(4); //прибавляем 4 дня
        String textDate = date.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")); //перевод даты в формат по шаблону
        $("[data-test-id ='date'] input").sendKeys(textDate);
        $("[data-test-id='name'] input").setValue("Гребнев Сергей");
        $("[data-test-id='phone'] input").setValue("+79130000000");
        $("[data-test-id='agreement']").click();
        $(".button").click();

        $("[data-test-id='notification'] .notification__content")
                .shouldHave(Condition.text("Встреча успешно забронирована на " + textDate), Duration.ofSeconds(15)) //ассерт проверки текста
                .shouldBe(Condition.visible) //ассерт проверки видимости
        ;

    }

}
