package github;


import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Selenide.*;

public class FindSelenideTest {

    @Test
    void shouldFindSelenideRepository(){

        open("https://github.com/");
        $("[name=q]").setValue("selenide").pressEnter();
        var firstLinkFound=$$(".repo-list li").first().$("a");
        firstLinkFound.click();
        $("h1").shouldHave(Condition.text("selenide / selenide"));


    }


}
